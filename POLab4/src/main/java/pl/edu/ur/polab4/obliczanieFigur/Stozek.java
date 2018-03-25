package pl.edu.ur.polab4.obliczanieFigur;

public class Stozek {
    public double promien;
    public double tworzaca;
    public double wysokosc;
    public double pole;
    public double objetosc;

    public Stozek(double promien, double tworzaca, double wysokosc) {
        this.promien = promien;
        this.tworzaca = tworzaca;
        this.wysokosc = wysokosc;
    }

    public void PStozek(){
        this.pole = (3.14*(promien*promien)) + 3.14*promien*tworzaca;
        this.objetosc = (1/3)*3.14*(promien*promien)*wysokosc;
        System.out.println("Pole calkowite stozka: "+this.pole);
        System.out.println("Objetosc stozka: "+this.objetosc);
    }


}
