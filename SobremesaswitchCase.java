/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author senai
 */
public class SobremesaswitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Carro básico\n Carro completo\n");
         Scanner input = new Scanner (System.in );       
         int carro=input.nextInt();
         switch (carro){
             case 1:
              System.out.println("carro básico");          
              break;
              case 2:
                  System.out.println("carro completo");
         }
    }
    
}
