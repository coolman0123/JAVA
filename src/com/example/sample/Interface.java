package com.example.sample;

interface Printable {
    void print();
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing a document");
    }
}

public class Interface {
    public static void main(String[] args) {
        Printable doc = new Document();
        doc.print();
    }
}
