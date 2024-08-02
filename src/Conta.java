import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner opcao=new Scanner(System.in);
        String nome="Bruce";
        String tipoDeConta="Corrente";
        double saldo=3000;
        int escolha;
        System.out.println("******************************");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome: "+nome+"\nTipo de conta: "+tipoDeConta+"\nSaldo inicial: R$3000,00");
        System.out.println("******************************");
        System.out.println("\nOperações:\n");
        System.out.println("1-Consultar saldo.\n2-Receber valor.\n3-Transferir valor.\n4-Sair.");
        escolha=opcao.nextInt();
        while(escolha!=4){
            if(escolha==1) {
                System.out.println("Seu saldo atual é de: R$"+saldo);
                System.out.println("\nOperações:\n");
                System.out.println("1-Consultar saldo.\n2-Receber valor.\n3-Transferir valor.\n4-Sair.");
                escolha=opcao.nextInt();
            }
            if(escolha==2) {
                System.out.println("Digite o valor que deseja:");
                double valor=opcao.nextDouble();
                if(valor>0){
                    saldo+=valor;
                }else{
                    System.out.println("Número digitado é inválido.");
                }
                System.out.println("\nSeu saldo atual é de: R$"+saldo);
                System.out.println("\nOperações:\n");
                System.out.println("1-Consultar saldo.\n2-Receber valor.\n3-Transferir valor.\n4-Sair.");
                escolha=opcao.nextInt();
            }
            if(escolha==3) {
                System.out.println("Digite o valor que deseja:");
                double valor=opcao.nextDouble();
                if(valor<0){
                    System.out.println("Número digitado é inválido.");
                }else if(valor>saldo){
                    System.out.println("Saldo insuficiente.");
                }else if(valor>0){
                    saldo-=valor;
                }
                System.out.println("\nSeu saldo atual é de: R$"+saldo);
                System.out.println("\nOperações:\n");
                System.out.println("1-Consultar saldo.\n2-Receber valor.\n3-Transferir valor.\n4-Sair.");
                escolha=opcao.nextInt();
            }
            if(escolha>4){
                System.out.println("A opção escolhida é inválida.");
                System.out.println("\nSeu saldo atual é de: R$"+saldo);
                System.out.println("\nOperações:\n");
                System.out.println("1-Consultar saldo.\n2-Receber valor.\n3-Transferir valor.\n4-Sair.");
                escolha=opcao.nextInt();
            }
        }
        System.out.println("Muito obrigado!! Até a próxima.");
    }
}
