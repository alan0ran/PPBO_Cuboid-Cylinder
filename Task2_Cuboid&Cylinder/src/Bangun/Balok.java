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
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double height;

    public Balok(double Length, double Width, double Height){
        super(Width,Length);
        height = Height;
    };   
    public double getHeight(){
        return height;
    }   
    public void setHeight(int Height){
        height = Height;
    }

    @Override
    public double surface() {
        return 2 * (super.area() + (super.getLength()*height) + (super.getWidth()*height));
    }
    @Override
    public double volume() {
        return super.area() * height;
    }
}
