package com.curso.android.app.practica.counter.view

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.curso.android.app.practica.counter.R
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get: Rule
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun setUp() {
    }

    @After
    fun tearDown() {
    }

//resultado de test , con string distintos
    @Test
    fun testCompareTextFieldsAndButtonClickDiferentes() {
        // Ingresa texto
        Espresso.onView(ViewMatchers.withId(R.id.text1))
            .perform(ViewActions.typeText("hola"))

        Espresso.onView(ViewMatchers.withId(R.id.text2))
            .perform(ViewActions.typeText("chau"))

        // Cierra el teclado
        Espresso.closeSoftKeyboard()

        //  clic en el botón
        Espresso.onView(ViewMatchers.withId(R.id.compareButton))
            .perform(ViewActions.click())

        // Verifica que el resultado sea visible en el TextView
        Espresso.onView(ViewMatchers.withId(R.id.resultText))
            .check(ViewAssertions.matches(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)))


    }

    // resultado de ingreso de texto con string iguales.

    @Test
    fun testCompareTextFieldsAndButtonClick() {
        // Ingresa texto
        Espresso.onView(ViewMatchers.withId(R.id.text1))
            .perform(ViewActions.typeText("pepe"))

        Espresso.onView(ViewMatchers.withId(R.id.text2))
            .perform(ViewActions.typeText("pepe"))

        // Cierra el teclado
        Espresso.closeSoftKeyboard()

        //  clic en el botón
        Espresso.onView(ViewMatchers.withId(R.id.compareButton))
            .perform(ViewActions.click())

        // Verifica que el resultado
        Espresso.onView(ViewMatchers.withId(R.id.resultText))
            .check(ViewAssertions.matches(ViewMatchers.withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)))


    }
}