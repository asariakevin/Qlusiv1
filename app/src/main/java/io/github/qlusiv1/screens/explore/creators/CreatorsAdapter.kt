package io.github.qlusiv1.screens.explore.creators

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.github.qlusiv1.R
import io.github.qlusiv1.database.models.Creator
import io.github.qlusiv1.network.Subscription
import io.github.qlusiv1.screens.subscriptions.SubscriptionClickListener



class CreatorsAdapter : RecyclerView.Adapter<CreatorsAdapter.ViewHolder>() {

    var data = listOf<Creator>()
        set(value){
            field = value
            notifyDataSetChanged()
        }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

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
        val creator: Creator = data[position]
        holder.creatorName.text = creator.name
        holder.creatorNumberOfFollowers.text = creator.followers
        holder.creatorNumberOfPlays.text = creator.plays

    }


}
