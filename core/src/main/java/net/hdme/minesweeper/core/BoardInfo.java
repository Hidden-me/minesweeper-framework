package net.hdme.minesweeper.core;

/**
 * Information of a board.
 */
public class BoardInfo {
    /**
     * The state code of a cell.
     * 0-8 represents the number of mines around the cell.
     * <code>CELL_UNKNOWN</code> represents that
     * the cell has not been discovered.
     * <code>CELL_FLAG</code> represents that
     * there is a flag at the cell.
     * <code>CELL_DEATH</code> represents that
     * there is a mine at the cell
     * and the player gets trapped here.
     */
    public static final byte
            CELL_UNKNOWN = 9,
            CELL_FLAG = 10,
            CELL_DEATH = 11;

    /**
     * The state of each cell on the board.
     */
    public byte[][] board;

    /**
     * Whether the player is alive.
     * This can be inferred from <code>board</code>
     * and is thus just for saving time.
     */
    public boolean alive;
}
