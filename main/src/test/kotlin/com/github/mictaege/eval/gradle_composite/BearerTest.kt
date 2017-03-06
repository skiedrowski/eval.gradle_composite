package com.github.mictaege.eval.gradle_composite

import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test
import org.mockito.Mockito.mock

class BearerTest {

    @Test fun shouldProvideBearerType() {
        val bearerType = mock(BearerType::class.java)
        Bearer(bearerType).type shouldMatch equalTo(bearerType)
    }

}