package com.example;

import com.example.model.NoteModel;
import com.example.NoteRepository;

import java.util.List;

public class EmptyChecker {

    NoteRepository repository = new NoteRepository();

    public void emptyChecker() {
        List<NoteModel> notes = repository.getAll();
        if (notes.isEmpty()){
            System.out.println("There is no any note here");
        }
        for (int i = 0; i < notes.size(); i++) {
            System.out.println(i + 1 + "-" + notes.get(i).getTitle() + "\n" + notes.get(i).getContent());
        }
    }
}
