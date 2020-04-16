package edu.upc.eetac.dsa;
import javax.swing.*;
import java.io.StringReader;
import java.util.Stack;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            int x = 0;
            Stack S= new Stack();

            Scanner reader = new Scanner(System.in);

            while(x<10) {
                System.out.println("Que quieres hacer?\n" +
                        "1.Introducir palabra\n" +
                        "2.Buscar palabra\n" +
                        "3.Quitar palabra\n" +
                        "4.Saber si esta vacia la pila\n");
                int numero =0;

                numero =reader.nextInt();
                String palabra = reader.nextLine();

                switch (numero) {
                    case 1:
                        System.out.println("La palabra introducida es:'"+palabra+"'");

                        S.push(palabra); //pone una palabra
                        break;
                    case 2:

                        System.out.println("La palabra que quieres buscar es:'"+palabra+"'");

                        S.search(palabra);
                        break;
                    case 3:
                        S.pop();
                        break;
                    case 4:
                       boolean z= S.empty();
                       if (z == true)
                        {
                             System.out.println("Esta vacio no hay nada que eliminar");
                          }
                       else
                            System.out.println("No esta vacio");
                        break;

                    default:
                        break;
                }

                System.out.println(S);
              x++;

            }
        }



}
