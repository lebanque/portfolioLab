package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.Institution;

import java.util.List;

@Component
@Repository
public interface InstitutionRepository extends JpaRepository<Institution, Long> {

    List<Institution> findAll();

}
