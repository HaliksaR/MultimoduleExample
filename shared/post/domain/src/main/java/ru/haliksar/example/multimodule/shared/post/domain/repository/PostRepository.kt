package ru.haliksar.example.multimodule.shared.post.domain.repository

import ru.haliksar.example.multimodule.shared.post.domain.entity.Post

interface PostRepository {
    fun getList(): List<Post>
}