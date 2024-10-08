package com.example.test_app.domain

import com.example.test_app.data.QuoteRepository
import com.example.test_app.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? =repository.getAllQuotes()

}