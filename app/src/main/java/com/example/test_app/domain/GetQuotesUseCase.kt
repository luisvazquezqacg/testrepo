package com.example.test_app.domain

import com.example.test_app.data.QuoteRepository
import com.example.test_app.data.database.entities.toDatabase
import com.example.test_app.data.model.QuoteModel
import com.example.test_app.domain.model.Quote
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(
    private val repository : QuoteRepository
) {

    //Just The First Time
    // the first time it recovers the data from the server
    suspend operator fun invoke():List<Quote>{
        val quotes = repository.getAllQuotesFromApi()
        return if(quotes.isNotEmpty()){
            repository.clearQuotes()
            repository.insertQuotes(quotes.map { it.toDatabase() })
            quotes
        }else{
            repository.getAllQuotesFromDatabase()
        }

    }
}