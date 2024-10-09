package com.example.test_app.domain.model

import com.example.test_app.data.database.entities.QuoteEntity
import com.example.test_app.data.model.QuoteModel

data class Quote(val quote:String,val author:String)

fun QuoteModel.toDomain() = Quote(quote,author)
fun QuoteEntity.toDomain() = Quote(quote,author)