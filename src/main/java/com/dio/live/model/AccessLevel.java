package com.dio.live;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.OneToMany;
//import javax.persistence.CascadeType;
//import javax.persistence.FetchType;
//import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class AccessLevel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String description;







//    @OneToMany(mappedBy = "accessLevel", fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL)
//    private Set<Location> location;
}
