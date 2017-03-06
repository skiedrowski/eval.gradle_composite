package com.github.mictaege.eval.gradle_composite

import javafx.scene.control.TableView
import tornadofx.*
import tornadofx.FX.Companion.messages

class TowerControlList: View(messages["title"]){
    val bearers = mutableListOf<BearerType>().observable()
    val model: BearerTypeModel by inject()
    override val root = tableview(bearers) {
        title = messages["title"]
        columnResizePolicy = TableView.CONSTRAINED_RESIZE_POLICY
        column(messages["name"], BearerType::name)
        column(messages["spaceShip"], BearerType::spaceShip) {
            cellCache {
                label(it.type.name)
            }
        }
        bindSelected(model)
    }
}