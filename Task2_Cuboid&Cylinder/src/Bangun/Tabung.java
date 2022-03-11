/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bangun;
import Interface.MenghitungRuang;

/**
 *
 * @author radiv
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    private double height;

    public Tabung(double r, double Height){
        super(r);
        this.height = Height;
    };
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double surface() {
        return 2 * phi * super.getR()*(super.getR() + height);
    }
    @Override
    public double volume() {
        return super.area() * height;
    }
}
