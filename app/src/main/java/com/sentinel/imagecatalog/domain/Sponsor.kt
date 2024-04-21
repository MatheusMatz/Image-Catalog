package com.sentinel.imagecatalog.data.model

data class Sponsor(
    private val id: String,
    private val username: String,
    private val name: String,
    private val firstName: String,
    private val portfolioUrl: String,
    private val bio: String,
    private val location: String,
    private val profileImage: ProfileImage
)
