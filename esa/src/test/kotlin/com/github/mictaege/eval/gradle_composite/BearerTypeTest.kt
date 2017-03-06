package com.github.mictaege.eval.gradle_composite

import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test

class BearerTypeTest {

    @Test fun shouldProvideName() {
        BearerType.Ariane5.name shouldMatch equalTo("Ariane5")
    }

    @Test fun shouldProvideConstructionYear() {
        BearerType.Ariane5.constructionYear shouldMatch equalTo(1996)
    }

    @Test fun shouldProvideSpaceShip() {
        BearerType.Ariane5.spaceShip.type.name shouldMatch equalTo("Hermes")
    }

}