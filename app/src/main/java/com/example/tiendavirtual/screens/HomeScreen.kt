package com.example.tiendavirtual.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tiendavirtual.R
import com.example.tiendavirtual.components.ContentCard
import com.example.tiendavirtual.ui.theme.TiendaVirtualTheme

/**
 * Función que realiza el diseño de la pantalla principal `Home`.
 * Muestra un catálogo de productos.
 *
 * @param navDetails Función que se ejecuta al hacer click sobre alguno de
 * los botones `Ver`. Esta navega a la pantalla `Details`.
 *
 * @see DetailsScreen
 * @see ContentCard
 */
@Composable
fun HomeScreen(navDetails: (Int, Int) -> Unit)
{
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Text(text = stringResource(R.string.tittle_home))
            Spacer(modifier = Modifier.height(16.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            ) {
                ContentCard(
                    img = R.drawable.img_shoes,
                    text = R.string.text_shoes,
                    price = R.string.price_shoes,
                    onClick = navDetails
                )
                Spacer(modifier = Modifier.height(16.dp))
                ContentCard(
                    img = R.drawable.img_t_shirt,
                    text = R.string.text_t_shirt,
                    price = R.string.price_t_shirt,
                    onClick = navDetails
                )
                Spacer(modifier = Modifier.height(16.dp))
                ContentCard(
                    img = R.drawable.img_cap,
                    text = R.string.text_cap,
                    price = R.string.price_cap,
                    onClick = navDetails
                )
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview(){
    TiendaVirtualTheme {
       HomeScreen(
           navDetails = { _, _ -> }
       )
    }
}