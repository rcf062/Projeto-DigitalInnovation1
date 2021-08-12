package com.Projeto1.Projeto.DigitalInnovatio1.controller;

import com.Projeto1.Projeto.DigitalInnovatio1.Service.JornadaService;
import com.Projeto1.Projeto.DigitalInnovatio1.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/jornada")

public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    //Insert bd data
    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }
    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }
    //id list
    @GetMapping("/{idJornada}")
    public ResponseEntity <JornadaTrabalho> getJornadaByID(@PathVariable("idJornada") long idJornada) throws Exception{
        return ResponseEntity.ok( jornadaService.getByID(idJornada).orElseThrow(()->new NoSuchElementException("Not found")));

    }
    //Update
    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.updateJornada(jornadaTrabalho);
    }
    //deleting
    @DeleteMapping("/{idJornada}")
    public ResponseEntity <JornadaTrabalho> deleteByID(@PathVariable("idJornada") long idJornada) throws Exception{
        try{
            jornadaService.deleteJornada(idJornada);
        }catch (Exception e){
            System.out.println(e.getMessage());

        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();

    }
}
