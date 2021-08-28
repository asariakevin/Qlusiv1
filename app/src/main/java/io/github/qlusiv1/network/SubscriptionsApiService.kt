package io.github.qlusiv1.network

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import io.github.qlusiv1.network.dataTransferObjects.models.Post
import io.github.qlusiv1.network.dataTransferObjects.models.Project
import io.github.qlusiv1.network.dataTransferObjects.models.creatorRelated.CreatorProfile
import kotlinx.coroutines.Deferred
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


// The base URL where our API is
private const val BASE_URL = "http://ad06-154-159-252-30.ngrok.io"

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

    @GET("artists/explore.json")
    fun creatorsExplore(): Deferred<List<CreatorProfile>>

    @GET("artists/{id}/profile.json")
    fun getCreatorProfile(@Path("id") id: Long): Deferred<CreatorProfile>
    @GET("artists/{id}/posts.json")
    fun getCreatorPosts(@Path("id") id: Long): Deferred<List<Post>>
    @GET("artists/{id}/projects.json")
    fun getCreatorProjects(@Path("id") id: Long): Deferred<List<Project>>

    @GET("artists/subscribe.json")
    fun subscribeToArtist(
        @Query("artist_id") artistId: Long,
        @Query("fan_id") fan_id: Long
    ): Deferred<CreatorProfile>

    @GET("artists/support.json")
    fun supportProject(
        @Query("fan_id") fanId: Long,
        @Query("project_id") projectId: Long
    ) : Deferred<Project>
}

/* Singleton to create this instance only once
and get it ready every time we call it. */

object  SubscriptionsApi {
    val retrofitService : SubscriptionsApiService by lazy {
        retrofit.create(SubscriptionsApiService::class.java)
    }
}
