package Date;

import java.util.Random;

public class Date {

    public Random scanner;
    private int month ;
    private int day ;
    private int year;


    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;

    }

    public void setMonth(int month) {
        if(month <= 12) {
            this.month = month;

        }
        else {
            throw new IllegalArgumentException("Month should not be greater than 12");
        }
    }

    public void setDay(int day) {
        if (day <= 31)
            this.day = day;
        else {

            throw new IllegalArgumentException("day should not be greater than 31");
        }
    }

    public void setYear(int year) {
         if(year <= 0)
       throw new IllegalArgumentException("Year is not be 000 ");

        this.year = year;
    }

    public int getmonth() {

        return month;
    }
    public int getday() {

        return day;
    }

    public int getyear() {


        return year;
    }

}
