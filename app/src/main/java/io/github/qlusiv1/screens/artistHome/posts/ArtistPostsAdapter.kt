package io.github.qlusiv1.screens.artistHome.posts

import io.github.qlusiv1.database.models.Post



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.github.qlusiv1.R

class ArtistPostsAdapter: RecyclerView.Adapter<ArtistPostsAdapter.ViewHolder>() {

    var data = listOf<Post>()
        set(value){
            field = value
            notifyDataSetChanged()
        }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val title: TextView = itemView.findViewById(R.id.post_title)




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.post_artist_post_list_item,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val post = data[position]
        holder.title.text = post.title

    }


}

class SubscriptionClickListener( val clickListener : (Int) -> Unit){
    fun onclick(subscriptionId : Int) = clickListener(subscriptionId)
}