/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import java.util.Scanner;

/**
 *
 * @author nacho pedir una hora pedir una segundz hora, e indicar que hora
 * marcaria el reloj si le sumamos la segunda hora a la primera hr=5
 */
public class Pr14_SumarHoras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reloj = 0, hora = 0, salida = 0;
        //entrada
        System.out.println("Que hora marca el reloj?: ");
        reloj = sc.nextInt();
        System.out.println("Cuantas horas deseas calcular?: ");
        hora = sc.nextInt();
        //proceso
        //suma de reloj + hora
        //1.- salida=reloj+hora
        //2.- salida=12=-(reloj+hora)
        //proceso
        salida = (reloj+hora)%12;
        System.out.println("el reloj marca las "+salida);
    }
}
