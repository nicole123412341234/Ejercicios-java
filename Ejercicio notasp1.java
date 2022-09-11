package clase14ejercicio1;
import java.util.Scanner;
public class Clase14ejercicio1 {
  public static void main(String [] args) {
    Scanner Entrada = new Scanner(System.in);
    int reglas;
    double nota;
    System.out.println("Usted cumple las reglas de la universida: ");
    System.out.println("Ingrese un numero: \n1. Siempre\ n2. Aveces \n 3. Nunca");
    reglas = Entradas.nextInt();
    System.out.println("Que nota obtuvo en el laboratorio: ");
    nota = Entrada.nextDouble();
    if (reglas == 1) {
      if (nota >= 8 & nota <= 10) {
        nota = 10;
      } else {
        System.out.println("Nota invalida");
      }
    } else if (reglas == 2) {
      if (nota < 6){
        nota = nota + 0.5;
      } else if (nota >=6 & nota < 8) {
        nota = nota + 0.7;
      } else {
        System.out.println("Nota invalida";
      }
    } else {
      System.out.println("Usted debe cumplir las reglas");      
    }
    System.out.prinltln("La nueva nota es: " + nota);
    }}
