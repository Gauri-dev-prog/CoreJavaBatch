package com.example.MyProject;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TRANSACTIONS", schema = "CUSTOMER")
@Getter
@Setter
@NoArgsConstructor
public class CustomerTransaction {
    @Id
    @Column(name = "TRANSACTION_ID", nullable = false)
    private int transactionId;

    @Column(name = "TRANSACTION_DATE", nullable = false)
    private LocalDate transactionDate;

    @Column(name = "TRANSACTION_AMOUNT", nullable = false, precision = 2)
    private BigDecimal transactionAmount;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID")
    private Customer customersByCustomerId;

	

}

