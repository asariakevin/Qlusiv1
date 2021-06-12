package io.github.qlusiv1.screens.subscriptions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.github.qlusiv1.R
import io.github.qlusiv1.network.Subscription

class SubscriptionsAdapter : RecyclerView.Adapter<SubscriptionsAdapter.ViewHolder>() {

    var data = listOf<Subscription>()
    set(value){
        field = value
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val artistName: TextView = itemView.findViewById(R.id.artist_name)




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.subscription_list_item,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val subscription = data[position]
        holder.artistName.text = subscription.name
    }


}