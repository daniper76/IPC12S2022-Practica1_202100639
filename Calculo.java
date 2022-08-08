/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pack1;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Calculo {

    public int fila(){
        System.out.println("Ingrese la cantidad de filas");
        Scanner objeto1=new Scanner(System.in);
        int m=objeto1.nextInt();
        return m;}
    
    public int columna(){
        System.out.println("Ingrese la cantidad de columnas");
        Scanner objeto2=new Scanner(System.in);
        int n=objeto2.nextInt();
        return n;}
    
    public String [] array1(int fil){
        String arreglo1[]=new String [fil];
        System.out.println("Ingrese los valores fila por fila");
        Scanner objeto3=new Scanner(System.in);
        for(int i=0;i<fil;i++){
            arreglo1[i]=objeto3.next();
        }
        for(int i=0;i<fil;i++){
            System.out.println("Fila No."+i+"->>>>>>>"+arreglo1[i]);
        }
        return arreglo1;
    }
    
    public String [][] matriz1(String[] array2,int far, int fari){
        String matriz[][]=new String [far][fari];
        for(int b=0;b<far;b++){
            String frase;
            frase=array2[b];
            String contenedor[]=frase.split(",");
            for(int c=0;c<fari;c++){
                matriz[b][c]=contenedor[c];
            }
        }
        System.out.println("A continuación se muestra la matriz");
        for(int d=0;d<far;d++){
            System.out.println("\n");
            for(int e=0;e<fari;e++){
                System.out.print(matriz[d][e]+"\t");
            }
        }
    return matriz;
    }
    
    public double [][] matrizNumerica(String [][] matriz77,int far1,int fari1){
    double matrizNumeros [][]= new double[far1][fari1];
        for(int f=0;f<far1;f++){
            System.out.println("\n");
            for(int g=0;g<fari1;g++){
                matrizNumeros[f][g]=Double.valueOf(matriz77[f][g]);
            }
        }
        return matrizNumeros;
        
    }
    
    public double [][] matrizgauss(double [][] matrizUtilizable, int far2,int fari2){
    double matriz61[][]=matrizUtilizable;
    double numMatriz;
        for (int h=0;h<far2;h++){
            numMatriz=matriz61[h][h];
            for (int k=0;k<fari2;k++){
            matriz61[h][k]=matriz61[h][k]/numMatriz;
        }
        if(h<=far2-2){ 
            for(int k=h+1;k<far2; k++){
                numMatriz=matriz61[k][h];
                for(int m=0;m<fari2; m++){
                matriz61[k][m]=(matriz61[k][m]-(numMatriz*matriz61[h][m]));
                }
            
            }
        }
        }
        for(int h=far2-1;h>=1;h--){
            for(int k=h-1;k>=0;k--){
                numMatriz=matriz61[k][h];
                for(int m=fari2-2;m>=0;m--){
                    matriz61[k][m]=(matriz61[k][m]-(numMatriz*matriz61[h][m]));
                }
            }
        
        }
    return matriz61;  
    }
    public void respuesta(double [][] matrizrespueta, int far3, int fari3){
        for(int t=0;t<far3;t++){
            System.out.println("\n");
            for(int u=0;u<fari3;u++){
                System.out.print(matrizrespueta[t][u]+"\t");
            }
    
    }
    }
}