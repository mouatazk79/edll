package klaa.mouataz.edlli.repos;

import klaa.mouataz.edlli.model.Admin;
import klaa.mouataz.edlli.model.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EnseignantRepository extends JpaRepository<Enseignant,Integer> {
    Enseignant findEnseignantById(Integer id);
}
