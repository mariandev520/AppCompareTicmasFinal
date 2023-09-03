package com.curso.android.app.practica.counter.model

import android.view.View
import com.curso.android.app.practica.counter.databinding.ActivityMainBinding
import com.curso.android.app.practica.counter.view.MainViewModel

class UIEventHandlerModel(
    private val binding: ActivityMainBinding,
    private val viewModel: MainViewModel
) {

    // funcion que comprueba los string y agrega limite de caracteres y campos vacios
    fun initUI() {
        binding.compareButton.setOnClickListener {
            val text1 = binding.text1.text.toString()
            val text2 = binding.text2.text.toString()
            val limiteCaracteres = 30 // Define aquí tu límite de caracteres

            val result = when {
                text1.isNullOrEmpty() || text2.isNullOrEmpty() -> "Los campos están vacíos"
                text1.length > limiteCaracteres || text2.length > limiteCaracteres -> "Excedió el límite de caracteres"
                else -> viewModel.compararTextos(text1, text2)
            }

            binding.resultText.text = result

            binding.resultText.postDelayed({
                binding.resultText.visibility = View.GONE
            }, 6000)
            binding.resultText.visibility = View.VISIBLE
        }
    }
}
