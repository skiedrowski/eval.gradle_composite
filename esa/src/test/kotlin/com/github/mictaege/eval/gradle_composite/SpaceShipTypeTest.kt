package com.github.mictaege.eval.gradle_composite

import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test

class SpaceShipTypeTest {

    @Test fun hermesShouldProvideName() {
        SpaceShipType.Hermes.name shouldMatch equalTo("Hermes")
    }

}