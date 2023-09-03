package com.curso.android.app.practica.counter

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.curso.android.app.practica.counter.view.MainViewModel
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.curso.android.app.practica.counter", appContext.packageName)
    }



    private lateinit var viewModel: MainViewModel

    @Before
    fun setUp() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        viewModel = MainViewModel()
    }

    // el test comprueba el resultado sea similar a la variable expectedMessage como son distintas da error controlado.
    @Test
    fun mainViewModel_TestCompareStrings() {
        // Arrange: Configurar las condiciones de la prueba
        val text1 = "Hello"
        val text2 = "Hello"

        // Act: test para llamada funcion
        val result = viewModel.compararTextos(text1, text2)

        // Assert: Verificar el resultado
        val expectedMessage = "SON SIMILARES" //
        assertEquals(expectedMessage, result)
    }

    // test que prueba resultado similares.
    @Test
    fun mainViewModel_TestCompareStringsTwo() {
        // Arrange: Configurar las condiciones de la prueba
        val text1 = "Hello"
        val text2 = "Hello"

        // Act: test para llamada funcion
        val result = viewModel.compararTextos(text1, text2)

        // Assert: Verificar el resultado
        val expectedMessage = "¡¡ :) SON SIMILARES !! " //
        assertEquals(expectedMessage, result)
    }



}
