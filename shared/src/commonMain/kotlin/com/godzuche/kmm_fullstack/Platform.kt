package com.godzuche.kmm_fullstack

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform