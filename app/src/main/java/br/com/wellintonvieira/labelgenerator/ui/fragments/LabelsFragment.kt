package br.com.wellintonvieira.labelgenerator.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.wellintonvieira.labelgenerator.databinding.FragmentLabelsBinding

class LabelsFragment : Fragment() {

    private lateinit var binding: FragmentLabelsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentLabelsBinding.inflate(inflater, container, false)
        return binding.root
    }
}