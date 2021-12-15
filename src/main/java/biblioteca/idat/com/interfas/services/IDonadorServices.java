package biblioteca.idat.com.interfas.services;

import java.util.List;
import java.util.Optional;

import biblioteca.idat.com.models.Donador;

public interface IDonadorServices {
	
	public List<Donador> listar();
	public Optional<Donador> buscar(Integer id);
	public int guardar(Donador donador);
	public void eliminar(Integer id);

}
