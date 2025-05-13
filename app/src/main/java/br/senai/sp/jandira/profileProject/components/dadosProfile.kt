package br.senai.sp.jandira.projetoprofile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun DadosProfile(
    texto1: String = "",
    texto2: String = "",
    modifier: Modifier = Modifier
){
    Column() {
        Text(
            text = texto1,
            color = Color.Gray,
            fontSize = 12.sp,
            fontWeight = FontWeight.Light,
        )
        Text(
            text = texto2,
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp,
            modifier = modifier
                .padding(top = 10.dp)

        )
    }
}