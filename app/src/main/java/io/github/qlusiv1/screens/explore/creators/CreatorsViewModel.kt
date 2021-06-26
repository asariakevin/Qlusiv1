package io.github.qlusiv1.screens.explore.creators

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.github.qlusiv1.database.models.Creator
import io.github.qlusiv1.database.models.Creators

class CreatorsViewModel : ViewModel() {
    val creators = MutableLiveData<List<Creator>>()

    init {
        creators.value = Creators.creatorList
    }
}