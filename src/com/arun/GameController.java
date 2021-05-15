package com.arun;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private List<Player> players;
    private Board board;
    private Player playerTurn;
    private GameState gameState;
    private int totalMoves;

    public GameController() {

        board = new Board();
        board.displayBoard();

        players = new ArrayList<>();
        players.add(new Player(new Piece(board.getBoxes()[0][0], "Green")));
        players.add(new Player(new Piece(board.getBoxes()[0][0], "Blue")));
        players.add(new Player(new Piece(board.getBoxes()[0][0], "Red")));
        players.add(new Player(new Piece(board.getBoxes()[0][0], "Yellow")));
        players.add(new Player(new Piece(board.getBoxes()[0][0], "White")));
        players.add(new Player(new Piece(board.getBoxes()[0][0], "Black")));

        gameState = GameState.BEGIN;
        playerTurn = players.get(0);
        totalMoves = 0;
    }

    public void startGame() {
        gameState = GameState.PROGRESS;

        while (!gameState.equals(GameState.END)) {
            totalMoves++;
            int diceResult = board.getDiceResult();
            Move move = getMove(diceResult);
            System.out.println();
            System.out.println(diceResult + " ---- " + move);
            if (move == null) {
                continue;
            }
            while (move.getEnd().getAbstractSnakeLadder() != null) {
                move.setEnd(move.getEnd().getAbstractSnakeLadder().getEnd());
            }

            playerTurn.getPiece().setBox(move.getEnd());
            System.out.println(playerTurn);
            if (playerTurn.getPiece().getBox().getLabel() == 100) {
                gameState = GameState.END;
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("Total Moves: " + totalMoves + ", ------------------ Player "
                        + playerTurn.getPiece().getColor() + " WON!!! --------------------");

            } else {
                playerTurn = players.get((players.indexOf(playerTurn) + 1) % players.size());
            }
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

    private Move getMove(int diceResult) {
        Box start = playerTurn.getPiece().getBox();

        int endtLabel = start.getLabel() + diceResult;

        if (endtLabel > 100) {
            return null;
        }

        int endX = endtLabel / 10;
        if (endtLabel % 10 == 0) {
            endX = (endtLabel - 1) / 10;
        }

        int endY;
        if ((endX & 1) == 0) {
            if (endtLabel % 10 == 0) {
                endY = 9;
            } else {
                endY = endtLabel % 10 - 1;
            }
        } else {
            if (endtLabel % 10 == 0) {
                endY = 0;
            } else {
                endY = 10 - endtLabel % 10;
            }
        }

        Box end = board.getBoxes()[endX][endY];
        return new Move(playerTurn, start, end);
    }
}
