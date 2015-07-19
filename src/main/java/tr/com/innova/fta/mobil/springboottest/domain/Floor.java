package tr.com.innova.fta.mobil.springboottest.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by bcetinkaya
 */


@Entity
@Table(name = "FLOOR")
public class Floor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "DESCRIPTION", nullable = false, unique = true)
    private String description;

    @OneToMany(mappedBy = "floor")
    private Set<Location> locations = new HashSet<>();

    public Floor() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Location> getLocations() {
        return locations;
    }

    public void setLocations(Set<Location> locations) {
        this.locations = locations;
    }
}
