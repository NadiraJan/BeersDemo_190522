package beersPackage.data;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Owner {
    @Id
    private @Getter    @Setter
    int id;
    private @Getter     @Setter
    String name;
    @OneToOne(mappedBy = "ownerThatOwnsDog")
     private @Getter     @Setter //UNIDIRECTIONELE RELATIE
    Dog dog;
}
