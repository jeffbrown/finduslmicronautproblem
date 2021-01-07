package com.example

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/game_compositions")
class CompositionsController {

    @Produces(MediaType.APPLICATION_JSON)
    @Get(uri = "/")
    fun getCompositions(): Iterable<String> {
        return listOf("something")
    }
}