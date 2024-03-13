package com.example.springdatajpa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "account_role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account_role {
        @jakarta.persistence.Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false)
        private int Id;

        @Column(name = "id_account", nullable = false)
        private int Id_account;

        @Column(name = "id_role", nullable = false)
        private int Id_role;

    }

