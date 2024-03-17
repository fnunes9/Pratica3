/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratica3;

/**
 *
 * @author Fernanda
 */
public class Calculos {
    public static float CalculaMedia(int  idade[]){
        float soma=0;
        for(int i=0;i<idade.length;i++){
            soma+=idade[i];
        }
        return soma/idade.length;
    }
}
