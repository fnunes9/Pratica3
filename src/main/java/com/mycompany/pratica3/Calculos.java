/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratica3;

/**
 *
 * @author Fernanda
 */
import java.util.ArrayList;
import java.util.List;

public class Calculos {
    public static float CalculaMedia(int  idade[]){
        float soma=0;
        for(int i=0;i<idade.length;i++){
            soma+=idade[i];
        }
        return soma/idade.length;
    }
    public static List<Integer> MostraImpar(int impar){ //Criando um método do tipo List<Integer>
        List <Integer> impares=new ArrayList<>(); // Instaciando Objeto 
        for(int i=1;i<=impar;i++){
            if (i%2!=0){
                impares.add(i); // adicionando cada número impar ao array impares
            }
        }
        return impares; // Retoando a lista
        // Tentei criar um vetor int vetor[]=new int[impar.lenght]; para testar e não funcionou. Acredito que o método em questão precisa ser do tipo Lista 
    }

    /**
     *
     * @param peso
     * @return
     */
    public static float VerificaPeso(float peso){
        float count=0;
        for(int i=1;i<=peso;i++){
            if(peso>=90){
                count++;
                }
            }
        return count;
        }

    }
    

