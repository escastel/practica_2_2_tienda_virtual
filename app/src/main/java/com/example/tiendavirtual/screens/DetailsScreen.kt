package com.example.tiendavirtual.screens

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tiendavirtual.R
import com.example.tiendavirtual.ui.theme.TiendaVirtualTheme


/**
 * Función que realiza el diseño de la pantalla secundaria `Details`.
 * Muestra una pantalla con los detalles del producto seleccionado en `Home`.
 *
 * @param img Identificador de recurso `drawable` correspondiente a la imagen del producto.
 * @param text Identificador de recurso `string` correspondiente al nombre del producto.
 * @param price Identificador de recurso `string` correspondiente al precio del producto.
 * @param navBack Función que se ejecuta al hacer click sobre el botón de
 * `Atrás`. Esta devuelve al usuario a la pantalla de inicio `Home`.
 * @param navConfirm Función que se ejecuta al hacer click sobre el botón de
 * `Comprar ahora`. Esta navega a la pantalla `Confirmation`.
 *
 * @see HomeScreen
 * @see ConfirmationScreen
 */
@Composable
fun DetailsScreen(
    @DrawableRes img: Int,
    @StringRes text: Int,
    @StringRes price: Int,
    navBack: () -> Unit,
    navConfirm: () -> Unit
) {
    Scaffold { paddingValues ->
        Column( modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            Image(
                painter = painterResource(img),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
            )
            Column( modifier = Modifier
                .weight(1f)
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
            ) {
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(
                        text = stringResource(text),
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = stringResource(price),
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = stringResource(R.string.default_description),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                onClick = navConfirm
            ) {
                Text(
                    text = stringResource(R.string.btn_buy)
                )
            }
            Button(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = navBack
            ) {
                Text(
                    text = stringResource(R.string.btn_back)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Preview
@Composable
fun DetailsScreenPreview() {
    TiendaVirtualTheme {
        DetailsScreen(
            img = R.drawable.img_t_shirt,
            text = R.string.text_t_shirt,
            price = R.string.price_t_shirt,
            navBack = {},
            navConfirm = {}
        )
    }
}