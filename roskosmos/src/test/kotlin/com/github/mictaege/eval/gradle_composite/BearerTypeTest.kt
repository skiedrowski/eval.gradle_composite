package com.github.mictaege.eval.gradle_composite

import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test

class BearerTypeTest {

    @Test fun shouldProvideName() {
        BearerType.Sojus.name shouldMatch equalTo("Sojus")
    }

    @Test fun shouldProvideSpaceShip() {
        BearerType.Wostok.spaceShip.type.name shouldMatch equalTo("Wostok")
    }

}