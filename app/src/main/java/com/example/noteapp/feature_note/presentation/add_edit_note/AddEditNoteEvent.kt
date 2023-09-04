package com.example.noteapp.feature_note.presentation.add_edit_note

import androidx.compose.ui.focus.FocusState

sealed class AddEditNoteEvent {
    data class EnteredTitle(val value: String) : AddEditNoteEvent()
    data class FocusTitle(val focusState: FocusState) : AddEditNoteEvent()
    data class EnteredContent(val value: String) : AddEditNoteEvent()
    data class FocusContent(val focusState: FocusState) : AddEditNoteEvent()
    data class ChangeColor(val color: Int) : AddEditNoteEvent()
    object SaveNote : AddEditNoteEvent()
}
