package DisplayingaSquareofAnyCharacter;

public class DisplayingaSquareofAnyCharacter {

    private int rowCounter;
    private int columnCounter;

    public void SquareOfCharacter(int side, char character) {
        for (int rowCounter = 0; rowCounter < side; rowCounter++) {
            for (int columnCounter = 0; columnCounter < side; columnCounter++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

    public int getrowCounter() {

        return rowCounter;
    }

    public int getcolunmCounter() {
        return columnCounter;
    }
}
