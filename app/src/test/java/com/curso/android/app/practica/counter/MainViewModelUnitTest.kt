package com.curso.android.app.practica.counter


import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.curso.android.app.practica.counter.view.MainViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.*
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@OptIn(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
class MainViewModelUnitTest {

    private lateinit var viewModel: MainViewModel



    @get:Rule
    val instantTaskRule = InstantTaskExecutorRule()
    private val dispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(dispatcher)
        viewModel = MainViewModel()
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun mainViewModel_CheckInitialValue() = runTest {


        viewModel.compararTextos("pepe", "pepef")

    }
    @Test
    fun test1() = runTest {
        assertEquals(0, currentTime)
        delay(5000)
        assertEquals(5000, currentTime)
    }


    @Test
    fun `when viewmodel is created at the first time, get all quotes and set the first value`() = runTest{
        //Given
        val quote = listOf(viewModel.compararTextos("Holi", "Aris"))


        assert(viewModel.compararTextos("sas","as") == quote.first())
    }



    @Test
    fun mainViewModel_TestCompareStrings() = runBlocking {
        // Arrange: Configurar las condiciones de la prueba
        val text1 = "Hello"
        val text2 = "Hello"

        // Act: Llamar a la función que se está probando
        val result = viewModel.compararTextos(text1, text2)

        // Assert: Verificar el resultado
        val expectedMessage = "!! :) SON SIMILARES!!"
        assertEquals(expectedMessage, result)
    }


    @Test
    fun mainViewModel_TestCompareStrings1() = runBlocking {
        // Arrange: Configurar las condiciones de la prueba
        val text1 = "soy"
        val text2 = "un texto distinto "

        // Act: Llamar a la función que se está probando
        val result = viewModel.compararTextos(text1, text2)

        // Assert: Verificar el resultado
        val expectedMessage = "!! :( SON DIFERENTES !!"
        assertEquals(expectedMessage, result)
    }

}








