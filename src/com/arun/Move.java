package com.arun;

public class Move {
    private Player player;
    private Box start;
    private Box end;

    public Move(Player player, Box start, Box end) {
        this.player = player;
        this.start = start;
        this.end = end;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
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

    @Override
    public String toString() {
        return "Move{" +
                "player=" + player +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
