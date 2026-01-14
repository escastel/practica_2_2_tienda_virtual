package com.example.tiendavirtual.navegation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

/**
 * **Clase sellada** que restinge su extensión o previene de ser heredada.
 * Contiene las rutas de las pantallas que conforman nuestra aplicación.
 *
 * Sus clases u objetos heredad@s tienen la anotación `Serializable`. Esta
 * marca las clases u objetos para que puedan ser convertidas a un formato
 * cadena y viceversa.
 *
 * @see NavKey
 * @see kotlin.io.Serializable
 */
sealed class Routes: NavKey {

    @Serializable
    data object Home: Routes()

    @Serializable
    data class Details(
        @DrawableRes val img: Int,
        @StringRes val text: Int
    ): Routes()

    @Serializable
    data object Confirmation: Routes()

    @Serializable
    data object Error: Routes()
}