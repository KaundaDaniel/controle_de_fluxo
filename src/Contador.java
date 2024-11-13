import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contador {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = sc.nextInt();
        try {
            contar(numero1, numero2);
        } catch (ParamentrosInvalidosExeceptions e) {
            System.out.println(e.getMessage());
        }

      }
      static void contar(int numero1, int numero2) throws ParamentrosInvalidosExeceptions{
        //1,2; -1,2; 0,0; 2,-4
        if(numero1>numero2){

            throw new ParamentrosInvalidosExeceptions("O primeiro número não pode ser maior que o segundo número!");
        }else {
            for(int i=numero1; i<=numero2; i++){
                System.out.println(i);
            }
        }

      }
}