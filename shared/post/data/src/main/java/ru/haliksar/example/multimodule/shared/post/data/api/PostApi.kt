package ru.haliksar.example.multimodule.shared.post.data.api

import ru.haliksar.example.multimodule.shared.post.data.dto.PostDto

interface PostApi {

    fun getPosts(): List<PostDto>
}

class RetroProxy: PostApi {

    override fun getPosts(): List<PostDto> = listOf(
        PostDto("title1"," description1", "quote1", "11:11"),
        PostDto("title2"," description2", "quote2", "12:12"),
        PostDto("title3"," description3", "quote3", "13:13"),
        PostDto("title4"," description4", "quote4", "14:14"),
        PostDto("title5"," description5", "quote5", "15:15"),
        PostDto("title6"," description6", "quote6", "16:16"),
    )
}
