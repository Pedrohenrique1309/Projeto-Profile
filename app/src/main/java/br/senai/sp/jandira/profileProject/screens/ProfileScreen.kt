package br.senai.sp.jandira.profile.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.profile.components.CardDados
import br.senai.sp.jandira.profile.components.TipoDado
import br.senai.sp.jandira.projetoprofile.components.DadosProfile
import br.senai.sp.jandira.rickmorty.R

@Composable
fun ProfileScreen (modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)

    ){
        Column {
            Row (
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Top
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp)
                        .clip(RoundedCornerShape(
                            topStart = 0.dp,
                            topEnd = 0.dp,
                            bottomEnd = 15.dp,
                            bottomStart = 15.dp
                        ))
                ) {
                    Image(
                        painter = painterResource(R.drawable.backgound),
                        contentDescription = "",
                        contentScale = ContentScale.Crop
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(10.dp),
                    ){
                        Row (
                        ){
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "",
                                tint = Color.White,
                                modifier = Modifier
                                    .size(15.dp)
                            )
                            Text(
                                text = "Details",
                                modifier = Modifier
                                    .padding(start = 155.dp),
                                color = Color.White,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 10.sp
                            )
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Card(
                                shape = RoundedCornerShape(40.dp),
                                modifier =  Modifier
                                    .padding(top = 30.dp)
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.imagemperfil),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .width(70.dp)
                                        .height(70.dp),
                                )
                            }
                            Text(
                                text = "Neymar Junior",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(top = 10.dp)
                            )

                            Text(
                                text = "Soccer Player",
                                color = Color.Gray,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Light,
                                modifier = Modifier
                                    .padding(top = 2.dp)

                            )
                            Row (
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(bottom = 5.dp),
                                verticalAlignment = Alignment.Bottom,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ){
                                CardDados(
                                    icone = Icons.Default.Email,
                                    texto = "Email"
                                )
                                CardDados(
                                    icone = Icons.Default.Call,
                                    texto = "Call"
                                )
                                CardDados(
                                    icone = Icons.Default.CheckCircle,
                                    texto = "Whatsapp"
                                )
                                CardDados(
                                    icone = Icons.Default.Star,
                                    texto = "Favorite"
                                )
                            }
                        }
                    }
                }
            }
            Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(15.dp, top = 20.dp)
                ) {
                    TipoDado(
                        icone = Icons.Default.Email,
                        texto = "Email",
                        modifier = Modifier
                    )
                    Column (
                        modifier = Modifier
                            .padding(top = 10.dp, start = 30.dp)
                    ) {

                        DadosProfile(
                            texto1 = "official",
                            texto2 = "neymar.jr@njr.com"
                        )

                        Row(
                            modifier = Modifier
                                .padding(top = 10.dp)
                        ) {
                            DadosProfile(
                                texto1 = "Personal",
                                texto2 = "neymar@njr.com"
                            )
                        }
                    }
                    HorizontalDivider(
                        modifier = Modifier
                            .padding(top = 20.dp, end = 15.dp)
                    )
                    Column (
                        modifier = Modifier
                            .padding(top = 15.dp)
                    ) {
                        TipoDado(
                            icone = Icons.Default.Call,
                            texto = "Phone number",
                            modifier = Modifier
                        )

                        Row (
                            modifier = Modifier
                                .padding(start = 30.dp, top = 10.dp)
                        ) {
                            DadosProfile(
                                texto1 = "Mobile",
                                texto2 = "(11) 97070-7070"
                            )
                        }

                    }
                    HorizontalDivider(
                        modifier = Modifier
                            .padding(top = 20.dp, end = 15.dp)

                    )

                    Column (
                        modifier = Modifier
                            .padding(top = 15.dp)
                            .fillMaxWidth()
                    ) {
                        TipoDado(
                            icone = Icons.Default.AccountCircle,
                            texto = "Team ",
                            modifier = Modifier
                        )

                        Row (
                            modifier = Modifier
                                .padding(start = 30.dp, top = 10.dp)
                                .fillMaxWidth()
                        ) {
                            DadosProfile(
                                texto1 = "",
                                texto2 = "Project Operation Team"
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(end = 30.dp),
                                horizontalArrangement = Arrangement.End
                            ) {
                                IconButton(
                                    onClick = {},
                                    modifier = Modifier
                                        .width(30.dp)
                                        .height(30.dp),
                                    colors = IconButtonDefaults.iconButtonColors((colorResource(R.color.azul_escuro)))
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.ArrowForward,
                                        contentDescription = "",
                                        tint = Color.White,
                                        modifier = Modifier
                                            .size(24.dp)
                                    )
                                }
                            }

                        }

                    }
                    HorizontalDivider(
                        modifier = Modifier
                            .padding(top = 20.dp, end = 15.dp)
                    )
                    Column (
                        modifier = Modifier
                            .padding(top = 15.dp)
                            .fillMaxWidth()
                    ) {
                        TipoDado(
                            icone = Icons.Default.Person,
                            texto = "Leads by",
                            modifier = Modifier
                        )

                        Row (
                            modifier = Modifier
                                .padding(start = 30.dp, top = 10.dp)
                                .fillMaxWidth()
                        ) {
                            DadosProfile(
                                texto1 = "",
                                texto2 = "Darrell Steward"
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(end = 30.dp),
                                horizontalArrangement = Arrangement.End
                            ) {
                                IconButton(
                                    onClick = {},
                                    modifier = Modifier
                                        .width(30.dp)
                                        .height(30.dp),
                                    colors = IconButtonDefaults.iconButtonColors((colorResource(R.color.azul_escuro)))
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.ArrowForward,
                                        contentDescription = "",
                                        tint = Color.White,
                                        modifier = Modifier
                                            .size(24.dp)
                                    )
                                }
                            }

                        }

                    }

                }
                Row (
                    modifier = Modifier
                        .padding(20.dp)
                ){
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .padding(end = 10.dp)
                            .width(250.dp)
                            .fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        border = BorderStroke(width = 1.dp, Color.Gray)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ){
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = "",
                                tint = colorResource(R.color.azul_escuro)
                            )
                            Row(
                                modifier = Modifier
                                    .padding(start = 10.dp)
                            ) {
                                Text(
                                    text = stringResource(R.string.add_contact),
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = colorResource(R.color.azul_escuro))

                            }
                        }

                    }
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .width(80.dp),
                        colors = ButtonDefaults.buttonColors(Color.Transparent),
                        border = BorderStroke(width = 1.dp, Color.Gray)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Share,
                            contentDescription = "",
                            tint = colorResource(R.color.azul_escuro),
                            modifier = Modifier
                                .height(20.dp)
                                .width(20.dp)
                        )
                    }
                }

            }
        }
    }
}



@Preview
@Composable
private fun ProfileScreenPreview (){
    ProfileScreen()
}