package dominio;

public class Jugador {

	int codigo;
	String nombre;
	String procedencia;
	String altura;
	int peso;
	String posicion;
	String nombreEquipo;
	
	
	
	public Jugador(int codigo, String nombre, String procedencia, String altura, int peso, String posicion, String nombreEquipo) {
		
		this.codigo       = codigo;
		this.nombre       = nombre;
		this.procedencia  = procedencia;
		this.altura       = altura;
		this.peso         = peso;
		this.posicion     = posicion;
		this.nombreEquipo = nombreEquipo;
		
	}

	
	
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	
	@Override
	public String toString() {
		return codigo + ", " + nombre + ", " + procedencia + ", " + altura + ", " + peso + ", " + posicion + ", " + nombreEquipo;
	}
	
}
