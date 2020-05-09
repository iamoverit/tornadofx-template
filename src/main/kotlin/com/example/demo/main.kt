package com.example.demo

import com.example.demo.views.MainView
import tornadofx.*

class DemoApp: App(MainView::class)

fun main(args: Array<String>){
    launch<DemoApp>(args)
}