package com.example.tiendavirtual.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tiendavirtual.R
import com.example.tiendavirtual.components.AppButton
import com.example.tiendavirtual.ui.theme.TiendaVirtualTheme

/**
 * Función que realiza el diseño de la pantalla de error `Error`.
 * Muestra por pantalla que ha sucedido un error.
 *
 * @param navHome Función que se ejecuta al hacer click sobre el botón de
 * `Volver a la Tienda`. Esta devuelve al usuario a la pantalla `Home`.
 *
 * @see AppButton
 * @see HomeScreen
 */
@Composable
fun ErrorScreen(navHome: () -> Unit)
{
    Scaffold{ paddingValues ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_error),
                contentDescription = "",
                tint = Color.Red,
                modifier = Modifier.size(100.dp)
            )
            Text(
                text = stringResource(R.string.text_error),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.height(16.dp))
            AppButton(
                onClick = navHome,
                text = stringResource(R.string.btn_return)
            )
        }
    }
}

@Preview
@Composable
fun ErrorScreenPreview(){
    TiendaVirtualTheme {
        ErrorScreen( navHome = {} )
    }
}