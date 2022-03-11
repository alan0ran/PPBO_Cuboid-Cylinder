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
public class PersegiPanjang implements MenghitungBidang {
    private double width,length;
    
    public PersegiPanjang(double Length, double Width){
        length = Length;
        width = Width;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return length * width;
    }
    @Override
    public double circumference() {
        return 2 * (length + width);
    }
}
