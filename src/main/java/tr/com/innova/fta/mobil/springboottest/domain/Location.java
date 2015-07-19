package tr.com.innova.fta.mobil.springboottest.domain;

import javax.persistence.*;

/**
 * Created by bcetinkaya
 */

@Entity
@Table(name = "LOCATION")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "DESCRIPTION", nullable = false, unique = true)
    private String description;

    @ManyToOne
    @JoinColumn(name = "FLOOR_ID", nullable = false)
    private Floor floor;

    public Location() {

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

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}
