import java.util.Scanner;

public class App {
    /*Ejercicio 2: Guillemo tiene N dolares. Luis tiene la mitad de loq ue posee Guillemo.
    Juan tiene la mitad de lo poseen Luis y Guillemo juntos. Hacer un porgama que calcule
    e imprima la cantidad de dinero que tieen entre los 3 */

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        float luis, guillemo, juan;
        System.out.println("Digite cuando dinero tiene Guillemo: ");
        
        guillemo = entrada.nextFloat();

        luis = guillemo/2;

        juan = (guillemo+luis)/2;

        System.out.println("La cantidad de Guillemo: " + guillemo);
        System.out.println("La cantidad de Luis: "+ luis);
        System.out.println("La cantidad de Juan: " + juan);


    }


}
