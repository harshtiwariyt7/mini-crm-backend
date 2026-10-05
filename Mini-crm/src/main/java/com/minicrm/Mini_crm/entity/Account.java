package com.minicrm.Mini_crm.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;

    @Column(nullable = false, length = 100)
    private String accountName;

    @Column(length = 50)
    private String industry;

    @Column(length = 150)
    private String website;

    @Column(precision = 15, scale = 2)
    private BigDecimal annualRevenue;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_user_id")
    private User ownerUser;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
}