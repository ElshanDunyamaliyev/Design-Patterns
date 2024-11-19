package org.example.Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class Memory {

    private List<NotePadMemento> mementoList;

    public Memory() {
        this.mementoList = new ArrayList<>();
    }

    public void addToMemory(NotePadMemento memento){
        mementoList.add(memento);
    }

    public NotePadMemento getLatestVersion(){
        if(!mementoList.isEmpty()){
            var lastMemento = mementoList.get(mementoList.size() - 1);
            mementoList.remove(mementoList.size() - 1);
            return lastMemento;
        }else{
            throw new IllegalArgumentException("List is empty");
        }
    }
}
