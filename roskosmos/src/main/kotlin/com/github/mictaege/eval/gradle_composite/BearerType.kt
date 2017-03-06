package com.github.mictaege.eval.gradle_composite

sealed class BearerType(val name: String, val spaceShip: SpaceShip) {
    abstract val img: String
    object Wostok: BearerType("Wostok", SpaceShip(SpaceShipType.Wostok))  {
        override val img: String
            get() = "com/github/mictaege/eval/gradle_composite/Wostok.jpg"
    }
    object Sojus: BearerType("Sojus", SpaceShip(SpaceShipType.Sojus))  {
        override val img: String
            get() = "com/github/mictaege/eval/gradle_composite/Sojus.jpg"
    }
}