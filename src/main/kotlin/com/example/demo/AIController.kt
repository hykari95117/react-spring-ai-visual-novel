package com.example.demo

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AIController(
    // DI
    private val aiService: AIService
) {
    @PostMapping("/sin1")
    fun sin1(@RequestBody sin1Request: Sin1Request): Any {
        return aiService.sin1(sin1Request.text)
    }

    @PostMapping("/sin2")
    fun sin2(@RequestBody sin2Request: Sin2Request): Any {
        return aiService.sin2(sin2Request)
    }

    @PostMapping("/sin3")
    fun sin3(@RequestBody sin3Request: Sin3Request): Any {
        return aiService.sin3(sin3Request.text)
    }

    @PostMapping("/sin4")
    fun sin4(@RequestBody sin4Request: Sin4Request): Any {
        return aiService.sin4(sin4Request)
    }
}