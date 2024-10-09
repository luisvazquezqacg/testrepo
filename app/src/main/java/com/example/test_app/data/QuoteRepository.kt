package com.example.test_app.data

import com.example.test_app.data.database.dao.QuoteDao
import com.example.test_app.data.database.entities.QuoteEntity
import com.example.test_app.data.model.QuoteModel
import com.example.test_app.data.model.QuoteProvider
import com.example.test_app.data.network.QuoteService
import com.example.test_app.domain.model.Quote
import com.example.test_app.domain.model.toDomain
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api : QuoteService,
    private val quoteDao: QuoteDao
) {
    suspend fun getAllQuotesFromApi():List<Quote> {
        val response = api.getQuotes()
        return response.map { it.toDomain() }
    }

    suspend fun getAllQuotesFromDatabase():List<Quote>{
        val response = quoteDao.getAllQuotes()
        return response.map { it.toDomain() }
    }

    suspend fun insertQuotes(quotes:List<QuoteEntity>) {
        quoteDao.insertAll(quotes)
    }

    suspend fun clearQuotes() {
        quoteDao.deleteAllQuotes()
    }
}