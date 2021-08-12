package com.Projeto1.Projeto.DigitalInnovatio1.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder


public class Localidade {
    private Long id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}