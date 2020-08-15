
public class TesteUsuario {
	public static void main(String[] args) {
		Usuario usuario = new Usuario();
		usuario.nome = "Tiago";
		usuario.sobrenome = "Ikenaga";
		usuario.email = "tiago@gmail.com";
		usuario.senha = "Ikenag@88";

		System.out.println(usuario.autentica("Ikenag@88", "tiago@gmail.com"));
	}

}
