package pl.edu.ur.polab4.obliczanieFigur;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        int menu;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1 - Kolo ");
        System.out.println("Wybor: ");
        menu = odczyt.nextInt();
        switch(menu){
            case 1: {
                System.out.print("Podaj promien: ");
                Kolo kolo = new Kolo(odczyt.nextDouble());
                kolo.PKolo();
                break;
            }
            case 2:{
                System.out.print("Podaj bok: ");
                Kwadrat kwadrat = new Kwadrat(odczyt.nextDouble());
                kwadrat.PKwadrat();
                break;
            }
            case 3:{
                System.out.print("Podaj bok a i bok b: ");
                Prostokat prostokat = new Prostokat(odczyt.nextDouble(),odczyt.nextDouble());
                prostokat.PProstokat();
                break;
            }
            case 4:{
                System.out.print("Podaj bok a: ");
                Szescian szescian = new Szescian(odczyt.nextDouble());
                szescian.PSzescian();
                break;
            }
            case 5:{
                System.out.print("Podaj bok a, bok b i wysokosc: ");
                Prostopadloscian prostopadloscian = new Prostopadloscian(odczyt.nextDouble(),odczyt.nextDouble(),odczyt.nextDouble());
                prostopadloscian.PProstopadloscian();
                break;
            }
            case 6:{
                System.out.print("Podaj promien: ");
                Kula kula = new Kula(odczyt.nextDouble());
                kula.PKula();
                break;
            }
            case 7:{
                System.out.print("Podaj promien, tworzaca i wysokosc: ");
                Stozek stozek = new Stozek(odczyt.nextDouble(),odczyt.nextDouble(),odczyt.nextDouble());
                stozek.PStozek();
                break;
            }










        }



    }

}
