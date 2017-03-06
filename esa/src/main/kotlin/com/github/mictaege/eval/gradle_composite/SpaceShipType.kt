package com.github.mictaege.eval.gradle_composite

sealed class SpaceShipType(val name: String) {
    object Hermes: SpaceShipType("Hermes")
}