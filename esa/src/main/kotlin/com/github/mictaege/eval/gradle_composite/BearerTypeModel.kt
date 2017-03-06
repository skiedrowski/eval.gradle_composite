package com.github.mictaege.eval.gradle_composite

import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.ItemViewModel

class BearerTypeModel : ItemViewModel<BearerType>() {
    val name = bind { SimpleStringProperty(item?.name ?: "") }
    val img = bind { SimpleStringProperty(item?.img ?: "com/github/mictaege/eval/gradle_composite/Default.png") }
    val constructionYear = bind { SimpleIntegerProperty(item?.constructionYear ?: 0) }
    val spaceShip = bind { SimpleStringProperty(item?.spaceShip?.type?.name ?: "") }
}