package com.example.cryptocurrencyapp.presentation.coin_detail.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import com.example.cryptocurrencyapp.data.remote.dto.TeamMember

@Composable
fun TeamListItem(
    teamMember: TeamMember,
    modifier: Modifier
){
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center) {
        Text(
            text = teamMember.name,
            style = MaterialTheme.typography.h4
        )

        Spacer(modifier= Modifier.height(5.dp))

        Text(
            text=teamMember.name,
            style = MaterialTheme.typography.h4,
            fontStyle = FontStyle.Italic
        )

    }
}