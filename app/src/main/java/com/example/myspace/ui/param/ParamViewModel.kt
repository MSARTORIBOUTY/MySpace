package com.example.myspace.ui.param

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ParamViewModel : ViewModel(){

    private val _text = MutableLiveData<String>().apply {
        value = "Paramètres et aide"
    }
    val text: LiveData<String> = _text
}