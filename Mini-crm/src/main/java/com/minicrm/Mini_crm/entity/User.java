package com.minicrm.Mini_crm.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column(nullable = false, length = 100)
    private String fullName;

    @Column(nullable = false, length = 150, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "enum('Sales Rep', 'Account Manager', 'Support Agent', 'Admin') default 'Sales Rep'")
    private CrmEnums.Role role;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
}