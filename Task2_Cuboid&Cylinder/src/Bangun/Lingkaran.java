/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bangun;
import Interface.MenghitungBidang;

/**
 *
 * @author radiv
 */
public class Lingkaran implements MenghitungBidang{
    private double r;
    double phi = 3.14;
    
    public Lingkaran(double R){
        this.r = R;
    };
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
    
    
    @Override
    public double area() {
        return phi * (r * r);
    }
    @Override
    public double circumference() {
        return 2 * phi * r;
    }
}
