package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        printStream.println(partialBookTitle + ": ");
        for (int i=0; i<books.length; i++) {
            if (books[i].contains(partialBookTitle)) {
                printStream.println(books[i]);
            }
        }
    }
}
