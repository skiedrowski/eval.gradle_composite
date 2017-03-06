package com.github.mictaege.eval.gradle_composite

import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test

class BearerTypeTest {

    @Test fun shouldProvideName() {
        BearerType.Titan.name shouldMatch equalTo("Titan")
    }

    @Test fun shouldProvideSpaceShip() {
        BearerType.Titan.spaceShip.type.name shouldMatch equalTo("Gemini")
    }

}