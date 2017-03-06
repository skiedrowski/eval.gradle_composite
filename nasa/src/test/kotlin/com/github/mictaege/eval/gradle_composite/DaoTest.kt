package com.github.mictaege.eval.gradle_composite

import com.github.mictaege.eval.gradle_composite.BearerType.Atlas
import com.github.mictaege.eval.gradle_composite.BearerType.Titan
import com.natpryce.hamkrest.equalTo
import com.natpryce.hamkrest.should.shouldMatch
import org.junit.Test

class DaoTest {

    @Test fun shouldProvideBearer() {
        Dao().findBearers() shouldMatch equalTo(listOf(Atlas, Titan))
    }

}