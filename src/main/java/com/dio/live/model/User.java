package com.dio.live;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)    
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="user_category_id", nullable = false)
    private UserCategory userCategory;
    private String name;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="enterprise_id", nullable = false)
    private Enterprise enterprise;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="access_level_id", nullable = false)
    private AccessLevel accessLevel;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name="working_time_id", nullable = false)
    private WorkingTime workingTime;
    private BigDecimal tolerance;
    private LocalDateTime workingTimeBegin;
    private LocalDateTime workingTimeEnd;
}
