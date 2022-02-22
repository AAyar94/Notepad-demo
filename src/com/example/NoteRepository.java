package com.example;

import com.example.model.NoteModel;

import java.util.ArrayList;
import java.util.List;

public class NoteRepository implements INoteManager {
    private final ArrayList<NoteModel> notes = new ArrayList<>();

    @Override
    public void add(NoteModel note) {
        notes.add(note);
    }

    @Override
    public void update(String targetId, NoteModel newNote) {
        for (NoteModel note : notes) {
            if (note.getId() == targetId) {
                int index = notes.indexOf(note);
                notes.set(index, newNote);
            }
        }
    }

    @Override
    public void delete(String targetId) {
        notes.removeIf(item -> item.getId() == targetId);
    }

    @Override
    public List<NoteModel> getAll() {
        return notes;
    }

    @Override
    public NoteModel findById(String targetId) {
        for (NoteModel note : notes){
            if (note.getId() == targetId) {
                return note;
            }
        }
        return null;
    }
}
