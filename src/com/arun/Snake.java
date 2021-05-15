package com.arun;

public class Snake extends AbstractSnakeLadder {

    public Snake(int id, Box start, Box end) {
        super(id, start, end);
    }

    @Override
    public String toString() {
        return this.getId() + ",S";
    }
}
