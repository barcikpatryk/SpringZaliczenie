package com.example.SimpleWeb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleWebApplication

fun main(args: Array<String>) {
	runApplication<SimpleWebApplication>(*args)
}
