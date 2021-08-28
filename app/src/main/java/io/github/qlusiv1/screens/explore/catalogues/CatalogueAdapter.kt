package io.github.qlusiv1.screens.explore.catalogues

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import io.github.qlusiv1.R
import io.github.qlusiv1.Selections
import io.github.qlusiv1.network.dataTransferObjects.models.Project

class CatalogueAdapter(val clickListener: CatalogueAdapterClickListener ) : RecyclerView.Adapter<CatalogueAdapter.ViewHolder>() {

    var data = listOf<Project>()
        set(value){
            field = value
            notifyDataSetChanged()
        }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val imageView = itemView.findViewById<ImageView>(R.id.thumbnail_specific_artist_collection_item)
        val title: TextView = itemView.findViewById(R.id.title_specific_artist_collection_item)
        val support: TextView = itemView.findViewById(R.id.actual_support_amount_specific_artist_collection_item)
        val supports: TextView = itemView.findViewById(R.id.actual_supports_number_specific_artist_collection_item)
        val supportButton: Button = itemView.findViewById(R.id.support_button_specific_artist_collection_item)

    }

    override fun getItemCount(): Int = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val itemView = LayoutInflater.from(parent.context)
           .inflate(R.layout.specific_artist_collection_list_item,parent,false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val project = data[position]
        holder.imageView.load(project.videoUrl) // change to thumbnail url
        holder.title.text = project.title
        holder.support.text = project.support.toString()
        holder.supports.text = project.supports.toString()
        holder.supportButton.setOnClickListener{ clickListener.onclick(Selections.fanId, project.id) }


    }
}

// take this to utils file
class CatalogueAdapterClickListener( val clickListener : (Long, Long) -> Unit){
    fun onclick(fanId: Long, projectId: Long) = clickListener(fanId,projectId)
}
