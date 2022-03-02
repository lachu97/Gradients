package com.example.gradients

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gradients.ui.theme.GradientsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GradientsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(modifier = Modifier.fillMaxSize().wrapContentSize()) {

                        // Create a linear gradient that shows red in the top left corner
                        // and blue in the bottom right corner
                        val linear = Brush.linearGradient(listOf(Color.Red, Color.Blue))

                        Box(modifier = Modifier.size(120.dp).background(linear))

                        Spacer(modifier = Modifier.size(20.dp))

                        // Create a radial gradient centered about the drawing area that is green on
                        // the outer
                        // edge of the circle and magenta towards the center of the circle
                        val radial = Brush.radialGradient(listOf(Color.Green, Color.Magenta))
                        Box(modifier = Modifier.size(120.dp).background(radial))

                        Spacer(modifier = Modifier.size(20.dp))

                        // Create a radial gradient centered about the drawing area that is green on
                        // the outer
                        // edge of the circle and magenta towards the center of the circle
                        val sweep = Brush.sweepGradient(listOf(Color.Cyan, Color.Magenta))
                        Box(modifier = Modifier.size(120.dp).background(sweep))
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GradientsTheme {
        Greeting("Android")
    }
}