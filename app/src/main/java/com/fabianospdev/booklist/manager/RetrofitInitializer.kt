package com.fabianospdev.booklist.manager

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {

    fun init() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://github.com/FabianoSouzaPereira/bookslistorganizer/blob/master/.mockend.json/:80")
            .addConverterFactory(GsonConverterFactory.create())
    }
}