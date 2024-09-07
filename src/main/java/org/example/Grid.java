package org.example;

public class Grid {
    private int rows;
    private int cols;
    private boolean state;

    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        Cell[][] cells = new Cell[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                cells[i][j] = new Cell(false);
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public boolean getCellSate(int row, int col) {
        return state;
    }

    public void setCellState(int row, int col, boolean newState) {
        state = newState;
    }
}
