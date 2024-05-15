import java.util.Scanner; // Importa a classe Scanner

public class App {
  
    public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);
        int opcao;
                
        System.out.println("Seja Bem Vindo ao Banco Viana");
        System.out.println("Escolha a opção desejada");
        System.out.println("Digite o numero para cada opção");
        System.out.println(" 1 - Cadastrar novo cliente");
        System.out.println(" 0 - Sair");

        opcao = scanner.nextInt();

        switch(opcao){
            case 1:
            System.out.println("Por favor, digite o número da Agência !");
            int numero =scanner.nextInt();
            conta.setNumero(numero);
            break;


            default:
            System.out.println("Opção invalida");
            break;
        }
               
        scanner.close(); // Fechando o Scanner para liberar recursos

    }
}
