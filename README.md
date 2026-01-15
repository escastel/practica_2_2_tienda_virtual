# App Tienda Virtual

![Kotlin](https://img.shields.io/badge/Kotlin-1.9.0-purple?style=flat&logo=kotlin)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-Material3-green?style=flat&logo=android)
![Status](https://img.shields.io/badge/Status-Educational-blue)

Una aplicación Android moderna desarrollada con **Jetpack Compose** que simula el flujo básico de una tienda de comercio electrónico. Este proyecto demuestra el uso de navegación segura por tipos, diseño de componentes reutilizables y gestión de estado básica en la UI.

## Capturas de Pantalla

| Home Screen | Details Screen | Confirmation Screen |
|:-----------:|:--------------:|:-------------------:|
| ![Captura de Pantalla](screenshots/home.png) | ![Captura de Pantalla](screenshots/details.png) | ![Captura de Pantalla](screenshots/confirm.png) |

## 🛠️ Tecnologías y Librerías

El proyecto utiliza las últimas prácticas de desarrollo en Android:

* **Lenguaje:** [Kotlin](https://kotlinlang.org/)
* **UI Framework:** [Jetpack Compose (Material3)](https://developer.android.com/jetpack/compose)
* **Navegación:** `androidx.navigation3` con `NavBackStack` y `NavEntry`.
* **Serialización:** `kotlinx.serialization` para el paso de argumentos seguros entre rutas (`Routes`).
* **Componentes:** Diseño modular basado en componentes reutilizables.

## Estructura del Proyecto

El código está organizado siguiendo una arquitectura limpia basada en paquetes:

```text
com.example.tiendavirtual
├── components/         # Componentes UI reutilizables
│   ├── AppButton.kt    # Botón estándar de la app
│   ├── ContentCard.kt  # Tarjeta de producto para el catálogo
│   └── ProductDetails.kt # Sección de info
├── navigation/         # Lógica de navegación
│   ├── Navigation.kt   # Configuración del NavBackStack y NavDisplay
│   └── Routes.kt       # Definición de rutas (Home, Details, Confirmation)
├── screens/            # Pantallas completas
│   ├── HomeScreen.kt
│   ├── DetailsScreen.kt
│   ├── ConfirmationScreen.kt
│   └── ErrorScreen.kt
└── ui/theme/           # Tema y tipografías
