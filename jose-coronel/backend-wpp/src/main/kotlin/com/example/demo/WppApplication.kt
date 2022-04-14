package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WppApplication

fun main(args: Array<String>) {
	runApplication<WppApplication>(*args)
}
