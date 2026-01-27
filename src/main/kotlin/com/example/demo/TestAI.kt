package com.example.demo

import org.springframework.ai.chat.model.ChatModel
import org.springframework.ai.chat.prompt.Prompt
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestAI(
    // DI
    private val chatModel: ChatModel
) {

    @PostMapping("/{text}")
    fun testAI(
        @PathVariable text: String
    ): String? {
        val prompt = Prompt(text);
        // result.output.text 값이 null일 경우 "응답실패" return
        return chatModel.call(prompt).result.output.text?:"응답실패"
    }
}