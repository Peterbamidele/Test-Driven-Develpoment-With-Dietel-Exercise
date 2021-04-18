package Calculator;

public class Calculator {

    private int firstValue;
    private int secondValue;

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;

    }

    public void setsecondValue(int secondValue) {
        this.secondValue = secondValue;
    }

    public int getadditions() {
        return firstValue + secondValue;
    }

    public int getSubtraction() {
        return firstValue - secondValue;
    }

    public int getMutiplication() {
        return firstValue * secondValue;
    }

    public double getDivision() {
        return firstValue / secondValue;
    }

    public double getpercentage() {
        return firstValue / 100;
    }
}
