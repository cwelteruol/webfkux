package com.example.webfkux.repository

import com.example.webfkux.document.Playlist
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

interface PlaylistRepository: ReactiveMongoRepository<Playlist, String>
