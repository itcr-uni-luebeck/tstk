package de.uniluebeck.itcrl.tstkbackend

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableAdminServer
class TstkBackendApplication

fun main(args: Array<String>) {
	runApplication<TstkBackendApplication>(*args)
}
