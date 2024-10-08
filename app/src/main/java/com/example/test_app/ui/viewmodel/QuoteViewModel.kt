package com.example.test_app.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.test_app.data.model.QuoteModel
import com.example.test_app.data.model.QuoteProvider
import com.example.test_app.domain.GetQuotesUseCase
import com.example.test_app.domain.GetRandomQuoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuoteViewModel @Inject constructor(
    private val getQuotesUseCase : GetQuotesUseCase,
    private val getRandomQuoteUseCase : GetRandomQuoteUseCase
) : ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()
    val isLoading = MutableLiveData<Boolean>()
    fun randomQuote(){
        isLoading.postValue(true)
        val quote = getRandomQuoteUseCase()
        if(quote != null){
            quoteModel.postValue(quote)
        }
        isLoading.postValue(false)
    }

    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result: List<QuoteModel>? = getQuotesUseCase()
            if(!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }
}