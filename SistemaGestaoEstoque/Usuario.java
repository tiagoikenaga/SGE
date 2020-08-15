
public class Usuario {

	public String nome;
	public String sobrenome;
	public String senha;
	public String email;

//	public Usuario(String nome, String sobrenome, String senha, String email) {
//		nome = this.nome;
//		sobrenome = this.sobrenome;
//		senha = this.senha;
//		email = this.email;
//	}
	public boolean autentica(String senha, String email) {
		senha = this.senha;
		email = this.email;

		if (senha.contains("@") && senha.length() >= 8) {
			System.out.println("Acesso permitido");
			System.out.println("Seja bem vindo, " + nome + ", " + nome.charAt(0) + sobrenome.charAt(0));
			return true;
		} else {
			System.out.println("Senha ou email inválido");
			return false;
		}

	}

}
