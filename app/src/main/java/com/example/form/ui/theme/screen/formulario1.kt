package com.example.form.ui.theme.screen

import android.icu.text.ListFormatter.Width
import android.text.SpannableString
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.form.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalText(){
    val pagerState = rememberPagerState(initialPage = 0) {
        2
    }
    Box(modifier = Modifier.fillMaxSize()){
        HorizontalPager(state = pagerState) {
                page -> when(page){
                    0 -> Main2(page)
                    1 -> Main(page)
            }
        }
    }
}

@Composable
fun Main2(page : Int) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFFFFFFF))) {
        Content2()
    }
}

@Composable
fun TextfielMain(){
    var user by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf(" ")
    }

    Box {
        Column(modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            OutlinedTextField(value = user, onValueChange ={
                user = it
            }, label = {
                Text(text = "Email")
            },
                placeholder = {
                    Text(text = "example@gmail.com")
                },
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.padding(5.dp)
            )
            OutlinedTextField(value = password, onValueChange = {
                password = it
            }, label = {
                Text(text = "Password")
            },
                placeholder = {
                    Text(text = "******")
                },
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.padding(0.dp)
            )
        }
    }
}

@Composable
fun Content2(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.height(10.dp)) {

        }
        Filas(img = R.drawable.welcome, Descript = "#####")

        Spacer(modifier = Modifier.height(0.dp))  // Reduced spacer height

        Text(
            text = "Welcome to LemonPie!",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 0.dp),  // Reduced vertical padding
            textAlign = TextAlign.Center,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Keep your data safe",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),  // Reduced vertical padding
            textAlign = TextAlign.Center,
            fontSize = 15.sp
        )
        TextfielMain()
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Yellow),
            modifier = Modifier
                .padding(vertical = 10.dp)
                .height(45.dp)
                .fillMaxWidth(0.8f)
        )
        {
            Text(text = "L O G I N", color = Color.Black, fontSize = 15.sp)  // Increased text size
        }
        Text(text = "Forgot password?",
            color = Color(0xFFFCCF0D),
            fontSize = 15.sp)

        Spacer(modifier = Modifier.weight(1f))  // This spacer pushes the following texts to the bottom

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Don´t have an account?",
                textAlign = TextAlign.Center,
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.width(8.dp)) // Agrega un espacio entre los textos

            Text(
                text = "Register!",
                color = Color(0xFFFCCF0D),
                textAlign = TextAlign.Center,
                fontSize = 15.sp
            )
        }

    }
}

@Composable
fun Main(page: Int) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFFFFFFF))) {
        Content()
    }
}

@Composable
fun Content() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.height(75.dp)) {

        }
        Filas(img = R.drawable.otra, Descript = "#####")

        Spacer(modifier = Modifier.height(20.dp))  // Reduced spacer height

        Text(
            text = "Please use the link below to verify your email and start your journey",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),  // Reduced vertical padding
            textAlign = TextAlign.Center,
            fontSize = 18.sp
        )

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Yellow),
            modifier = Modifier
                .padding(vertical = 10.dp)
                .height(45.dp)  // Increased button height
                .fillMaxWidth(10f)  // Increased button width
        ) {
            Text(text = "VERIFY EMAIL", color = Color.Black, fontSize = 15.sp)  // Increased text size
        }

        Spacer(modifier = Modifier.weight(1f))  // This spacer pushes the following texts to the bottom

        Text(
            text = "Do you have any questions?",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),  // Reduced vertical padding
            textAlign = TextAlign.Center,
            fontSize = 18.sp
        )

        Text(
            text = "contact@mail.com",
            color = Color.Yellow,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),  // Reduced vertical padding
            textAlign = TextAlign.Center,
            fontSize = 16.sp
        )
    }
}

@Composable
fun Filas(
    img: Int,
    Descript: String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    imgModifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = img),
            contentDescription = Descript,
            modifier = imgModifier
                .width(300.dp)
                .height(325.dp)
        )
    }
}

@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
fun PreviewMain() {
    HorizontalText()
}

