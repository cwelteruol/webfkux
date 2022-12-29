package com.example.webfkux.controller

import com.example.webfkux.document.Playlist
import com.example.webfkux.service.PlaylistService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

//@RequestMapping("/playlist")
//@RestController   comentado para não dar conflito com o handler
class PlaylistController {

    @Autowired
    lateinit var service: PlaylistService

    @GetMapping
    fun getPlaylist() = service.findAll()

    @GetMapping("/{id}")
    fun getPlaylistById(@PathVariable id: String) = service.findById(id)

    @PostMapping
    fun save(@RequestBody playlist: Playlist) = service.save(playlist)
}