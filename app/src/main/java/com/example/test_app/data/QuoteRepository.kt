package com.example.test_app.data

import com.example.test_app.data.model.QuoteModel
import com.example.test_app.data.model.QuoteProvider
import com.example.test_app.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api : QuoteService,
    private val quoteProvider: QuoteProvider
) {
    suspend fun getAllQuotes():List<QuoteModel> {
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}