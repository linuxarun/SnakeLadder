package com.arun;

public class Piece {
    private boolean isEnd = true;
    private Box box;

    public Piece(boolean isEnd, Box box) {
        this.isEnd = isEnd;
        this.box = box;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }
}
