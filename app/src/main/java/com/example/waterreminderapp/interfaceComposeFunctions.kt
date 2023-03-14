package com.example.waterreminderapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextBox (textParameter1: String, textParameter2: String) {
    Box(
//        Shape = small,
        modifier = Modifier
            .background(color = Color.Cyan)
            .height(150.dp)
            .width(250.dp)
    ) {
        Text(
            text = textParameter1,
            style = MaterialTheme.typography.h6,
            fontSize = 10.sp,
            modifier = Modifier
                .padding(12.dp)
                .align(Alignment.TopStart),
        )
        Text(
            text = textParameter2,
            style = MaterialTheme.typography.h6,
            fontSize = 25.sp,
            modifier = Modifier
                .padding(12.dp)
                .align(Alignment.CenterStart)
        )
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hi there, $name!")
}