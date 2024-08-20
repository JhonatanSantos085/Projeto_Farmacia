package jhon.remedio.projetoFarmacia.repository;


import jhon.remedio.projetoFarmacia.model.Remedio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemedioRepository extends JpaRepository<Remedio, Long> {
}
