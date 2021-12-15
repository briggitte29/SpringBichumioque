package biblioteca.idat.com.interfas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biblioteca.idat.com.interfas.IUsuarios;
import biblioteca.idat.com.models.Usuarios;

@Service
public class UsuariosServices implements IUsuariosServicios{
	
	@Autowired 
	private IUsuarios data;

	@Override
	public List<Usuarios> listar() {
		return data.findAll();
	}

	@Override
	public Optional<Usuarios> buscar(Integer id) {
		return data.findById(id);
	}

	@Override
	public int guardar(Usuarios usuarios) {
		int res=0;
		Usuarios usu=data.save(usuarios);
		if(!usu.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void eliminar(Integer id) {
		data.deleteById(id);
		
	}
	

}
