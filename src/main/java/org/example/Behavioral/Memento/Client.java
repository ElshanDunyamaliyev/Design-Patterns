package org.example.Behavioral.Memento;

public class Client {

    public static void main(String[] args) {
        Memory memory = new Memory();
        NotePad notePad = new NotePad();
        notePad.addNote("d");
        notePad.addNote("e");
        notePad.addNote("v");
        notePad.addNote("e");
        notePad.addNote("l");

        NotePadMemento devel = notePad.saveNote();
        memory.addToMemory(devel);

        notePad.showNote();

        notePad.addNote("oper");
        NotePadMemento developer = notePad.saveNote();
        memory.addToMemory(developer);

        notePad.addNote(" remove me");
        notePad.showNote();

        notePad.undo(memory.getLatestVersion());
        notePad.showNote();

    }
}
