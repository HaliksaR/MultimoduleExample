package ru.haliksar.example.multimodule.data.mapper

import ru.haliksar.example.multimodule.data.dto.PostDto
import ru.haliksar.example.multimodule.domain.entity.Post


fun Post.toDto() = PostDto(title, description, quote, postTime)

fun PostDto.toEntity() = Post(title, description, quote, postTime)

fun List<Post>.toDtoList() = map { it.toDto() }

fun List<PostDto>.toEntityList() = map { it.toEntity() }