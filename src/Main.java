import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Krislayne Vieira";
        String contaBancaria = "Conta corrente";
        double saldo = 5000;
        int opcao = 0;

        System.out.println(String.format(
                """
                        *********************************
                                        
                        Dados iniciais do cliente:
                                        
                        Nome: %s;
                        Tipo de conta: %s;
                        Saldo inicial: R$ %.2f;
                                     
                                        
                        *********************************            
                        """, nome, contaBancaria, saldo));


        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println("""
                    Operações
                                    
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                                    
                    Digite a opção desejada: 
                    """);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("O seu saldo disponivel é R$  " + saldo);
            }

            else if (opcao == 2){
                System.out.println("Qual valor você quer receber? ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("O novo valor do seu saldo é " + saldo);
            }
            else if (opcao == 3) {
                System.out.println("Qual valor você quer transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo disponível para a transferencia");
                }
                    else {
                        saldo -= valor;  //é o mesmo que saldo = saldo - valor
                        System.out.println("Novo saldo é R$ " + saldo);
                    }
            }

            else if (opcao == 4) {
                System.out.println("Saindo do sistema...");
            }

            else if (opcao !=4){
                System.out.println("Opção inválida!");
            }
        }
    }
}