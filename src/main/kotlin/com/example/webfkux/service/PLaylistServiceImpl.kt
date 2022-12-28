package com.example.webfkux.service

import com.example.webfkux.document.Playlist
import com.example.webfkux.repository.PlaylistRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class PLaylistServiceImpl: PlaylistService {

    @Autowired
    lateinit var repository: PlaylistRepository

    override fun findAll() = repository.findAll()

    override fun findById(id: String) = repository.findById(id)

    override fun save(playlist: Playlist) = repository.save(playlist)
}