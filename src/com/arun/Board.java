package com.arun;

import java.util.Random;

public class Board {

    private Box[][] boxes;

    public Board() {
        this.resetBoard();
    }

    private void resetBoard() {
        boxes = new Box[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i & 1) == 0) {
                    boxes[i][j] = new Box(i, j, (10 * i)  + j + 1);
                } else {
                    boxes[i][10 - j - 1] = new Box(i, j, (10 * i) + j + 1);
                }
            }
        }

        boxes[0][1].setAbstractSnakeLadder(new Ladder(1, boxes[0][1], boxes[2][2]));
        boxes[0][6].setAbstractSnakeLadder(new Ladder(2, boxes[0][6], boxes[2][8]));
        boxes[2][1].setAbstractSnakeLadder(new Ladder(3, boxes[2][1], boxes[4][0]));
        boxes[2][7].setAbstractSnakeLadder(new Ladder(4, boxes[2][7], boxes[7][3]));
        boxes[2][9].setAbstractSnakeLadder(new Ladder(5, boxes[2][9], boxes[3][8]));
        boxes[4][3].setAbstractSnakeLadder(new Ladder(6, boxes[4][3], boxes[5][2]));
        boxes[5][6].setAbstractSnakeLadder(new Ladder(7, boxes[5][6], boxes[6][8]));
        boxes[6][9].setAbstractSnakeLadder(new Ladder(8, boxes[6][9], boxes[8][9]));
        boxes[7][0].setAbstractSnakeLadder(new Ladder(9, boxes[7][0], boxes[8][2]));
        boxes[8][6].setAbstractSnakeLadder(new Ladder(10,boxes[8][6], boxes[9][7]));

        boxes[2][6].setAbstractSnakeLadder(new Snake(1, boxes[2][6], boxes[0][6]));
        boxes[3][1].setAbstractSnakeLadder(new Snake(2, boxes[3][1], boxes[0][2]));
        boxes[3][5].setAbstractSnakeLadder(new Snake(3, boxes[3][5], boxes[0][4]));
        boxes[4][9].setAbstractSnakeLadder(new Snake(4, boxes[4][9], boxes[3][6]));
        boxes[5][1].setAbstractSnakeLadder(new Snake(5, boxes[5][1], boxes[4][5]));
        boxes[6][5].setAbstractSnakeLadder(new Snake(6, boxes[6][5], boxes[2][3]));
        boxes[7][4].setAbstractSnakeLadder(new Snake(7, boxes[7][4], boxes[6][2]));
        boxes[8][8].setAbstractSnakeLadder(new Snake(8, boxes[8][8], boxes[6][6]));
        boxes[9][3].setAbstractSnakeLadder(new Snake(9, boxes[9][3], boxes[8][5]));
        boxes[9][1].setAbstractSnakeLadder(new Snake(10, boxes[9][1], boxes[0][6]));

    }

    public Box[][] getBoxes() {
        return boxes;
    }

    public int getDiceResult() {
        return new Random().nextInt(6) + 1;
    }

    public void displayBoard() {
        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < 10; j++) {
                System.out.print(boxes[i][j] + "  ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
