package biblioteca.idat.com.interfas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biblioteca.idat.com.interfas.IRol;
import biblioteca.idat.com.models.Rol;

@Service
public class RolServices implements IRolServicios{
	
	@Autowired
	private IRol data;

	@Override
	public List<Rol> listar() {
		return data.findAll();
	}

	@Override
	public Optional<Rol> buscar(Integer id) {
		return data.findById(id);
	}

	@Override
	public int guardar(Rol rol) {
		int res=0;
		Rol ro=data.save(rol);
		if(!ro.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void eliminar(Integer id) {
		data.deleteById(id);
	}
	
	

}
