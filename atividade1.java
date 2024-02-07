import java.util.Scanner;
public class atividade1{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int valor1;
        int valor2;
        int primeiro;
        System.out.println("digite o primeiro valor");
        valor1=leia.nextInt();
        System.out.println("digite o segundo valor");
        valor2=leia.nextInt();
        if(valor1>valor2){
            primeiro=valor1;
            System.out.println("O primeiro valor vem primeiro^_^");
        }else if(valor2>valor1){
            primeiro=valor2;
            System.out.println("O segundo valor vem primeiro^_^");
        }
        else
            System.out.println("os dois valores é iguais:)");
        }
    }