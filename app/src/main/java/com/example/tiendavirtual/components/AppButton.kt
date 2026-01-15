package com.example.tiendavirtual.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.tiendavirtual.R
import com.example.tiendavirtual.ui.theme.TiendaVirtualTheme

/**
 * Función que realiza el diseño de un botón.
 *
 * @param modifier Modificador que se aplica al botón para configurar su diseño.
 * @param text Identificador de recurso `string` correspondiente al nombre del producto.
 * @param onClick Función que se ejecuta al hacer click sobre el botón "Ver". Esta navega a la pantalla `Details`.
 */
@Composable
fun AppButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        onClick = onClick
    ) {
        Text( text = text )
    }
}

@Preview
@Composable
fun AppButtonPreview(){
    TiendaVirtualTheme {
        AppButton(
            onClick = {},
            text = stringResource(R.string.btn_back)
        )
    }
}