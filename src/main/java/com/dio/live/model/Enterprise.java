package com.dio.live;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Enterprise {
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    private String cnpj;
    private String address;
    private String neighborhood;
    private String ciry;
    private String state;
    private String phone;
}
