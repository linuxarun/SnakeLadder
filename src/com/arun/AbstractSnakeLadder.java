package com.arun;

public abstract class AbstractSnakeLadder {
    private int id;
    private Box start;
    private Box end;

    public AbstractSnakeLadder(int id, Box start, Box end) {
        this.id = id;
        this.start = start;
        this.end = end;
    }

    public Box getStart() {
        return start;
    }

    public void setStart(Box start) {
        this.start = start;
    }

    public Box getEnd() {
        return end;
    }

    public void setEnd(Box end) {
        this.end = end;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
