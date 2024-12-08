package com.forever3.proyectofinal.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.forever3.proyectofinal.R
import com.forever3.proyectofinal.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // Esta propiedad solo es válida entre onCreateView y onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflamos el binding del fragmento
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Accedemos al TextView y asignamos un texto directamente
        val textView: TextView = binding.textHome
        textView.text = getString(R.string.title_home)  // O cualquier otro texto que desees asignar

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}