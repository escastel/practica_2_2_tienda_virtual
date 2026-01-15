package com.example.tiendavirtual.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tiendavirtual.R
import com.example.tiendavirtual.ui.theme.TiendaVirtualTheme

/**
 * Función que muestra la información detallada de un  producto.
 * Incluye el nombre y el precio alineados en una cabecera, seguidos de la descripción.
 *
 * @param modifier Modificador que se aplica al contenedor principal para configurar su diseño.
 * @param text Nombre del producto.
 * @param price Precio del producto.
 */
@Composable
fun ProductDetails(
    modifier: Modifier = Modifier,
    text: String,
    price: String
) {
    Column( modifier = modifier
        .verticalScroll(rememberScrollState())
        .padding(16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = text,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = price,
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
}

@Preview
@Composable
fun ProductHeadPreview() {
    TiendaVirtualTheme {
        ProductDetails(
            modifier = Modifier.background(Color.White),
            text = stringResource(R.string.text_shoes),
            price = stringResource(R.string.price_shoes)
        )
    }
}