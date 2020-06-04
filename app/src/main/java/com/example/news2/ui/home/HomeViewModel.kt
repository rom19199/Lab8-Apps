package com.example.news2.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.news2.


class HomeViewModel : ViewModel() {

    private val _status = MutableLiveData<GithubApiStatus>()
    val status: LiveData<GithubApiStatus>
        get() = _status


    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text
}