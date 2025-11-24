package com.gabrielaltruist.noteapp.feature_note.domain.use_case

data class NoteUseCases(
    val getNotes: GetNoteUseCase,
    val deleteNote: DeleteNoteUseCase,
    val addNoteUseCase: AddNoteUseCase
)
