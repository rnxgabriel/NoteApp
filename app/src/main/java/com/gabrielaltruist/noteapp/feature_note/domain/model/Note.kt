package com.gabrielaltruist.noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.gabrielaltruist.noteapp.ui.theme.BabyBlue
import com.gabrielaltruist.noteapp.ui.theme.LightGreen
import com.gabrielaltruist.noteapp.ui.theme.RedOrange
import com.gabrielaltruist.noteapp.ui.theme.RedPink
import com.gabrielaltruist.noteapp.ui.theme.Violet

@Entity
data class Note(
    @PrimaryKey
    val id: Int? = null,

    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    companion object  {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
