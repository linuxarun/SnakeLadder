package com.arun;

public abstract class AbstractSnakeLadder {
    Box start;
    Box end;

    public AbstractSnakeLadder(Box start, Box end) {
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
}
