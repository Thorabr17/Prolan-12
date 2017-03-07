/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ikan;

/**
 *
 * @author MTAbrori_17
 */
public class Ikan 
{
    String jenis;
    String warna;
    String mata;
    String mulut;
    String sirip;
	String ekor;
	String insang;
    

    public void makan()
	{
     this.mulut="makan";
     System.out.println("Mulutnya digunakan untuk "+mulut+"");    
	}
	
	public void bernafas()
	{
     this.insang="bernafas";
     System.out.println("Insangnya digunakan untuk "+insang+"");    
	}
    
    public void berenang() 
	{
    this.ekor="berenang";
    System.out.println("Ekornya digunakan untuk "+ekor+"");    
	}
    
    public void bergerak() 
	{
    this.sirip="bergerak";
    System.out.println("Sirip ikan itu untuk "+sirip+"");    
	}
    
}

