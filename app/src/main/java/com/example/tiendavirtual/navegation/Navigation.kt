package com.example.tiendavirtual.navegation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.example.tiendavirtual.screens.ConfirmationScreen
import com.example.tiendavirtual.screens.DetailsScreen
import com.example.tiendavirtual.screens.ErrorScreen
import com.example.tiendavirtual.screens.HomeScreen

/**
 * Función que gestiona la navegación de la aplicación.
 *
 * Esta se encarga de navegar y mostrar una pantalla u otra según el objeto
 * `Routes` que reciba en ese momento. Si no recibe ningún objeto, redirige
 * al usuario a una pantalla de Error.
 *
 * @see NavBackStack
 * @see NavDisplay
 * @see NavEntry
 * @see Routes
 */
@Composable
fun Navigation() {
    val backStack: NavBackStack<NavKey> = rememberNavBackStack(Routes.Home)

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = { key ->
            when (key){
                is Routes.Home -> NavEntry(key){
                    HomeScreen(
                        navDetails = {
                            img, text, price -> backStack.add(Routes.Details(
                                img = img,
                                text = text,
                                price = price
                            ))
                        }
                    )
                }
                is Routes.Details -> NavEntry(key){
                    DetailsScreen(
                        img = key.img,
                        text = key.text,
                        price = key.price,
                        navBack = {
                            backStack.removeLastOrNull()
                        },
                        navConfirm = {
                            backStack.add(Routes.Confirmation)
                        }
                    )
                }
                is Routes.Confirmation -> NavEntry(key){
                    ConfirmationScreen(
                        navHome = {
                            backStack.clear()
                            backStack.add(Routes.Home)
                        }
                    )
                }
                else -> NavEntry(key = Routes.Error){
                    ErrorScreen(
                        navHome = {
                            backStack.clear()
                            backStack.add(Routes.Home)
                        }
                    )
                }
            }
        }
    )
}