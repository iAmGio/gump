package eu.iamgio.gump.test

import eu.iamgio.gump.app.AppSettings
import eu.iamgio.gump.app.GumpApplication
import eu.iamgio.gump.color.Color
import eu.iamgio.gump.component.DrawableComponent
import eu.iamgio.gump.component.container.Column
import eu.iamgio.gump.component.container.Row
import eu.iamgio.gump.component.container.Stack
import eu.iamgio.gump.component.shape.Rectangle

/**
 * @author Giorgio Garofalo
 */
class GumpTest : GumpApplication() {

    override fun createSettings() = AppSettings()

    override fun buildRoot(): DrawableComponent {
        return Row(
                Column(
                        Stack(
                                Rectangle(150.0, 50.0, Color.hsb(super.age / 200F, 1F, 1F)),
                                Rectangle(100.0, 20.0, Color(255, 0, 0))
                        ).also { it.x = 20.0 },
                        Row(
                                Rectangle(50.0, 25.0, Color(255, 0, 0)),
                                Rectangle(150.0, 35.0, Color(255, 255, 0)),
                        )
                ),
                Column(
                        Rectangle(100.0, 100.0, Color(0, 0, 255)),
                        Rectangle(50.0, 50.0, Color(0, 255, 0)),
                ),
                Rectangle(100.0, 150.0, Color(0, 255, 255))
        )
    }
}

fun main() {
    GumpTest().launch()
}