package com.example.myspace.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    // We create the text we'll use in the home fragment
    private val _text = MutableLiveData<String>().apply {
        value = "Bienvenue sur votre espace !"
    }
    val text: LiveData<String> = _text
}