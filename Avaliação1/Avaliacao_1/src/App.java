import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);


       Empresa empresa1 = new Empresa(); 
    
    
       empresa1.nomeEmpresa="Jconstrutora";
       empresa1.cnpj= "4477552453";
       empresa1.endereco="Centro";
       empresa1.funcinariosDisponiveis=0;
       empresa1.mostraInfoEmpresa();

       
     
        System.out.println("------------------------------------------------------------");
        System.out.println("Seja bem vindo, escolha as opções:");
        System.out.println("Digite 1 para adicionar um funcionário.");
        System.out.println("Digite 2 para alocar um funcionario.");
        System.out.println("Digite 3 para contar quantos funcionarios estão disponíveis.");
        System.out.println("Digite 4 para sair ");
        System.out.println("------------------------------------------------------------");
        
        int opcao = scan.nextInt; 

        switch (opcao) {
            case 1:
                empresa1.adicionarFuncionario;
            break;

            case 2:
               empresa1.alocarFuncionario;
            break;

            case 3:
               empresa1.contarFuncionariosDisponiveis;
            break; 

            case 4 : 
             System.out.println("Encerrando...");
            break; 
        }

       
    }

    public static class Empresa {
        String nomeEmpresa;
        String cnpj;
        String endereco;
        int funcinariosDisponiveis;

        Funcionario[] funcionario = new Funcionario[100];

        public void mostraInfoEmpresa() {
            System.out.println(nomeEmpresa);
            System.out.println(cnpj);
            System.out.println(endereco);
            System.out.println(funcinariosDisponiveis);

        }

        public void adicionarFuncionario() {
            for (int i = 0; i < funcionario.lenght; i++) {
                if (empresa1.funcionario[i] == null) {
                    System.out.println("Digite o nome do funcionario:");
                    empresa1.funcionario[i].nome = scan.nextLine();
                    System.out.println("Digite o  cpf:");
                    empresa1.funcionario[i].cpf = scan.nextLine();
                    System.out.println("Digite a idade do funcionario:");
                    empresa1.funcinario[i].idade = scan.nextInt();
                    
                    scan.nextLine();

                }
            }

        }

        public void alocarFuncionario() {
            for (int i = 0; i < funcionario.lenght; i++) {
                if (funcionario[i] != null) {
                    System.out.println("Funcionário Alocado!");
                }
            }

        }

    }

    public void contarFuncionariosDisponiveis() {
        int count = 0;
        for (int i = 0; i < funcionario.lenght; i++) {
            if (funcionario[i] != null) {
                count++;
            }
        }
        System.out.println("Quantidade de funcionarios disponíveis: " + count);
    }
}

public static class Funcionario {

    int matricula;

    Pessoa pessoa = new Pessoa();

    public void mostraInfoFuncionarios() {
        for (int i=0; i<funcionario.lenght;i++){
            if (funcionario[i] !=null){
               System.out.println(funcionario[i].matricula);
            }
    }
}

public static class Pessoa {
    String nome;
    String cpf;
    int idade;

    public void mostraInfo() {
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(idade);
    }
}
}
