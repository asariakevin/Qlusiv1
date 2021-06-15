package io.github.qlusiv1.screens.myCollection

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyCollectionViewModel : ViewModel() {

    var collectionList = MutableLiveData<List<CollectionItem>>()

    init{
        collectionList.value = List(20){
            CollectionItem(
                "When the time comes",
                "Kevin Asaria",
                "20Ksh",
                "30"
            )
        }

    }
}