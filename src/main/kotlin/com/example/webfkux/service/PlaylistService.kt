package com.example.webfkux.service

import com.example.webfkux.document.Playlist
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface PlaylistService {

    fun findAll(): Flux<Playlist>
    fun findById(id:String): Mono<Playlist>
    fun save(playlist: Playlist) : Mono<Playlist>

}