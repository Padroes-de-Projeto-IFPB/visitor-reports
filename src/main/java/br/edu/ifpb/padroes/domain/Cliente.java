package br.edu.ifpb.padroes.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Cliente {
    private String nome;
    private String CPF;
    private LocalDateTime dataCadastro;
}
