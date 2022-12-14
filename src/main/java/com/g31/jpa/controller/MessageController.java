package com.g31.jpa.controller;

import com.g31.jpa.entity.Message;
import com.g31.jpa.service.MessageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author desaextremo
 */
@RestController
@RequestMapping("/Message")
@CrossOrigin(origins = "*")
public class MessageController {

    @Autowired
    private MessageService messageService;

    //Metodo para consultar todos los registros (Capa de controlador)
    @GetMapping("/all")
    public List<Message> getMessage() {
        return messageService.getMessage();
    }

    //Metodo para insertar (Capa de controlador)
    @PostMapping("/save")
    public ResponseEntity insertMessage(@RequestBody Message message) {
        messageService.insertMessage(message);
        return ResponseEntity.status(201).build();
    }
    
    //Metodo para consultar una registo x su id (Capa de controlador)
    @GetMapping("/{id}")
    public Message getMessageById(@PathVariable("id") Long id){
            return messageService.getMessageById(id);
    }
    
    //Metodo para eliminar (Capa de controlador)
    @DeleteMapping("/{id}")
    public ResponseEntity deleteMessage(@PathVariable("id") Long id){
       messageService.deleteMessage(id);
       return ResponseEntity.status(204).build();
    }
    
    //Metodo para actualizar (Capa de controlador)
    @PutMapping("/update")
    public ResponseEntity updateMessage(@RequestBody Message message){
       messageService.updateMessage(message);
       return ResponseEntity.status(201).build(); 
    }
}
