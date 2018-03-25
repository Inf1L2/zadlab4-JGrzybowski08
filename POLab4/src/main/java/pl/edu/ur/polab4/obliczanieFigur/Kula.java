package pl.edu.ur.polab4.obliczanieFigur;

public class Kula {
    public double promien;
    public double pole;
    public double objetosc;

    public Kula(double promien) {
        this.promien = promien;
    }
    public void PKula(){
        this.pole = 4*3.14*(promien*promien);
        this.objetosc = (4/3)*3.14*(promien*promien*promien);
        System.out.println("Pole Kuli: "+this.pole);
        System.out.println("Objetosc Kuli: "+this.objetosc);
    }


}