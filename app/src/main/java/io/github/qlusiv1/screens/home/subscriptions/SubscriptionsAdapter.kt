package io.github.qlusiv1.screens.subscriptions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import io.github.qlusiv1.R
import io.github.qlusiv1.network.Subscription
import org.w3c.dom.Text

class SubscriptionsAdapter(val clickListener: SubscriptionClickListener) : RecyclerView.Adapter<SubscriptionsAdapter.ViewHolder>() {

    var data = listOf<Subscription>()
    set(value){
        field = value
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val artistName: TextView = itemView.findViewById(R.id.artist_name)
        val profileImage: ImageView = itemView.findViewById(R.id.profile_image)
        val numberOfPosts : TextView = itemView.findViewById(R.id.actual_number_of_new_posts)
        val numberOfCatalogue : TextView = itemView.findViewById(R.id.actual_number_of_new_catalogues)
        val numberOfNewMessages : TextView = itemView.findViewById(R.id.actual_number_of_new_messages)




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.subscription_list_item,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val subscription = data[position]
        holder.profileImage.load(subscription.creatorImageUri)
        holder.artistName.text = subscription.creatorName
       // holder.artistName.setOnClickListener{clickListener.onclick(subscription.id)}
    }


}

class SubscriptionClickListener( val clickListener : (Int) -> Unit){
    fun onclick(subscriptionId : Int) = clickListener(subscriptionId)
}