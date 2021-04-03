package com.fabianospdev.booklist.service

import retrofit2.http.GET

interface BookService {
    @GET("books")
    fun list()
}