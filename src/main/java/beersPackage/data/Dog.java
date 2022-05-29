package beersPackage.data;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@RequiredArgsConstructor
public class Dog {
    private @Getter
    @Setter int id;
    private @Getter @Setter
    String name;
    @NonNull
    @OneToOne(mappedBy = "dogThatOwnedByOwner")
    private @Getter @Setter Owner ownerThatOwnsDog;


}
