package beersPackage.data;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor

@RequiredArgsConstructor

@Entity
public class Owner {
    @Id
    @GeneratedValue
    private @Getter    @Setter
    int id;
    @NonNull
    private @Getter     @Setter
    String name;
    @OneToOne(mappedBy = "ownerThatOwnsDog")
     private @Getter     @Setter //UNIDIRECTIONELE RELATIE
    Dog dog;

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
