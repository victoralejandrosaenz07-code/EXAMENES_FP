/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg25550472_exa_1;

import java.util.Scanner;

/**
 *
 * @author Alejandro Saenz
 */
public class Main {
     final static String USUARIO = "victor";
    final static String PWD ="1601";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String usu, contra;
     Scanner input = new Scanner(System.in);
     System.out.println("*******bienvenido*****");
     System.out.println("ingrese su contraseña");
     System.out.println("USUSARIO: ");
     usu = input.nextLine();
     System.out.println("CONTRASEÑA: ");
     contra = input.nextLine();
     
     if(usu.equals(USUARIO)){//COMPARAR CADENAS
         if(contra.equals(PWD)){
         System.out.println("ACCESO CONSEDIDO");
     }else{
         System.out.println("ACCESO DENEGADO");
         }
     }else{
             System.out.println("ACCESO ");
             }
     System.out.println("saldo total de la cuenta: 5000");
     System.out.println("preciona 2 si decea retirar dinero: ");
     
      
    }
    
}