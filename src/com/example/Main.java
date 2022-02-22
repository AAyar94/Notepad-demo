package com.example;

import com.example.model.NoteModel;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

/**
 * Note App
 * <p>
 * -> Not olustur, sil, güncelle ve tüm notları listele
 * <p>
 * Note {
      id: String,
      title: String,
      content: String,
      publishDateInMillis: Long,
 * }
 * <p>
 * <p>
 * <p>
 * -> Notları bir listede saklayacağız.
 */


public class Main {

    public static void main(String[] args) {

        NoteRepository repository = new NoteRepository();
        Scanner menuScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please choose an operation: ");
            System.out.println(
                    "1- Add note\n" +
                            "2- Update note\n" +
                            "3- Delete note\n" +
                            "4- Find note by id\n" +
                            "5- Get all notes\n"
            );

            int selection = Integer.parseInt(menuScanner.next());
            switch (selection) {
                case 1: {
                    // Add note
                    String id = UUID.randomUUID().toString();
                    NoteModel newNote = new NoteModel(id);

                    System.out.println("Enter note title:");
                    newNote.setTitle(menuScanner.next());

                    System.out.println("Enter note content:");
                    newNote.setContent(menuScanner.next());

                    newNote.setPublishDateInMillis(System.currentTimeMillis());

                    repository.add(newNote);
                    System.out.println("Note saved successfully!");
                    break;
                }
                case 2: {
                    // Update note
                }
                case 3: {
                    // Delete note
                }
                case 4: {
                    // Find note by id
                }
                case 5: {
                    // Get all notes
                    List<NoteModel> dataSource = repository.getAll();
                    // Lambda function
                    for (int i = 0; i < dataSource.size(); i++) {
                        System.out.println(i + 1 + "-" + dataSource.get(i).getTitle());
                    }
                }
            }

        }

    }
}
