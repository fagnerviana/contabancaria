import java.util.Locale;
import java.util.Scanner; // Importa a classe Scanner

public class App {
  
    public static void main(String[] args) throws Exception {
    	
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int opcao;
        CaixaEletronico caixaeltronico = new CaixaEletronico();
                
        
        
        do {
        	System.out.println("\n");
        	System.out.println("Seja Bem Vindo ao Banco Viana");
            System.out.println("Escolha a opção desejada");
            System.out.println("Digite o numero para cada opção");
            System.out.println(" 1 - Cadastrar novo cliente");
            System.out.println(" 2 - Depositar Valor");
            System.out.println(" 3 - Pesquisar Cliente");
            System.out.println(" 0 - Sair");

            opcao = scanner.nextInt();

        switch(opcao){
            case 1:
            System.out.println("Por favor, digite o número da Agência !");
            int numero =scanner.nextInt();
            conta.setNumero(numero);
            scanner.nextLine();
            System.out.println("Por favor, digite o número da Conta !");
            String agencia = scanner.nextLine();
            conta.setAgencia(agencia);
            System.out.println("Por favor, digite o seu nome !");
            String nomecliente=scanner.nextLine();
            conta.setNomecliente(nomecliente);
            System.out.println("Por favor, digite o valor a ser despositado !");
            float saldoconta = scanner.nextFloat();
            conta.setSaldo(saldoconta);
            System.out.println(conta);
            break;
            
            case 2:
            	System.out.println("Por favor, digite o valor a ser depositado");
                int valordepositar =scanner.nextInt();
                scanner.nextLine();
                caixaeltronico.depositar(valordepositar);
            
            break;
            
            case 3:
            	System.out.println(conta);
            	break;

            default:
            	if(opcao!=0) {
            		
            		System.out.println("Opção invalida");
            	}
            
            break;
        }
        
        }while(opcao!=0);
        
        System.out.println("Obrigado por utilizar nosso sistema");

        scanner.close(); // Fechando o Scanner para liberar recursos

    }
}
