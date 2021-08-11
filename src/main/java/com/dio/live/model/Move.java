package com.dio.live;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Move {

        @AllArgsConstructor
        @NoArgsConstructor
        @EqualsAndHashCode
        @Embeddable
        public  class  MoveId implements Serializable{
            private long idMove;
            private long idUser;
        }
        @Id
        @EmbeddedId
        private MoveId moveId;
        private LocalDateTime enterDate;
        private LocalDateTime exitDate;
        private BigDecimal period;
        @ManyToOne
        private Occurrence occurrence;
        @ManyToOne
        private Calendar calendar;
}
