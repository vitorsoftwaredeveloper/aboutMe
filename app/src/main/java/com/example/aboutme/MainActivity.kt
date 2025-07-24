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
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite // ou outro ícone
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AboutMeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    GreetingImage(modifier = Modifier)
                }
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
                modifier = Modifier.weight(1f).fillMaxHeight(),
                contentAlignment = Alignment.BottomEnd

            ){
                Column(verticalArrangement = Arrangement.Bottom, modifier = Modifier.fillMaxSize()){
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
                        fontSize = 44.sp,
                        modifier = Modifier.padding(12.dp).fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        )

                    Text(
                        text = "Android Developer Extraordinary",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.hsl(146f,0.75f,0.30f),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(16.dp,0.dp,16.dp,0.dp).fillMaxWidth(),
                    )
                }
            }
        }

        Row(modifier = Modifier.weight(1f)) {
            Box(
                modifier = Modifier.weight(1f).fillMaxHeight(),
                contentAlignment = Alignment.BottomEnd
            ){
                Column( modifier = Modifier.padding(24.dp),){
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Icon(
                            imageVector = Icons.Filled.Phone,
                            contentDescription = "Phone number",
                            tint = Color.hsl(146f,0.75f,0.30f),
                        )
                        Spacer(modifier = Modifier.width(24.dp))
                        Text(
                            text = "+55 (83) 9 9952-3137",
                            fontSize = 18.sp,
                            modifier = Modifier.width(180.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Icon(
                            imageVector = Icons.Filled.Share,
                            contentDescription = "contact",
                            tint = Color.hsl(146f,0.75f,0.30f),
                        )
                        Spacer(modifier = Modifier.width(24.dp))
                        Text(
                            text = "@AndroidVitor",
                            fontSize = 18.sp,
                            modifier = Modifier.width(180.dp)
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Icon(
                            imageVector = Icons.Filled.Email,
                            contentDescription = "Email",
                            tint = Color.hsl(146f,0.75f,0.30f),
                        )
                        Spacer(modifier = Modifier.width(24.dp))
                        Text(
                            text = "test@mail.com",
                            fontSize = 18.sp,
                            modifier = Modifier.width(180.dp)
                        )
                    }
                }
            }
        }
    }
}