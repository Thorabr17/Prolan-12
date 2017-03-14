/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futsal;

/**
 *
 * @author MTAbrori_17
 */
public class Futsal
{
    String nama,tim,kaki,kepala,tangan,namakaos;
	int berat,tinggi,nopung;
	byte usia,nomorsepatu;
	char kelaminpemain;
	
    

    public void menendang()
	{
     kaki="menendang";
     System.out.println("Kakinya digunakan untuk "+kaki+"");    
	}
	 public void mencetakgol()
	{
     this.kaki="mencetak gol";
     System.out.println("kakinya juga bisa digunakan untuk "+kaki+"");    
	}
	
	public void menyundul()
	{
    kepala="menyundul";
    System.out.println("Kepalanya digunakan untuk "+kepala+"");    
	}
    
	 public void membuatgol()
	{
     this.kepala="mencetak gol";
     System.out.println("kepalanya juga bisa digunakan untuk "+kepala+"");    
	}
    public void menangkap() 
	{
    tangan="menangkap bola";
    System.out.println("tangannya digunakan untuk "+tangan+"");    
	}
    
    public void handsball() 
	{
    this.tangan="handsball";
    System.out.println("jika bola mengenai tangan pemain maka "+tangan+"");    
	}
    
}
