package SquareOfAsterisks;

public class SquareOfAsterisks {
    private int rowCounter;
    private int columnCounter;

    public void displaySquareOfAsterisks(int side) {
        for (int rowCounter = 0; rowCounter < side; rowCounter++) {
            for (int columnCounter = 0; columnCounter < side ; columnCounter++) {
                System.out.print('*');
            }
            System.out.println();

        }
    }

    public int getrowCounter() {

        return rowCounter;
    }

    public int getcolumnCounter() {
        return columnCounter;
    }
}
