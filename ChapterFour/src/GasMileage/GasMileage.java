package GasMileage;

public class GasMileage {
    private int miles;
    private int gallon;
    private int totalmiles;
    private int totalGallon;
    private double milesPerGallon;
    private double totalMilesPerGallon;


    public GasMileage(int miles, int gallon, int totalmiles, int totalGallon, double milesPerGallon, double totalMilesPerGallon) {
        this.miles = miles;
        this.gallon = gallon;
        this.totalmiles = totalmiles;
        this.totalGallon = totalGallon;
        this.milesPerGallon = milesPerGallon;
        this.totalMilesPerGallon = totalMilesPerGallon;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getMiles() {
        return miles;
    }

    public void setGallon(int gallon) {
        this.gallon = gallon;
    }

    public int getGallon() {
        milesPerGallon = (double) miles / gallon;
        return gallon;
    }

    public void settotalMiles(int totalmiles) {

        this.totalmiles = totalmiles;
    }

    public int gettotalMiles() {
        totalmiles += miles;
        return totalmiles;
    }

    public void settotalGallon(int totalGallon) {

        this.totalGallon = totalGallon;
    }

    public int totalGallon() {
        totalGallon += gallon;
        return totalGallon;
    }


    public void setmilesPerGallon(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }


    public double getMilesPerGallon() {
        if (gallon != 0) {
            milesPerGallon = (double) miles / gallon;
        }
        return milesPerGallon;
    }


    public void settotalMilesPerGallon(double totalMilesPerGallon) {
        this.totalMilesPerGallon = totalMilesPerGallon;

    }

    public double gettotalMilesPerGallon() {
        if (totalMilesPerGallon != 0) {
            totalMilesPerGallon = (double) totalmiles / totalGallon;
        }
        return totalMilesPerGallon;

    }
}
