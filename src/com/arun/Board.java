package com.arun;

public class Board {

    Box[][] boxes;

    public Board(Box[][] boxes) {

    }

    private void resetBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i & 1) == 0) {
                    boxes[i][j] = new Box(i, j, (10 * i)  + j + 1);
                } else {
                    boxes[i][10 - j - 1] = new Box(i, j, (10 * i) + j + 1);
                }
            }
        }

        boxes[0][1].setAbstractSnakeLadder(new Ladder(boxes[0][1], boxes[2][2]));
        boxes[0][6].setAbstractSnakeLadder(new Ladder(boxes[0][6], boxes[2][8]));
        boxes[2][1].setAbstractSnakeLadder(new Ladder(boxes[2][1], boxes[4][0]));
        boxes[2][7].setAbstractSnakeLadder(new Ladder(boxes[2][7], boxes[7][3]));
        boxes[2][9].setAbstractSnakeLadder(new Ladder(boxes[2][9], boxes[3][8]));
        boxes[4][3].setAbstractSnakeLadder(new Ladder(boxes[4][3], boxes[5][2]));
        boxes[5][6].setAbstractSnakeLadder(new Ladder(boxes[5][6], boxes[6][8]));
        boxes[6][9].setAbstractSnakeLadder(new Ladder(boxes[6][9], boxes[8][9]));
        boxes[7][0].setAbstractSnakeLadder(new Ladder(boxes[7][0], boxes[8][2]));
        boxes[8][6].setAbstractSnakeLadder(new Ladder(boxes[8][6], boxes[9][7]));

        boxes[2][6].setAbstractSnakeLadder(new Snake(boxes[2][6], boxes[0][6]));
        boxes[3][1].setAbstractSnakeLadder(new Snake(boxes[3][1], boxes[0][2]));
        boxes[3][5].setAbstractSnakeLadder(new Snake(boxes[3][5], boxes[0][4]));
        boxes[4][9].setAbstractSnakeLadder(new Snake(boxes[4][9], boxes[3][6]));
        boxes[5][1].setAbstractSnakeLadder(new Snake(boxes[5][1], boxes[4][5]));
        boxes[6][5].setAbstractSnakeLadder(new Snake(boxes[6][5], boxes[2][3]));
        boxes[7][4].setAbstractSnakeLadder(new Snake(boxes[7][4], boxes[6][2]));
        boxes[8][8].setAbstractSnakeLadder(new Snake(boxes[8][8], boxes[6][6]));
        boxes[9][3].setAbstractSnakeLadder(new Snake(boxes[9][3], boxes[8][5]));
        boxes[9][1].setAbstractSnakeLadder(new Snake(boxes[9][1], boxes[0][6]));
    }
}
