import java.util.Scanner;
public class atividade{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int qtdAnos;
        int horasT;
        float valorHora;
        float salariofinal;
        float salario;
        System.out.println("Quantos anos o funcionario trabalha:");
        qtdAnos=leia.nextInt();
        System.out.println("Quantas horas o funcionario trabalha:");
        horasT=leia.nextInt();
        System.out.println("quanto tempo o funcionario trabalha:");
        valorHora=leia.nextInt();
        if(qtdAnos<1){
            salariofinal=1500;
            salario=(horasT*valorHora*salariofinal);
            System.out.println("o salario é:"+ salario);
        }
        else if((qtdAnos>1)&&(qtdAnos<3)){
            salariofinal=2000;
            salario=(horasT*valorHora*salariofinal);
            System.out.println("o salario é:"+ salario);
        }
        else if(qtdAnos>3){
            salariofinal=3000;
            salario=(horasT*valorHora*salariofinal);
            System.out.println("o salario é:"+ salario);
    }
    }
}
