package com.Projeto1.Projeto.DigitalInnovatio1.Repository;

import com.Projeto1.Projeto.DigitalInnovatio1.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
