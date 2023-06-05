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
public class SbremesaElseif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Qual sobremesa você deseja?\n1 para bombom\n2 para pudim\n3 para café");
         Scanner input = new Scanner (System.in );       
         int sobremesa=input.nextInt();
         switch (sobremesa){
              case 1:
              System.out.println("Bombom");          
              break;
              case 2:
              System.out.println("Pudim");
              break;
              case 3:
              System.out.println("café");
              
         }
    }
    
}
