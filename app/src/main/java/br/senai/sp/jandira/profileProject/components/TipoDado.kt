package br.senai.sp.jandira.profile.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.rickmorty.R

@Composable
fun TipoDado (
    modifier: Modifier,
    texto: String = "",
    icone: ImageVector = Icons.Default.Email
) {
    Row {
        Icon(
            imageVector = icone,
            contentDescription = "",
            tint = colorResource(R.color.azul_claro),
            modifier = Modifier
                .size(20.dp)
        )
        Text(
            text = texto,
            fontWeight = FontWeight.SemiBold,
            fontSize = 15.sp,
            modifier = modifier
                .padding(start = 5.dp)
        )
    }
}