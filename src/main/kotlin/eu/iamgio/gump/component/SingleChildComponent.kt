package eu.iamgio.gump.component

import eu.iamgio.gump.app.Canvas

/**
 * A [DrawableComponent] with only one child.
 *
 * @param child component child
 * @author Giorgio Garofalo
 */
abstract class SingleChildComponent(val child: DrawableComponent) : DrawableComponent() {

    override fun draw(canvas: Canvas) {
        child.render(canvas)
    }
}