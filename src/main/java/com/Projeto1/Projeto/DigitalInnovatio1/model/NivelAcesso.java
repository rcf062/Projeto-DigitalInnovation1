package com.Projeto1.Projeto.DigitalInnovatio1.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class NivelAcesso {
    private Long id;
    private String descricao;
}
