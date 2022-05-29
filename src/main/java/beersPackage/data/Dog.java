package beersPackage.data;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Dog {
    private @Getter
    @Setter int id;
    private @Getter @Setter
    String name;
    @OneToOne(mappedBy = "dogThatOwnedByOwner")
    private @Getter @Setter Owner ownerThatOwnsDog;


}
