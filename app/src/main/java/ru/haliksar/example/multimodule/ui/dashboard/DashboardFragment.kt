package ru.haliksar.example.multimodule.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import ru.haliksar.example.multimodule.R
import ru.haliksar.example.multimodule.core.BaseFragment
import ru.haliksar.example.multimodule.databinding.FragmentDashboardBinding

class DashboardFragment : BaseFragment<FragmentDashboardBinding, DashboardViewModel>() {

	override val viewModel: DashboardViewModel by viewModels()

	override fun binding(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): FragmentDashboardBinding = FragmentDashboardBinding.inflate(inflater, container, false)

	override fun otherSetups() {
		viewModel.posts.observe(viewLifecycleOwner) {
			binding.posts.text = it.joinToString("\n")
		}
	}
}