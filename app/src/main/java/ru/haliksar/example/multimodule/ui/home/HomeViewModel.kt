package ru.haliksar.example.multimodule.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.haliksar.example.multimodule.domain.entity.Post
import ru.haliksar.example.multimodule.domain.usecase.GetPostsUseCase
import ru.haliksar.example.multimodule.injector.PostInjector

class HomeViewModel(
    private val getPostsUseCase: GetPostsUseCase = PostInjector.useCase()
) : ViewModel() {

    private val _posts = MutableLiveData<List<Post>>().apply {
        value = getPostsUseCase()
    }

    val posts: LiveData<List<Post>> = _posts
}