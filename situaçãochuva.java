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
public class situaçãochuva {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("escolha 1=sim  ou 2=não");
         Scanner input = new Scanner (System.in );
         int situacao=input.nextInt();
         switch (situacao){
            case 1:
            System.out.println("esta  chovendo");
            break;
            case 2:
            System.out.println("Não esta chovendo");
            break;
        }
         
    }
}
