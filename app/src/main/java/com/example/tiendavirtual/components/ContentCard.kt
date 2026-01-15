package com.example.tiendavirtual.components

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tiendavirtual.R
import com.example.tiendavirtual.screens.DetailsScreen
import com.example.tiendavirtual.ui.theme.TiendaVirtualTheme

/**
 * Función que realiza el diseño de una tarjeta de un producto.
 * Muestra la imagen, el nombre y el precio del artículo.
 *
 * @param img Identificador de recurso `drawable` correspondiente a la imagen del producto.
 * @param text Identificador de recurso `string` correspondiente al nombre del producto.
 * @param price Identificador de recurso `string` correspondiente al precio del producto.
 * @param onClick Función que se ejecuta al hacer click sobre el botón "Ver". Esta navega a la pantalla `Details`.
 *
 * @see DetailsScreen
 * @see HomeScreen
 */
@Composable
fun ContentCard(
    @DrawableRes img: Int,
    @StringRes text: Int,
    @StringRes price: Int,
    onClick: (Int, Int) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(img),
                contentDescription = "",
                modifier = Modifier
                    .clip(RoundedCornerShape(15))
                    .size(80.dp)
            )
            Spacer( modifier = Modifier.width(16.dp) )
            Column( modifier = Modifier.weight(1f) ){
                Text(
                    text = stringResource(text),
                    style = MaterialTheme.typography.titleMedium,
                    maxLines = 1
                )
                Text(
                    text = stringResource(price),
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Gray
                )
            }
            Button(
                onClick = { onClick(img, text) }
            ) { Text(stringResource(R.string.btn_see)) }
        }
    }
}

@Preview
@Composable
fun ContentCardPreview(){
    TiendaVirtualTheme {
        ContentCard(
            img = R.drawable.img_shoes,
            text = R.string.text_shoes,
            price = R.string.price_shoes,
            onClick = { _, _ -> }
        )
    }
}