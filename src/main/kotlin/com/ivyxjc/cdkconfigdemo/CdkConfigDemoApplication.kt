package com.ivyxjc.cdkconfigdemo

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class CdkConfigDemoApplication

fun main(args: Array<String>) {
    runApplication<CdkConfigDemoApplication>(*args)
}

@RestController
class AbcControlloer {

    @Value("\${aws.param.abc}")
    var abc: Int = -1

    @Value("\${aws.param.xyz}")
    lateinit var xyz: String

    @GetMapping("/api/hello")
    open fun hello(): String {
        return "hello world"
    }

    @GetMapping("/health")
    fun health(): Map<String, String> {
        return mapOf(Pair("message", "ok"))
    }

    @GetMapping("/api/param/abc")
    open fun abc(): Int {
        return abc
    }

    @GetMapping("/api/param/xyz")
    open fun xyz(): String {
        return xyz
    }
}


