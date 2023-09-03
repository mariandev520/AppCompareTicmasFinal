package com.curso.android.app.practica.counter.model

import java.text.SimpleDateFormat
import java.util.*

class DateTimeModel {

    // funcion llamado a la hora y dia se muestra pantalla principal del usuario

    fun getCurrentTimeAndDay(): Pair<String, String> {
        val currentTime = SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(Date())
        val spanishLocale = Locale("es", "ES") // predeterimanda en español se puede modificar.
        val currentDay = SimpleDateFormat("EEEE", spanishLocale).format(Date())
        return Pair(currentTime, currentDay)
    }
}

