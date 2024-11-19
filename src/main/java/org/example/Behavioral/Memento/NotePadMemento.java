package org.example.Behavioral.Memento;

public class NotePadMemento {

    private String note;

    public NotePadMemento(String note) {
        this.note = note;
    }

    public void addNote(String newNote){
        note+= newNote;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
