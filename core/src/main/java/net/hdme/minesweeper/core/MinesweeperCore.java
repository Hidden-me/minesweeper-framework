package net.hdme.minesweeper.core;

/**
 * A high-level interface of a minesweeper board.
 * In general, this interface provides the following functions:
 * <list>
 *     <li>observing the board</li>
 *     <li>operating the board</li>
 * </list>
 */
public interface MinesweeperCore {

    // ============
    // Observations
    // ============

    /**
     * Get information of the currently playing board.
     * See <code>net.hdme.minesweeper.framework.Board</code>
     * for further info about what a board keeps track of.
     * @return the playing board information
     */
    BoardInfo getBoardInfo();

    // =================
    // Operations/inputs
    // =================

    /**
     * Put a flag at the specified position.
     * It is typically known as the "right click" operation.
     * The position is specified by its row number and column number.
     * @param row the row number
     * @param col the column number
     * @throws IllegalArgumentException if the specified position exceeds the border of the board
     */
    void flag(int row, int col) throws IllegalArgumentException;

    /**
     * Try to sweep at the specified position.
     * It is typically known as the "left click" operation.
     * The position is specified by its row number and column number.
     * @param row the row number
     * @param col the column number
     * @throws IllegalArgumentException if the specified position exceeds the border of the board
     */
    void sweep(int row, int col) throws IllegalArgumentException;

    /**
     * Try to sweep around the specified position.
     * It is typically known as the "left-right click" operation.
     * The position is specified by its row number and column number.
     * @param row the row number
     * @param col the column number
     * @throws IllegalArgumentException if the specified position exceeds the border of the board
     */
    void sweepAround(int row, int col) throws IllegalArgumentException;

    /**
     * Reset the board.
     */
    void reset();
}
