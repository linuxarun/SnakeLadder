package com.arun;

public class Ladder extends AbstractSnakeLadder {

    public Ladder(int id, Box start, Box end) {
        super(id, start, end);
    }

    @Override
    public String toString() {
        return this.getId() + ",L";
    }
}
