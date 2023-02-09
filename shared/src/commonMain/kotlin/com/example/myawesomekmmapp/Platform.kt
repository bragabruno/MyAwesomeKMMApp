package com.example.myawesomekmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform