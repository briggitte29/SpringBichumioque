package biblioteca.idat.com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import biblioteca.idat.com.interfas.services.IDonadorServices;
import biblioteca.idat.com.interfas.services.IRolServicios;
import biblioteca.idat.com.interfas.services.IUsuariosServicios;
import biblioteca.idat.com.models.Donador;
import biblioteca.idat.com.models.Rol;
import biblioteca.idat.com.models.Usuarios;

@RestController
@RequestMapping("/inventory")
public class ControllerUsuarios {
	
	@Autowired
	private IUsuariosServicios data;
	
	@Autowired
	private IRolServicios dataRol;
	
	@Autowired
	private IDonadorServices dataD;
	
	
	//Usuarios
	@GetMapping("/listarU")
	public List<Usuarios>listar(){
		return data.listar();
	}
	
	@GetMapping("/buscarU/{id}")
	public Optional<Usuarios> buscar(@PathVariable Integer id){
		return data.buscar(id);
	}
	
	@PostMapping("/insertarU")
	public int insertar(@RequestBody Usuarios usuarios) {
		return data.guardar(usuarios);
	}
	
	@PostMapping("/actualizarU")
	public int actualizar(@RequestBody Usuarios usuarios) {
		return data.guardar(usuarios);
	}
	
	@DeleteMapping("/eliminarU/{id}")
	public void eliminar(@PathVariable Integer id) {
		data.eliminar(id);
	}	

	
	//Rol
	@GetMapping("/listar")
	public List<Rol> listarR(){
		return dataRol.listar();
	}
	
	@GetMapping("/buscar/{id}")
	public Optional<Rol> buscarR(@PathVariable Integer id){
		return dataRol.buscar(id);
	}
	
	@PostMapping("/insertar")
	public int insertarR(@RequestBody Rol rol) {
		return dataRol.guardar(rol);
	}
	
	@PutMapping("/actualizar")
	public int actualizarR(@RequestBody Rol rol) {
		return dataRol.guardar(rol);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarR(@PathVariable Integer id) {
		dataRol.eliminar(id);
	}
	
	
	//Donador
	@GetMapping("/listarDonad")
	public List<Donador> listarD(){
		return dataD.listar();
	}
	
	@GetMapping("/buscarDona/{id}")
	public Optional<Donador> buscarD(@PathVariable Integer id){
		return dataD.buscar(id);
	}
	@PostMapping("/insertarDona")
	public int insertarD(@RequestBody Donador donador) {
		return dataD.guardar(donador);
	}
	
	@PutMapping("/actualizarDona")
	public int actualizarD(@RequestBody Donador donador) {
		return dataD.guardar(donador);
	}
	
	@DeleteMapping("/eliminarDona/{id}")
	public void eliminarD(@PathVariable Integer id) {
		dataD.eliminar(id);
	}

}
