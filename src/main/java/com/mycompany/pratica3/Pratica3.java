/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Pratica3;

/**
 *
 * @author Fernanda
 */
import com.mycompany.pratica3.Calculos;
import java.util.Arrays;
import java.util.Scanner;

public class Pratica3 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        System.out.println("Faça um programa que leia a idade de 10 pessoas, calcule e mostre a média de idade das mesmas.");
        int idade[]=new int [10];
        idade[0]=input.nextInt();
        idade[1]=input.nextInt();
        idade[2]=input.nextInt();
        idade[3]=input.nextInt();
        idade[4]=input.nextInt();
        idade[5]=input.nextInt();
        idade[6]=input.nextInt();
        idade[7]=input.nextInt();
        idade[8]=input.nextInt();
        idade[9]=input.nextInt();
        System.out.println(Calculos.CalculaMedia(idade));
        
        System.out.println("Faça um programa que leia um número e que imprima os números ímpares de 1 até o número informado");
        int impar=input.nextInt();
        System.out.println(Calculos.MostraImpar(impar)); */

        System.out.println("""
                           Fa\u00e7a um programa que leia a idade e peso de sete pessoas. Calcule e mostre:
                           \t- a quantidade de pessoas com mais de 90 kg
                           \t- a m\u00e9dia das idades das sete pessoas""");
        int idade[] = new int[7];
        float peso[] = new float[7];

        for (int i = 0; i < idade.length; i++) {
            idade[i] = input.nextInt();
            peso[i] = input.nextFloat();
        }
        System.out.println(Arrays.toString(idade));
        System.out.println(Arrays.toString(peso));
        System.out.println("Média das idades: " + Calculos.CalculaMedia(idade));
        System.out.println("Número de pessoas com peso maior que 90kg: " + Calculos.PesoMaior90(peso));

    }

}
