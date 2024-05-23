package my.uum.springboot.repository;

import my.uum.springboot.model.Population;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PopulationRepository extends JpaRepository<Population, Long> {

}
