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
public class calculotriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite a altura da sua base");
            double base=scanner.nextDouble();
        System.out.println("Digite sua altura");
            double altura=scanner.nextDouble();
        
            double triangulo=base*altura/2;
        System.out.println(triangulo);
        
 }
    
}
