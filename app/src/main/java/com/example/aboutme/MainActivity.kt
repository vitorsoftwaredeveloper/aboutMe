package com.example.aboutme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aboutme.ui.theme.AboutMeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AboutMeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {}
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingImage(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize().background(Color.hsl(126f,0.31f,0.87f))) {
        Row(modifier = Modifier.weight(1f)) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()

            ){
                Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()){
                    Row(
                        modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
                    ){
                        val logo = painterResource(R.drawable.android_logo)

                        Image(
                            painter = logo,
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .height(100.dp)
                                .width(100.dp)
                                .background(Color.hsl(198f,0.78f,0.15f))
                        )
                    }

                    Text(
                        text = "Vitor Soares",
//                        fontWeight = FontWeight.Bold,
                        fontSize = 44.sp,
                        modifier = Modifier
                            .padding(12.dp)
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center,

                        )
                    Text(
                        text = "Android Developer Extraordinary",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.hsl(146f,0.75f,0.30f),
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(16.dp,0.dp,16.dp,0.dp)
                            .fillMaxWidth(),
                    )
                }
            }
        }
        Row(modifier = Modifier.weight(1f)) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
//                    .background(Color(0xFFB69DF8))
            ){
                Column(verticalArrangement = Arrangement.Center,modifier = Modifier.fillMaxSize()){
//                    Text(
//                        text = "Row composable",
//                        fontWeight = FontWeight.Bold,
//                        fontSize = 18.sp,
//                        modifier = Modifier.padding(0.dp,0.dp,0.dp,6.dp)
//                            .fillMaxWidth(),
//                        textAlign = TextAlign.Center,
//
//                        )
//                    Text(
//                        text = "A layout composable that places its children in a horizontal sequence.",
//                        fontSize = 16.sp,
//                        modifier = Modifier.padding(16.dp,0.dp,16.dp,0.dp),
//                        textAlign = TextAlign.Justify
//                    )
                }
            }
        }
    }
}