package com.designpatterns.dev.behavioral.momento.java;

import java.util.ArrayList;
import java.util.List;

public class EditorHistory {
    private List<EditorState> stateList = new ArrayList<>();

    public void pushState(EditorState editorState) {
        stateList.add(editorState);
    }

    public EditorState popState() {
        EditorState previousState = stateList.get(getIndex());
        stateList.remove(previousState);
        return stateList.get(getIndex());
    }

    private int getIndex(){
        int size = stateList.size();
        return (size > 0) ? stateList.size() - 1 : 0;
    }
}
