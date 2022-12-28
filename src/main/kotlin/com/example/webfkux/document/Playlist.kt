package com.example.webfkux.document


import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Playlist(
    @Id
    var id: String?,
    var name: String
)