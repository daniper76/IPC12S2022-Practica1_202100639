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
public class Aritmetica {
    public void suma(){
        Scanner ob1=new Scanner(System.in);
        System.out.println("Ingrese dos números");
        System.out.print("<>");
        double num1=ob1.nextDouble();
        System.out.print("<>");
        double num2=ob1.nextDouble();
        double resuma;
        resuma=num1+num2;
        System.out.println("\n");
        System.out.println("El resultado de la suma de los dos números es: "+resuma);
    }
    public void resta(){
        Scanner ob2=new Scanner(System.in);
        System.out.println("Ingrese dos números");
        System.out.print("<>");
        double num3=ob2.nextDouble();
        System.out.print("<>");
        double num4=ob2.nextDouble();
        double reresta;
        reresta=num3-num4;
        System.out.println("\n");
        System.out.println("El resultado de la resta de los dos números es: "+reresta);
    }
    public void multiplicacion(){
        Scanner ob3=new Scanner(System.in);
        System.out.println("Ingrese dos números");
        System.out.print("<>");
        double num5=ob3.nextDouble();
        System.out.print("<>");
        double num6=ob3.nextDouble();
        double remulti;
        remulti=num5*num6;
        System.out.println("\n");
        System.out.println("El resultado de la multiplicación de los dos números es: "+remulti);
    }
    public void division(){
        Scanner ob4=new Scanner(System.in);
        boolean bandeArit=true;
        while(bandeArit){
            System.out.println("Ingrese dos números");
            System.out.print("<>");
            double num7=ob4.nextDouble();
            System.out.print("<>");
            double num8=ob4.nextDouble();
            double redivi;
            if (num8==0){
                System.out.println("No se puede dividir un número entre cero");
                System.out.println("Ingrese otro número");
            }
            else {
                redivi=num7/num8;
                System.out.println("El resultado de la division de los dos números es: "+redivi);
                bandeArit=false;
            }
        }
    }
    public void potencia(){
        Scanner ob5=new Scanner(System.in);
        boolean bandePotencia=true;
        while(bandePotencia){
            System.out.print("Ingrese un número:->>>>>>> ");
            double num9=ob5.nextDouble();
            System.out.print("Ingrese a que número de potencia desea elevar el número previamente ingresado:->>>>>>> ");
            double num10=ob5.nextDouble();
            if (num10<=0){
                System.out.println("Ingrese un número mayor a cero");
            }
            else {
                double ema=num9;
                if (num10==1){
                    System.out.println("El resultado de la division de los dos números es: "+num9);
                    bandePotencia=false;
                }
                else{
                    for(int i=0; i<num10-1;i++){
                        ema=ema*num9;
                    }
                    System.out.println("La respuesta es: "+ema);
                    bandePotencia=false;
                }
            }
        } 
    
    
    
    }
}
