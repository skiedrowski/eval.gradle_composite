package com.github.mictaege.eval.gradle_composite

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView

fun icon(user: FontAwesomeIcon, expr: (FontAwesomeIconView) -> Unit = {}): FontAwesomeIconView {
    val iconview = FontAwesomeIconView(user)
    expr.invoke(iconview)
    return iconview
}