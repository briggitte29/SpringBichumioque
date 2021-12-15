package biblioteca.idat.com.interfas;

import org.springframework.data.jpa.repository.JpaRepository;

import biblioteca.idat.com.models.Donador;

public interface IDonador extends JpaRepository<Donador, Integer>{

}
