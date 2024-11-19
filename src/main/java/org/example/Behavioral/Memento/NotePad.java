package org.example.Behavioral.Memento;

public class NotePad {

    private String note;

    public NotePad() {
    }

    public NotePad(String note) {
        this.note = note;
    }

    public void addNote(String newNote){
        note+= newNote;
    }

    public NotePadMemento saveNote(){
        return new NotePadMemento(note);
    }

    public void undo(NotePadMemento memento){
        note = memento.getNote();
    }

    public void showNote(){
        System.out.println(note);
    }

}
