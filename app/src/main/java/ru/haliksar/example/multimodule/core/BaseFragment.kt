package ru.haliksar.example.multimodule.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding, out VM: ViewModel> : Fragment() {

    protected abstract val viewModel: VM

    private var _binding: VB? = null
    protected val binding get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = binding(inflater, container, savedInstanceState)
        otherSetups()
        return binding.root
    }

    protected abstract fun binding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): VB

    protected abstract fun otherSetups()

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}