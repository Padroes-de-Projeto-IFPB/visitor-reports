package br.edu.ifpb.padroes.domain;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {
    private Long id;
    private String produto;
    private LocalDateTime dataCompra;
    private BigDecimal valor;
}
