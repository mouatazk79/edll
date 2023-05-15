package klaa.mouataz.edlli.repos;

import klaa.mouataz.edlli.model.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends JpaRepository<Module,Integer> {
    Module findModuleById(Integer id);
}
