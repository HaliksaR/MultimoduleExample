package ru.haliksar.example.multimodule.data.dto


annotation class NetworkData

@NetworkData
data class PostDto(
    val title: String,
    val description: String,
    val quote: String,
    val postTime: String
)