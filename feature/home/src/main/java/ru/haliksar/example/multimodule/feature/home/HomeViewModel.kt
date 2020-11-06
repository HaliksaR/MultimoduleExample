package ru.haliksar.example.multimodule.feature.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.haliksar.example.multimodule.shared.post.domain.entity.Post
import ru.haliksar.example.multimodule.shared.post.domain.usecase.GetPostsUseCase

class HomeViewModel(
    private val getPostsUseCase: GetPostsUseCase = PostInjector.useCase()
) : ViewModel() {

    private val _posts = MutableLiveData<List<Post>>().apply {
        value = getPostsUseCase()
    }

    val posts: LiveData<List<Post>> = _posts
}