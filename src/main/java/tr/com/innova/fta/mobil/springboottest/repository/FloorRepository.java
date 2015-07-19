package tr.com.innova.fta.mobil.springboottest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tr.com.innova.fta.mobil.springboottest.domain.Floor;

/**
 * Created by bcetinkaya
 */
public interface FloorRepository extends JpaRepository<Floor,Long> {

    Floor findByDescription(String description);

}
