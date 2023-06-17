package practicas;
import java.util.Scanner;
/**
 * @author nacho
 * este programa debera pedir al usuario su fecha de nacimiento.
 * y debera calcular la edad del usuario(años,meses y dias).
 */
public class Pr10_FechaNacimiento {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //variables
        int dn, mn, an, edad, mes=0, dia=0, da, ma, aa;
        //pedir todos los datos al usuario
        System.out.println("Fecha de nacimiento: ");
        System.out.println("Dia: ");
        dn=sc.nextInt();
        System.out.println("Mes: ");
        mn=sc.nextInt();
        System.out.println("Año: ");
        an=sc.nextInt();
        System.out.println("Ingresa la fecha del dia de hoy: ");
        System.out.println("Dia: ");
        da=sc.nextInt();
        System.out.println("Mes: ");
        ma=sc.nextInt();
        System.out.println("Año: ");
        aa=sc.nextInt();
        //procesos
        //vamos a restar años       15-ago-20            28-sep-20
        edad=aa-an;//20
        //Vamos a comparar los meses
        if (mn<=ma) {//si mes_nac menor o gual mes_actual
            mes=ma-mn;//1            
        }else{
            mes=(12+ma)-mn;//10
            edad=edad-1;
        }
        //termina el if y el else de los meses
        if (dn<=da) {//si dia_nac menor o igual a dia_actual
            dia=da-dn;//13
        }else{    //si el dia_nac es mayor que el dia actual
           dia=(30+da)-dn;//al dia actual, le sumo 30, y le resto el dia_nac
            if (ma==mn) { //si mes de nac y mes actual, coinciden, entonces
                            //aun No cumple años por lo cual modificamos datos
                mes=11;  //11 meses
                edad=edad-1;//19 años
            }
        }
        System.out.println("Tienes "+edad+" años, "+mes+" mes(es), "+dia+" dias");
    }
}
