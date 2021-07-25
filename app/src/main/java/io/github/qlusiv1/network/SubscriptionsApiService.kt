package io.github.qlusiv1.network

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.Deferred
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET


// The base URL where our API is
private const val BASE_URL = "http://15cff8686da1.ngrok.io"

/* Moshi Makes it easy to parse JSON into objects
you can use GSON instead if you want*/

private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

//Here is our retrofit instance

private val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .baseUrl(BASE_URL)
        .build()

//Then we are going to create the interface
//which is going to help to handle our GET method
//to call the API*/

interface SubscriptionsApiService{

    @GET("fans/1/subscriptions.json")
    fun getSubscriptions():
            Deferred<List<Subscription>>
}

/* Singleton to create this instance only once
and get it ready every time we call it. */

object  SubscriptionsApi {
    val retrofitService : SubscriptionsApiService by lazy {
        retrofit.create(SubscriptionsApiService::class.java)
    }
}
