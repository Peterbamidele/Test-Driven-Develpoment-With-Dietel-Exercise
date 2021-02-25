package Tv;

public class Tv {


    private int channel;
    private int volumelevel;
    private boolean on= false;


//    public Tv(int channel, int volumelevel, boolean on) {
//        this.channel = channel;
//        this.volumelevel = volumelevel;
//        this.on = on;
//    }

    public boolean isOn() {
        return on;
    }

    // setter method
    public void turnOn() {
         on = true;
    }

    public void turnOff() {
        on = false;
    }


    public void setChannel(int newChannel) {
        if (on && newChannel >1 && newChannel <=100)
         this.channel = newChannel;
    }

    public void setvolumelevel(int newVolumelevel) {
        if (on && newVolumelevel >1 && newVolumelevel <= 70)
        volumelevel = newVolumelevel;
    }


    public void setchannelUp(int newChannel) {
        if (on && newChannel <100 )
            channel++;


    }

    public void setchannelDown(int newChannel) {
        if (on && newChannel >1 )
            channel--;
    }

    public void setvolumelevelup(int newVolumelevel) {
        if (on && newVolumelevel < 70)
            volumelevel++;

    }

    public void setvolumelevelDown(int newVolumelevel) {
        if (on && newVolumelevel > 1)
        volumelevel --;
    }


// getter method

    public int getChannel() {
        return channel;
    }

    public int getvolumelevel() {
        return volumelevel;
    }

    public int getchannelup() {
        return channel;
    }

    public int getchannelDown() {
        return channel;
    }


    public int getvolumelevelup() {
        return volumelevel;
    }


    public int getvolumelevelDown() {
        return volumelevel;
    }



    }