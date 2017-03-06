package com.github.mictaege.eval.gradle_composite

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon.ROCKET
import tornadofx.*

class TowerControlView: View() {
    val list: TowerControlList by inject()
    val form: TowerControlForm by inject()
    val img: BearerTypeImgView by inject()
    val model: BearerTypeModel by inject()

    init {
        primaryStage.isMaximized = true
        list.bearers.addAll(Dao().findBearers())
    }

    override val root = splitpane(
            list.root,
            vbox(3.0, listOf(
                    form.root,
                    button(messages["launch"], icon(ROCKET)) {
                        setOnAction {
                            img.root.replaceChildren(pane {
                                imageview(model.img.value) {
                                    fitHeight = 300.0
                                    fitWidth = 300.0
                                    isPreserveRatio = true
                                }
                            })
                        }
                    },
                    img.root)
            )
    )
}