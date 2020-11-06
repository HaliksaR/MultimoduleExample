package ru.haliksar.example.multimodule.feature.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import ru.haliksar.example.multimodule.feature.dashboard.databinding.FragmentDashboardBinding
import ru.haliksar.example.multimodule.libruary.core.BaseFragment

class DashboardFragment : BaseFragment<FragmentDashboardBinding, DashboardViewModel>() {

	override val viewModel: DashboardViewModel by viewModels()

	override fun binding(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): FragmentDashboardBinding = FragmentDashboardBinding.inflate(inflater, container, false)

	override fun otherSetups() {
		viewModel.posts.observe(viewLifecycleOwner) {
			binding.posts.text = it.joinToString("\n\n")
		}
	}
}