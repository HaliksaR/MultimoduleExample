package ru.haliksar.example.multimodule.domain.entity

data class Post(
    val title: String,
    val description: String,
    val quote: String,
    val postTime: String
) {
    override fun toString(): String =
        "title: $title\n" +
                "description: $description\n" +
                "quote: $quote\n" +
                "postTime: $postTime\n"
}