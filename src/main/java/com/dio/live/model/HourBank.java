package com.dio.live;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class HourBank {


    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public  class HourBankId implements Serializable{
        private long idHourBank;
        private long idMove;
        private long idUser;


    }
    @EmbeddedId
    private HourBankId hourBankId;
    private LocalDateTime workDate;
    private BigDecimal quantityHours;
    private BigDecimal balanceHours;

}
