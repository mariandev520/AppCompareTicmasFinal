package com.curso.android.app.practica.counter.view

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.curso.android.app.practica.counter.R
import com.curso.android.app.practica.counter.databinding.ActivityMainBinding
import com.curso.android.app.practica.counter.model.DateTimeModel
import com.curso.android.app.practica.counter.model.UIEventHandlerModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var uiEventHandler: UIEventHandlerModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        uiEventHandler = UIEventHandlerModel(binding, viewModel)

        uiEventHandler.initUI()

        // llamado al metodo para mostrar fecha y hora layout usuario.

        val dateTimeModel = DateTimeModel()
        val timeAndDayText = findViewById<TextView>(R.id.timeAndDayText)


        val (formattedTime, formattedDay) = dateTimeModel.getCurrentTimeAndDay()

        // resultado de la hora en loyout usuario
        val formattedText = getString(R.string.time_and_day_format, formattedTime, formattedDay)
        timeAndDayText.text = formattedText


    }
}




