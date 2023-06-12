package com.prisar.dalim.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DalimColorScheme = lightColorScheme(
    primary = Orange,
    secondary = DarkBlue,
    tertiary = DarkGrey,
    surface = VeryLightGrey,
    surfaceVariant = LightGrey,
    outline = MediumGrey,
    error = DarkRed
)

@Composable
fun DalimTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = DalimColorScheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}