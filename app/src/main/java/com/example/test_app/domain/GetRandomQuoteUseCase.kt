package com.example.test_app.domain

import com.example.test_app.data.QuoteRepository
import com.example.test_app.data.model.QuoteModel
import com.example.test_app.data.model.QuoteProvider
import com.example.test_app.domain.model.Quote
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(
    private val repository: QuoteRepository
){
    suspend operator fun invoke(): Quote?{
        val quotes =  repository.getAllQuotesFromDatabase()
        if(quotes.isNotEmpty()){
            val randomNumber = quotes.indices.random()
            return quotes[randomNumber]
        }
        return null;
    }
}