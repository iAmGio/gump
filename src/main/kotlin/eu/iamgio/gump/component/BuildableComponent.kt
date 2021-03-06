package eu.iamgio.gump.component

import eu.iamgio.gump.app.Canvas
import eu.iamgio.gump.app.GumpApplication

/**
 * Represents an element in the scene of a [GumpApplication] that can be built on top of other components.
 *
 * @author Giorgio Garofalo
 */
abstract class BuildableComponent : DrawableComponent() {

    override var width = 0.0
    override var height = 0.0

    override fun draw(canvas: Canvas) {
        build(canvas).render(canvas)
    }

    /**
     * Builds the child component.
     */
    abstract fun build(canvas: Canvas): DrawableComponent
}