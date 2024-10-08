package com.example.test_app.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.test_app.model.QuoteModel
import com.example.test_app.model.QuoteProvider

class QuoteViewModel: ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()
    fun randomQuote(){
        val currentQuote =  QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}