package tr.com.innova.fta.mobil.springboottest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.innova.fta.mobil.springboottest.domain.Location;

/**
 * Created by bcetinkaya
 */
public interface LocationRepository extends JpaRepository<Location,Long>{


    Location findByDescription(String description);

}
