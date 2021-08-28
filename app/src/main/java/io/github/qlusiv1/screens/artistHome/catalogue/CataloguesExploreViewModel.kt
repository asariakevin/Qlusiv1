package io.github.qlusiv1.screens.artistHome.catalogue

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.github.qlusiv1.Selections
import io.github.qlusiv1.network.SubscriptionsApi
import io.github.qlusiv1.network.dataTransferObjects.models.Project
import kotlinx.coroutines.launch
import java.lang.Exception

class CataloguesExploreViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    val projects: MutableLiveData<List<Project>> = MutableLiveData()
    var selectedArtistId: Long = Selections.selectedArtistId

    fun getProjects(){

        viewModelScope.launch {

            val projectsDeferred = SubscriptionsApi.retrofitService.getCreatorProjects(selectedArtistId)

            try {
                projects.value = projectsDeferred.await()
            }catch (e: Exception){
                Log.d("Catalogue", "Something went wrong")
            }
        }


    }

    fun supportProject(fanId: Long, projectId:Long){
        viewModelScope.launch {
            val project = SubscriptionsApi.retrofitService.supportProject(fanId,projectId)

            try {
               var done = project.await()
            }catch (e: Exception){
                Log.d("Catalogue support", "something went wrong")
            }
        }
    }
}