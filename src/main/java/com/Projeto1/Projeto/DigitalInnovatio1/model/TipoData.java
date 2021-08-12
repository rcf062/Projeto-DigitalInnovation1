package com.Projeto1.Projeto.DigitalInnovatio1.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class TipoData {

    private long id;
    private String descricao;
}
