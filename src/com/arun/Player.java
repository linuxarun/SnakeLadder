package com.arun;

public class Player {

    Piece piece;

    public Player(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "Player{" +
                "piece=" + piece +
                '}';
    }
}
