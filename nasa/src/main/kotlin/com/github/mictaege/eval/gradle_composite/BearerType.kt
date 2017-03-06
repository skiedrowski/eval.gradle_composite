package com.github.mictaege.eval.gradle_composite

sealed class BearerType(val name: String, val spaceShip: SpaceShip) {
    abstract val img: String

    object Atlas: BearerType("Atlas", SpaceShip(SpaceShipType.Mercury)) {
        override val img: String
            get() = "com/github/mictaege/eval/gradle_composite/Atlas.jpg"
    }

    object Titan: BearerType("Titan", SpaceShip(SpaceShipType.Gemini)) {
        override val img: String
            get() = "com/github/mictaege/eval/gradle_composite/Titan.jpg"
    }
}