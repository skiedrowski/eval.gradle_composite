package com.github.mictaege.eval.gradle_composite

sealed class BearerType(val name: String, val spaceShip: SpaceShip) {
    abstract val img: String
}