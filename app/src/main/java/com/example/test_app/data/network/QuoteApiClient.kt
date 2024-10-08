package com.example.test_app.data.network

import com.example.test_app.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET(".json")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>
}