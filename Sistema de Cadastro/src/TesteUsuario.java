public class TesteUsuario {
	public static void main(String[] args) {
		Usuario usuario = new Usuario();

		usuario.nome = "Tiago";
		usuario.sobrenome = "Ikenaga";
		usuario.senha = "@rByteT32020";
		usuario.email = "tiago@arbyte.com";

		System.out.println(usuario.autentica(usuario.senha, usuario.email));
	}
}
