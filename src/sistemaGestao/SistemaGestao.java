package sistemaGestao;

import java.util.Scanner;

import loginInicial.UsuarioRoot;

public class SistemaGestao {

	public static void main(String[] args) {
		UsuarioRoot usuarioroot = new UsuarioRoot("Administrador", "Admin.123");
		String nomeDeAcesso;
		String senhaDeAcesso;
		int tentativaAcesso = 1;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o nome do 'SUPER_USUARIO'...  ");
		nomeDeAcesso = entrada.nextLine();
		//System.out.print(usuarioroot.nomeSuperUsuario);
		System.out.println();
		System.out.println("Informe a senha deste 'SUPER_USUARIO'... ");
		senhaDeAcesso = entrada.nextLine();
		//System.out.print(usuarioroot.senhaSuperUsuario);
		System.out.println();

		while (!nomeDeAcesso.equals("Administrador") && !senhaDeAcesso.equals("Admin.123") && tentativaAcesso < 5) {
			System.out.println("Informe o nome do 'Super Usuario' e sua 'Senha' Correspondente. \nTentativas restantes: " + (5 - tentativaAcesso));
			tentativaAcesso++;
			System.out.println();
			System.out.println("Nome do 'Suoer Ususario' ");
			nomeDeAcesso = entrada.nextLine();
			System.out.println("Informe a Senha: ");
			senhaDeAcesso = entrada.nextLine();
		}
		System.out.println();

		if (nomeDeAcesso.equals("Administrador") && senhaDeAcesso.equals("Admin.123")) {
			System.out.println("ACESSO PERMITIDO");
		}else {
			System.out.println("ACESSO BLOQUEADO. SOLICITE SUPORTE. \nLegnu 31 98235.2599");
		}


		entrada.close();
	}
}
