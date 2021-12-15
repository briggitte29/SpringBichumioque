package biblioteca.idat.com.interfas.services;

import java.util.List;
import java.util.Optional;

import biblioteca.idat.com.models.Rol;

public interface IRolServicios {
	
	public List<Rol> listar();
	public Optional<Rol> buscar(Integer id);
	public int guardar (Rol rol);
	public void eliminar(Integer id);


}
