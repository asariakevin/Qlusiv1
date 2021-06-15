package io.github.qlusiv1.screens.myCollection

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import io.github.qlusiv1.R

class MyCollectionAdapter : RecyclerView.Adapter<MyCollectionAdapter.ViewHolder>() {

    var data = List(20){
        CollectionItem(
            "When the time comes",
            "Kevin Asaria",
            "20Ksh",
            "30"
        )
    }

    override fun getItemCount(): Int = data.size

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyCollectionAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.general_artist_collection_list_item,parent,false)
        return MyCollectionAdapter.ViewHolder(itemView)




    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val collectionItem = data[position]
        holder.artistName.text = collectionItem.artistName
        holder.support.text = collectionItem.support
        holder.supports.text = collectionItem.supports
        holder.title.text = collectionItem.title
    }

    class ViewHolder(val item: View) : RecyclerView.ViewHolder(item){

        val title : TextView = item.findViewById(R.id.title_general_artist_collection_item)
        val artistName: TextView = item.findViewById(R.id.artist_name_general_artist_collection_item)
        val support: TextView = item.findViewById(R.id.support_amount_general_artist_collection_item)
        val supports: TextView = item.findViewById(R.id.supports_genearl_artist_collection_item)


    }
}