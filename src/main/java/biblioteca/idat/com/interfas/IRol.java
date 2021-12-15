package biblioteca.idat.com.interfas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biblioteca.idat.com.models.Rol;

@Repository
public interface IRol extends JpaRepository<Rol, Integer>{

}
