package biblioteca.idat.com.interfas.services;

import java.util.List;
import java.util.Optional;

import biblioteca.idat.com.models.Usuarios;

public interface IUsuariosServicios {
	
	public List<Usuarios> listar();
	public Optional<Usuarios> buscar(Integer id);
	public int guardar(Usuarios usuarios);
	public void eliminar(Integer id);

}
