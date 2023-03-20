package loginInicial;

public class UsuarioRoot {

	public String nomeSuperUsuario = "Administrador";
	public String senhaSuperUsuario = "Admin.123";
	
	public UsuarioRoot(String nomeSuperUsuario, String senhaSuperUsuario) {
		//	super();
		this.nomeSuperUsuario = nomeSuperUsuario;
		this.senhaSuperUsuario = senhaSuperUsuario;
	}

	public String getNomeSuperUsuario() {
		return nomeSuperUsuario;
	}
	public void setNomeSuperUsuario(String nomeSuperUsuario) {
		this.nomeSuperUsuario = nomeSuperUsuario;
	}
	public String getSenhaSuperUsuario() {
		return senhaSuperUsuario;
	}
	public void setSenhaSuperUsuario(String senhaSuperUsuario) {
		this.senhaSuperUsuario = senhaSuperUsuario;
	}
	
	
	
	
}
