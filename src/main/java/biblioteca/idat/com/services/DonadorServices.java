package biblioteca.idat.com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import biblioteca.idat.com.interfas.IDonador;
import biblioteca.idat.com.interfas.services.IDonadorServices;
import biblioteca.idat.com.models.Donador;

@Service
public class DonadorServices implements IDonadorServices {

	@Autowired
	private IDonador dataD;
	
	@Override
	public List<Donador> listar() {
		return dataD.findAll();
	}

	@Override
	public Optional<Donador> buscar(Integer id) {
		return dataD.findById(id);
	}

	@Override
	public int guardar(Donador donador) {
		int res=0;
		Donador dona=dataD.save(donador);
		if(!dona.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void eliminar(Integer id) {
		dataD.deleteById(id);
		
	}

}
