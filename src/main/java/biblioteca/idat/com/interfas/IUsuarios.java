package biblioteca.idat.com.interfas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biblioteca.idat.com.models.Usuarios;

@Repository
public interface IUsuarios extends JpaRepository<Usuarios, Integer> {

}
