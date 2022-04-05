/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package celular;

/**
 *
 * @author Darko
 */
public class Telefono {
  
   public static void main (String[] args)
    {

      Celular cell = new Celular();
      cell.almacenamiento = 128;
      cell.RAM = 6;
      cell.camaraF = 20;
      cell.camaraT = 64;    
      cell.tamano = 6.67;
      cell.salidaAudio = 3.5;
      cell.lectorHuella = true;
      cell.puertoDeCarga = "tipo C";
      cell.color = "azul";
      cell.marca = "Xiaomi";


      System.out.println("El alamacenamiento interno del celular es de: "+ cell.almacenamiento);
      System.out.println("La memoria RAM del celular es de: "+ cell.RAM);
      System.out.println("Los megapixeles de las camaras son: "+cell.camaraF+" en la frontal y "+cell.camaraT+" en la trasera");
      System.out.println("El tama;o del celular en pulgadas es de: "+ cell.tamano);
      System.out.println("El celular "+(cell.lectorHuella? "si" : "no")+" tiene lector de huella");
    }

}
