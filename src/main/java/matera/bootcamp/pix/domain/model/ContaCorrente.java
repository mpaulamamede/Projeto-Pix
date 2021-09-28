package matera.bootcamp.pix.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class ContaCorrente {

    @Id
    private Long id;

    @Column(nullable = false)
    private Long agencia;

    @Column(nullable = false)
    private Long conta;

    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal saldo;

}