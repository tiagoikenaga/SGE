import java.util.Scanner;
public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean cadUser = false;
        boolean cadEmail = false;
        boolean cadSenha = false;

        String nome = null;
        String sobrenome = null;
        String email = null;
        String senha = null;
        String login = null;
        
        while (cadUser == false) {
            System.out.print("Digite o seu Nome: ");
            nome = scanner.nextLine();
            System.out.print("Digite o seu Sobrenome: ");
            sobrenome = scanner.nextLine();
            
            if ((nome.length() != 0) && (sobrenome.length() != 0)) {
                System.out.println("Login cadastrado");
                cadUser = true;
            } else {
                System.out.println("Insira o nome e sobrenome para cadastro de login.");
            }
         }
        while (cadEmail == false) {
            System.out.print("Digite seu e-mail: ");
            email = scanner.nextLine();

            if (email.endsWith(".com")) {
                System.out.println("email cadastrado");
                cadEmail = true;                
            } else {
                System.out.println("email inválido");
            }            
        }
        while (cadSenha == false) {
            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();
            // senha.contains("@") && senha.length() >= 8 && email.length()>0
            if (senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() >= 8) {
                System.out.println("Senha cadastrada");
                cadSenha = true;
            } else {
                System.out.println("Sua senha precisa ter no mínimo 8 caracteres, com pelo menos 1 letra maiuscula, 1 numero, e 1 desses caracteres (#, !, @). Por favor repita o processo.");
            }
        }
        if (cadUser == true && cadEmail == true && cadSenha == true) {
            System.out.println("Cadastro realizado");            
            login = nome.charAt(0) + "." + sobrenome;
            System.out.println("Login: " + login);
            System.out.println("e-mail: " + email);
            System.out.println("Senha: "+ senha);
        }
        boolean validar = false;
        while (validar == false) {
            System.out.print("Insira o seu login: ");
            String vLogin = scanner.nextLine();

            System.out.print("Insira sua senha: ");
            String vSenha = scanner.nextLine();

            if (vLogin.equals(login) && vSenha.equals(senha)) {
                System.out.println("Login realizado com sucesso!");                
                System.out.println("Seja Bem-vindo(a): " + nome + " " + sobrenome + ", " + nome.charAt(0) + sobrenome.charAt(0));
                validar = true;               
            } else {
                System.out.println("Login ou Senha inválidos");                                
            }
        }
        scanner.close();   
    }
}