package com.dio.live;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class DateType {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String description;
}
