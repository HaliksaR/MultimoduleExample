package ru.haliksar.example.multimodule.domain.repository

import ru.haliksar.example.multimodule.domain.entity.Post

interface PostRepository {
    fun getList(): List<Post>
}