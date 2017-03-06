package com.github.mictaege.eval.gradle_composite

import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test

class SpaceShipTypeTest {

    @Test fun wostokShouldProvideName() {
        SpaceShipType.Wostok.name shouldMatch equalTo("Wostok")
    }

    @Test fun sojusShouldProvideName() {
        SpaceShipType.Sojus.name shouldMatch equalTo("Sojus")
    }

}
