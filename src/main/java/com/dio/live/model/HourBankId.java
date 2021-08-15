package com.dio.live;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public  class HourBankId implements Serializable{
    private Long idHourBank;
//    @ManyToOne(fetch = FetchType.EAGER, optional = false)
//    @JoinColumn(name="move_id", nullable = false)    
    private Long idMove;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="user_id", nullable = false)    
    private User idUser;

}