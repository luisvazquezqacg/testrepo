package com.example.test_app.domain

import com.example.test_app.data.QuoteRepository
import com.example.test_app.data.model.QuoteModel
import com.example.test_app.data.model.QuoteProvider
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(
    private val quoteProvider: QuoteProvider
){
    operator fun invoke(): QuoteModel?{
        val quotes =  quoteProvider.quotes
        if(quotes.isNotEmpty()){
            val randomNumber = quotes.indices.random()
            return quotes[randomNumber]
        }
        return null;
    }
}