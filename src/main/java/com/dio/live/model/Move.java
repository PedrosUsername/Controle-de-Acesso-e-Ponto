package com.dio.live;

import lombok.*;

import javax.persistence.*;
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

    @EmbeddedId
    private MoveId moveId;
    private LocalDateTime enterDate;
    private LocalDateTime exitDate;
    private BigDecimal period;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="occurrence_id", nullable = false)
    private Occurrence occurrence;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="calendar_id", nullable = false)
    private Calendar calendar;
}
