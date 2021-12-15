package biblioteca.idat.com.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Donador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDonador;
	private String nombreCompleto;
	private String correo;
	private Integer idLibro;
	
	
	public Donador() {
		// TODO Auto-generated constructor stub
	}


	public Donador(Integer idDonador, String nombreCompleto, String correo, Integer idLibro) {
		super();
		this.idDonador = idDonador;
		this.nombreCompleto = nombreCompleto;
		this.correo = correo;
		this.idLibro = idLibro;
	}


	public Integer getIdDonador() {
		return idDonador;
	}


	public void setIdDonador(Integer idDonador) {
		this.idDonador = idDonador;
	}


	public String getNombreCompleto() {
		return nombreCompleto;
	}


	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public Integer getIdLibro() {
		return idLibro;
	}


	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}
	
	
}
