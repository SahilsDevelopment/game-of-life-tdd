package org.example;


public class Cell {
    private boolean alive;

    Cell(boolean isAlive){
        this.alive = isAlive;
    }

    public void update(int liveNeighbours) {
        if(liveNeighbours == 1) this.alive = false;
        if(liveNeighbours <= 3) this.alive = true;
        if(liveNeighbours > 3) this.alive = false;
    }

    public boolean isAlive() {
        return this.alive;
    }
}
