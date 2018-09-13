
import java.util.Scanner;

public class Caixa {
    double saldo = 0;
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int opcao = 1;
        Caixa obj = new Caixa();
        while(opcao != 0){
        obj.menu();
        System.out.println("Escolha uma opção: ");
        opcao= tcl.nextInt();
        switch(opcao){
            case 1 : obj.Saldo();
            break;
            case 2 : obj.Sacar();
            break;
            case 3 : obj.Depositar();
            break;
            case 4 : System.exit(0);          
            break;
            default:
                System.out.println("Opção inválida");
            }
        }
    }
    public void menu(){
        System.out.println("CAIXA ELETRONICO");
        System.out.println(" ");
        System.out.println("1 - SEU SALDO");
        System.out.println("2 - SAQUE");
        System.out.println("3 - DEPOSITE");
        System.out.println("4 - SAIR");
        System.out.println(" ");
    }
    public void Saldo(){
        System.out.println("Seu saldo é de R$:"+saldo);
    }
    public double Sacar(){
        Scanner tcl = new Scanner(System.in);
        System.out.println("VALOR A SER SACADO:");
        double sacar = tcl.nextDouble();
        saldo = saldo - sacar;
        return saldo;   
    }
    public double Depositar(){
        Scanner tcl = new Scanner(System.in);
        System.out.println("VALOR A SER DEPOSITADO:");
        double dep = tcl.nextDouble();
        saldo = saldo + dep;
        return saldo;
    }
  
}