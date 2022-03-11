/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task2_cuboid.cylinder;
import Bangun.Balok;
import Bangun.Tabung;
import java.util.Scanner;

/**
 *
 * @author radiv
 */
public class Main {
     public static void main(String[] args){
        int option;
        int repeat = 0;
        double p, l, t, r;
        Scanner input = new Scanner(System.in);
     
        do{
        System.out.println("==========");
        System.out.println("Menu Utama");
        System.out.println("==========");
        System.out.println("1. Hitung Balok");
        System.out.println("2. Hitung Tabung");
        System.out.println("0. Exit");
        System.out.print("Pilih : ");
        option = input.nextInt();
        
            if (option == 1){
                System.out.print("Input Panjang : ");
                p = input.nextInt();
                System.out.print("Input Lebar : ");
                l = input.nextInt();
                System.out.print("Input Tinggi : ");
                t = input.nextInt();

                Balok beam = new Balok(p,l,t);

                System.out.println("Luas Persegi Panjang = " + beam.area());
                System.out.println("Keliling Persegi Panjang = " + beam.circumference());
                System.out.println("Volume Balok = " + beam.volume());
                System.out.println("Luas Permukaan Balok = " + beam.surface());
                System.out.print("Ulangi? ( Ya : 1 || Tidak : 0 ) ");
                repeat = input.nextInt();   
            }
            else if (option == 2){
                System.out.print("Input Tinggi : ");
                t = input.nextInt();
                System.out.print("Input Jari - jari : ");
                r = input.nextInt();
                
                Tabung tube = new Tabung(r,t);
                
                System.out.println("Luas Lingkaran = " + tube.area());
                System.out.println("Keliling Lingkaran = " + tube.circumference());
                System.out.println("Volume Tabung = " + tube.volume());
                System.out.println("Luas Permukaan Tabung = " + tube.surface());
                System.out.print("Ulangi? ( Ya : 1 || Tidak : 0 ) ");
                repeat = input.nextInt();
            } 
        }while(repeat == 1 && option != 0);
    }
}
