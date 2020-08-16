import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o seu Sobrenome: ");
        String sobrenome = scanner.nextLine();

        String login = nome.charAt(0) + "." + sobrenome;
        System.out.println("Login: " + login);

        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();
        // boolean cSenha = false;

        // while (cSenha == false) {
        //     System.out.println("Digite sua senha: ");
        //     String senha = scanner.nextLine();
        //     // senha.matches("^(?=.[0-9])(?=.[a-z])(?=.[-, !, @])(?=.[A-Z])(?=.\d).+")
        //     if (senha.contains("@") && senha.length() >= 8) {
        //         System.out.println("Cadastro realizado com Sucesso");
        //         cSenha = true;
        //     } else {
        //         System.out.println("Sua senha precisa ter no mínimo 8 caracteres, com pelo menos uma letra maiuscula e numero.Por favor repita o processo.");
        //     }

        scanner.close();
    }
    
    boolean verificaSenha(String senha){
        if (senha.matches("(?=.[0-9])(?=.[a-z])(?=.[-, !, @])(?=.*[A-Z])") && senha.length() >= 8) {
            System.out.println("Cadastro realizado com Sucesso");
            return true;
        } else {
            System.out.println("Sua senha precisa ter no mínimo 8 caracteres, com pelo menos uma letra maiuscula e numero.Por favor repita o processo.");
            return false;
        }
    }
}
