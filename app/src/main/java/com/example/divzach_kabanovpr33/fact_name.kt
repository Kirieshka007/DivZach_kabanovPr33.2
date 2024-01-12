package com.example.divzach_kabanovpr33

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class fact_name : Fragment() {

    companion object {
        fun newInstance() = fact_name()
    }

    private lateinit var viewModel: FactNameViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fact_name, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[FactNameViewModel::class.java]
        // TODO: Use the ViewModel
    }

}