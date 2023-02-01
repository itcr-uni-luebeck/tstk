package de.uniluebeck.itcrl.tstkbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TstkBackendApplication

fun main(args: Array<String>) {
	runApplication<TstkBackendApplication>(*args)
}
