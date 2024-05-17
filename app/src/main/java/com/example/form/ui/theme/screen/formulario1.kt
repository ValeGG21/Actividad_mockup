package com.example.form.ui.theme.screen

import android.icu.text.ListFormatter.Width
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.form.R
@Composable
fun Main() {
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
    Main()
}

