package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CellTest {

    @DisplayName("Should initialize a new cell")
    @Test
    public void testInitializeCell(){
        Cell cell = new Cell(true);
        assertTrue(cell.isAlive());
    }

    @DisplayName("A live cell with fewer than two live neighbours should die")
    @Test
    public void testLiveCellWithFewerThanTwoLiveNeighboursShouldDie(){
        int liveNeighbours = 1;
        Cell cell = new Cell(true);
        cell.update(liveNeighbours);
        assertTrue(cell.isAlive());
    }

    @DisplayName("A cell with two live neighbours should survive")
    @ParameterizedTest(name = "A live cell with {0} live neighbours should survive")
    @ValueSource(ints = {2, 3})
    public void testCellWithTwoNeighboursShouldSurvive(int liveNeighbours){
        Cell cell = new Cell(true);
        cell.update(liveNeighbours);
        assertTrue(cell.isAlive());
    }

    @DisplayName("A live cell with fewer than two live neighbours should die")
    @ParameterizedTest(name = "A live cell with {0} live neighbours will die")
    @ValueSource(ints = {4,5,6,7,8})
    public void testLiveCellWithMoreThanThreeLiveNeighboursShouldDie(int liveNeighbours){
        Cell cell = new Cell(true);
        cell.update(liveNeighbours);
        assertFalse(cell.isAlive());
    }

    @DisplayName("A live cell with exactly three neighbours will be alive again")
    @Test
    public void testDeadCellWithExactlyThreeLiveNeighboursWillTurnAlive(){
        int liveNeighbours = 3;
        Cell cell = new Cell(true);
        cell.update(liveNeighbours);
        assertTrue(cell.isAlive());
    }


}
