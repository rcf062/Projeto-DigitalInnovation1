package com.Projeto1.Projeto.DigitalInnovatio1.Service;

import com.Projeto1.Projeto.DigitalInnovatio1.Repository.JornadaRepository;
import com.Projeto1.Projeto.DigitalInnovatio1.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    //inicializar as dependencias(instancia)
    @Autowired
    public JornadaService(JornadaRepository jornadaRepository){
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }
    //listando os dados
    public List<JornadaTrabalho> findAll(){
        return jornadaRepository.findAll();
    }

    public Optional <JornadaTrabalho> getByID(long idJornada){
        return jornadaRepository.findById(idJornada);
    }

    //Update
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    //Deletando
    public void deleteJornada(Long idJornada){
         jornadaRepository.deleteById(idJornada);
    }

}
