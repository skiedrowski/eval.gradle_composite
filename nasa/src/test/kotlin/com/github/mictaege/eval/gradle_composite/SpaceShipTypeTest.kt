package com.github.mictaege.eval.gradle_composite

import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test

class SpaceShipTypeTest {

    @Test fun mercuryShouldProvideName() {
        SpaceShipType.Mercury.name shouldMatch equalTo("Mercury")
    }

    @Test fun geminiShouldProvideName() {
        SpaceShipType.Gemini.name shouldMatch equalTo("Gemini")
    }

}
