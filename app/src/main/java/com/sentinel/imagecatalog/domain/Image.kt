package com.sentinel.imagecatalog.data.model

data class Image(
    private val id: String,
    private val description: String,
    private val urls: Urls,
    private val likes: Long,
    private val sponsorship: Sponsorship
)
