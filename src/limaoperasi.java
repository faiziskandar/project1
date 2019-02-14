/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc 19
 */
public class limaoperasi {
    public static void main(String[] args){
    int nom1,nom2,nom3,nom4;    
    int jwb1,jwb2,jwb3,jwb4,jwb5;
    
    nom1=4;
    nom2=2;
    nom3=8;
    nom4=3;
    
    jwb1= nom1+nom2;
    jwb2= nom1-nom2;
    jwb3= nom1 *nom2;
    jwb4=nom1/nom2;
    jwb5=nom3%nom4;
        
     System.out.println("hasil Tambah:"+nom1+ '+' +nom2+'='+jwb1);
     System.out.println("hasil Tolak:"+nom1+ '-' +nom2+ '='+jwb2);
    System.out.println("hasil Darab:"+nom1+ '*' +nom2+ '='+jwb3);
    System.out.println("hasil Bahagi:"+nom1+ '/' +nom2+ '='+jwb4);
    System.out.println("hasil modulus:"+nom3+ '%' +nom4+ '='+jwb5);
    
    
    }
}
