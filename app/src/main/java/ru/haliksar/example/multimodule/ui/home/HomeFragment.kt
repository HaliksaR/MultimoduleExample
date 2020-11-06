package ru.haliksar.example.multimodule.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import ru.haliksar.example.multimodule.core.BaseFragment
import ru.haliksar.example.multimodule.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override val viewModel: HomeViewModel by viewModels()

    override fun binding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)

    override fun otherSetups() {
        viewModel.posts.observe(viewLifecycleOwner) {
            binding.posts.text = it.joinToString("\n")
        }
    }
}