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
public class Trigonometría {
    public double privalor(double n){
    double valor1=-1;
    if (n==0){
       valor1=1;
    }
    else{
        if (n==1){
        valor1=-1;
        }
        else{
        for(int a=0; a<n-1; a++){
            valor1=valor1*(-1);
        }
        
        }
    
    }
   
    
    
    return valor1;
    }
    
    public double segundovalor(double n, double x){
    double valor2=x;
    double p=(2*n)+1;
        if (p==1){
            valor2=x;
        }
    else{
        for(int b=0; b<p-1; b++){
            valor2=valor2*x;
        }
        
        }
    return valor2;
    }
    
    public double tercervalor(double n){
    double valor3=1;
    double q=(2*n)+1;
    if (q==1){
            valor3=1;
        }
    else{
        for(int c=1; c<=q; c++){
            valor3=valor3*c;
        }
        
        }
    return valor3;
    }
    
    public double valorcoseno1(double u){
    double valcoseno1=-1;
    if (u==0){
       valcoseno1=1;
    }
    else{
        if (u==1){
        valcoseno1=-1;
        }
        else{
        for(int d=0; d<u-1; d++){
            valcoseno1=valcoseno1*(-1);
        }
        
        }
    
    }
    return valcoseno1;
    }
    
     public double valorcoseno2(double u, double r){
    double valcoseno2=r;
    double w=2*u;
        if (w==0){
            valcoseno2=1;
        }
    else{
        for(int f=0; f<w-1; f++){
            valcoseno2=valcoseno2*r;
        }
        
        }
    return valcoseno2;
    }
     
    public double valorcoseno3(double u){
    double valcoseno3=1;
    double t=2*u;
    if (t==0){
            valcoseno3=1;
        }
    else{
        for(int g=1; g<=t; g++){
            valcoseno3=valcoseno3*g;
        }
        
        }
    return valcoseno3;
    }
    
}
