package com.github.mictaege.eval.gradle_composite

import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test
import org.mockito.Mockito.mock

class SpaceShipTest {

    @Test fun shouldProvideType() {
        val shipType = mock(SpaceShipType::class.java)
        SpaceShip(shipType).type shouldMatch equalTo(shipType)
    }

}