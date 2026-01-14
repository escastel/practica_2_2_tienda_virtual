package com.example.tiendavirtual.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.tiendavirtual.R

/**
 * @param img
 * @param text
 * @param price
 * @param onClick
 */
@Composable
fun ContentCard(
    @DrawableRes img: Int,
    @StringRes text: Int,
    @StringRes price: Int,
    onClick: () -> Unit = {}
) {
    Card(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxSize().padding(16.dp)
        ) {
            Image(
                painter = painterResource(img),
                contentDescription = "",
                modifier = Modifier
                    .clip(RoundedCornerShape(15))
                    .height(80.dp)
            )
            Column(){
                Text(stringResource(text))
                Text(stringResource(price))
            }
            Button(
                onClick = {}
            ) { Text(stringResource(R.string.btn_see)) }
        }
    }
}