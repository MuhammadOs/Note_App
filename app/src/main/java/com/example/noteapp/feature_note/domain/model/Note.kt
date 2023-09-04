package com.example.noteapp.feature_note.domain.model

import android.location.GnssNavigationMessage
import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.noteapp.ui.theme.Pink40
import com.example.noteapp.ui.theme.Pink80
import com.example.noteapp.ui.theme.Purple40
import com.example.noteapp.ui.theme.PurpleGrey40
import java.sql.Timestamp

@Entity
data class Note (
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object{
        val notesColors = listOf(Pink80,Purple40,PurpleGrey40,Pink40, Color.White, Color.Yellow)
    }
}

class InvalidNoteException (message: String) : Exception(message)