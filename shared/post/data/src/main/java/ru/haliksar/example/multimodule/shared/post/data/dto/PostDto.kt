package ru.haliksar.example.multimodule.shared.post.data.dto


annotation class NetworkData

@NetworkData
data class PostDto(
    val title: String,
    val description: String,
    val quote: String,
    val postTime: String
)