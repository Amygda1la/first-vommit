package com.example.fullfocus

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fullfocus.ui.theme.FullFocusTheme
import kotlin.math.sqrt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FullFocusTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    BussenesCardBox()
                    Name()
                    Job()
                    Links()
                }
            }
        }
    }
}

@Composable
fun BussenesCardBox () {
    Column(modifier = Modifier
        .background(Color(0xFFCBF3CC))
        .padding(top = 300.dp)) {
            val androidImage = painterResource(id = R.drawable.android_text_logo)
            val androidFace = painterResource(id = R.drawable.ic_launcher_foreground)
        Box(contentAlignment = Alignment.BottomCenter, modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .size(120.dp)
            .background(
                color = Color(
                    0xFF59C0F3
                )
            )
            .scale(1.2F)) {
            Image(painter = androidFace, contentDescription = "android_robot",modifier = Modifier
                .padding(bottom = 20.dp)
                .scale(1.6F))
            Image(painter = androidImage, contentDescription = "android_image", modifier = Modifier
                .scale(1.0F)
                .padding(top = 40.dp))


        }
    }
}
@Composable
fun Name () {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
        .padding(top = 530.dp)
        .scale(2.0F)) {
            Text(text = "Evgeny Blyudov",color = Color.Black)
            
    }
}
@Composable
fun Job () {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
        .padding(top = 480.dp)
        .scale(1.1F)) {
            Text(text = "Akveo Software Developer", color = Color(0xFF047C07))

    }
}
@Composable
fun  Links () {
        val emailImage = painterResource(id = R.drawable._42638)
        val phoneImage = painterResource(id = R.drawable.office_phone_icon__25)
        val vectorImage = painterResource(id = R.drawable.vector_illustration_of_simple_share_icon__public_domain_vectors_23)
    Box(contentAlignment = Alignment.BottomStart) {
        Row() {
            Image(painter = emailImage, contentDescription = "email_logo", modifier = Modifier
                .padding(start = 80.dp, bottom = 45.dp)
                .size(25.dp))
            Text(text = "eygeniehenie@gmail.com",modifier = Modifier.padding(start = 20.dp),color = Color.Black)
        }
        Row() {
            Image(painter = phoneImage, contentDescription = "phone_logo", modifier = Modifier
                .padding(start = 80.dp, bottom = 115.dp)
                .size(25.dp))
            Text(text = "+79522029988",modifier = Modifier.padding(start = 20.dp),color = Color.Black)
        }
        Row() {
            Image(painter = vectorImage, contentDescription = "vector_logo", modifier = Modifier
                .padding(start = 80.dp, bottom = 80.dp)
                .size(25.dp))
            Text(text = "@yadayn",modifier = Modifier.padding(start = 20.dp),color = Color.Black)
        }


    }

    }
