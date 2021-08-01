package io.github.qlusiv1.screens.explore.creators

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import io.github.qlusiv1.R
import io.github.qlusiv1.database.models.Creator
import io.github.qlusiv1.network.Subscription
import io.github.qlusiv1.network.dataTransferObjects.models.creatorRelated.CreatorProfile
import io.github.qlusiv1.screens.subscriptions.SubscriptionClickListener



class CreatorsAdapter(val clickListener: CreatorListItemClickListener) : RecyclerView.Adapter<CreatorsAdapter.ViewHolder>() {

    var data = listOf<CreatorProfile>()
        set(value){
            field = value
            notifyDataSetChanged()
        }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val creatorListItemViewGroup = itemView.findViewById<ViewGroup>(R.id.creator_list_item_group_view)
        val creatorImageView : ImageView = itemView.findViewById(R.id.creator_imageview)
        val creatorName: TextView = itemView.findViewById(R.id.creator_name)
        val creatorNumberOfFollowers: TextView = itemView.findViewById(R.id.creator_number_of_followers)
        val creatorNumberOfPlays: TextView = itemView.findViewById(R.id.creator_number_of_plays)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.creator_list_item,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val creator: CreatorProfile = data[position]
        holder.creatorImageView.load(creator.imageUrl)
        holder.creatorName.text = creator.name
        holder.creatorNumberOfFollowers.text = creator.numberOfFollowers.toString()
        holder.creatorNumberOfPlays.text = creator.numberOfPlays.toString()

        holder.creatorListItemViewGroup.setOnClickListener{
            clickListener.onclick(creator.creatorId)
        }
    }


}

class CreatorListItemClickListener( val clickListener: (Long) -> Unit){
    fun onclick( creatorId : Long) = clickListener(creatorId)
}