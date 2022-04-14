package com.example.demo.controller

import com.example.demo.service.MessagesService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class NotificationController(val messagesService: MessagesService) {

    @GetMapping("/notification/{user}")
    fun notification(@PathVariable user:String) = messagesService.getMessage(user);
}