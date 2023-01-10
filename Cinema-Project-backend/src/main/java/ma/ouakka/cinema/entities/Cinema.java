package ma.ouakka.cinema.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Cinema implements Serializable {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    //Specify the tail
    @Column(length = 50)
    private String name;
    
    private double longitude, latitude, altitude;
    private int nombreSalles;
    
    @OneToMany(mappedBy = "cinema")
    private Collection<Salle> salle;
    
    @ManyToOne
    private Ville ville;
}
