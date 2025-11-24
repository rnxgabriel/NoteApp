package com.gabrielaltruist.noteapp.feature_note.domain.use_case

data class NotesUseCases(
    val getNotes: GetNotesUseCase,
    val deleteNote: DeleteNoteUseCase,
)
