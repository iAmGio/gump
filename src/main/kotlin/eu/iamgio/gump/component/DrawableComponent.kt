package eu.iamgio.gump.component

import eu.iamgio.gump.app.Canvas
import eu.iamgio.gump.app.GumpApplication

/**
 * Represents an element in the scene of a [GumpApplication] that draws itself through Processing functions.
 *
 * @author Giorgio Garofalo
 */
abstract class DrawableComponent {

    /**
     * X translation of this component.
     */
    var x = 0.0

    /**
     * Y translation of this component.
     */
    var y = 0.0

    /**
     * Width of this component.
     */
    abstract var width: Double

    /**
     * Height of this component.
     */
    abstract var height: Double

    /**
     * Total width occupied by this component.
     */
    internal val deltaX
        get() = x + width

    /**
     * Total height occupied by this component.
     */
    internal val deltaY
        get() = y + height

    /**
     * Draws the content to the canvas.
     * By default it draws the [DrawableComponent] built in [build],
     * but it can be overridden to call raw Processing functions.
     */
    abstract fun draw(canvas: Canvas)
}