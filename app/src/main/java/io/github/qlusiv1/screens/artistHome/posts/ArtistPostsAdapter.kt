package io.github.qlusiv1.screens.artistHome.posts

import io.github.qlusiv1.network.dataTransferObjects.models.Post



import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import io.github.qlusiv1.R

class ArtistPostsAdapter: RecyclerView.Adapter<ArtistPostsAdapter.ViewHolder>() {

    var data = listOf<Post>()
        set(value){
            field = value
            notifyDataSetChanged()
        }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val title: TextView = itemView.findViewById(R.id.post_title)
        val postImage: ImageView = itemView.findViewById(R.id.post_image)
        val postLikes: TextView = itemView.findViewById(R.id.post_number_of_likes)




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.post_artist_post_list_item,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val post = data[position]
        holder.title.text = post.caption
        holder.postImage.load(
            post.imageUrl
        )

    }


}

class SubscriptionClickListener( val clickListener : (Int) -> Unit){
    fun onclick(subscriptionId : Int) = clickListener(subscriptionId)
}