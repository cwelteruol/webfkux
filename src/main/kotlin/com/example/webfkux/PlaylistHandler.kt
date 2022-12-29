package com.example.webfkux

import com.example.webfkux.document.Playlist
import com.example.webfkux.service.PlaylistService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters.fromPublisher
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body
import reactor.core.publisher.Mono

@Component
class PlaylistHandler {

    @Autowired
    lateinit var service: PlaylistService

    fun findAll(request: ServerRequest): Mono<ServerResponse> {
        return ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(service.findAll())
    }

    fun findById(request: ServerRequest): Mono<ServerResponse> {
        val id: String = request.pathVariable("id")
        return ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(service.findById(id))
    }

    fun save(request: ServerRequest): Mono<ServerResponse> {
        return ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(
                fromPublisher(
                    request.bodyToMono(Playlist::class.java).flatMap(service::save),
                    Playlist::class.java
                )
            )
    }
}