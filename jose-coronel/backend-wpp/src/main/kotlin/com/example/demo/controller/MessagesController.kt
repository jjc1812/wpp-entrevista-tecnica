package com.example.demo.controller
import com.example.demo.service.MessagesService
import org.springframework.web.bind.annotation.*;

@RestController
class MessagesController(val messagesService: MessagesService) {

    @GetMapping("/message/{user}")
    fun sendMessage(@PathVariable user:String) = messagesService.getMessage(user);
}