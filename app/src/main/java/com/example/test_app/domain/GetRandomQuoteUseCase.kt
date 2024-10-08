package com.example.test_app.domain

import com.example.test_app.data.QuoteRepository
import com.example.test_app.data.model.QuoteModel
import com.example.test_app.data.model.QuoteProvider

class GetRandomQuoteUseCase {
    private val repository = QuoteRepository()
    operator fun invoke(): QuoteModel?{
        val quotes =  QuoteProvider.quotes
        if(quotes.isNotEmpty()){
            val randomNumber = quotes.indices.random()
            return quotes[randomNumber]
        }
        return null;
    }
}