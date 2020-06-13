package com.dota.minigames.Matchmaking.api.health

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/health")
class CheckApi {

    @GetMapping("/check")
    fun check() : String {
        return "Ok, estou funcionando!"
    }
}