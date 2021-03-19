package com.javarush.games.minesweeper;
import com.javarush.engine.cell.*;

public class MinesweeperGame extends Game {
    private final static int SIDE = 9;
    private int countMinesOnField;
    private GameObject[][] gameField = new GameObject[SIDE][SIDE];
    private void createGame(){
        for(int i = 0; i < SIDE; i++)
            for(int j = 0; j < SIDE; j++) {
                Boolean isMine = getRandomNumber(10) == 5;
                if(isMine) countMinesOnField++;
                gameField[i][j] = new GameObject(j, i, isMine);
                setCellColor(i, j, Color.DIMGREY);
            }

    }

    @Override
    public void initialize() {
        super.initialize();
        setScreenSize(SIDE,SIDE);
        createGame();
    }
}
