package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import kotlin.math.PI
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}

class Calculator {
    fun calculateCircleArea(radius: Double): Double {
        return PI * radius * radius
    }

    fun calculateSquareArea(sideLength: Double): Double {
        return sideLength * sideLength
    }

    fun calculateRectangleArea(length: Double, width: Double): Double {
        return length * width
    }

    fun calculateTriangleArea(base: Double, height: Double): Double {
        return 0.5 * base * height
    }
}

fun main() {
    val calculator = Calculator()


    val circleArea = calculator.calculateCircleArea(5.0)
    println("Площа кола: $circleArea")

    val squareArea = calculator.calculateSquareArea(4.0)
    println("Площа квадрата: $squareArea")


    val rectangleArea = calculator.calculateRectangleArea(3.0, 6.0)
    println("Площа прямокутника: $rectangleArea")

    val triangleArea = calculator.calculateTriangleArea(4.0, 5.0)
    println("Площа трикутника: $triangleArea")

}