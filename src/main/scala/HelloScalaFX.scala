import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafx.scene.paint.Color._
import scalafx.scene.control.{Label, Button}
import scalafx.scene.layout.BorderPane

object HelloSBT extends JFXApp {
   stage = new JFXApp.PrimaryStage {
      width = 200
      height = 200
      scene = new Scene {
        root = new BorderPane {
          bottom = new Button("OK") {
            onAction = { _ => System.exit(0) }
          }
          center = new Label {
            text = "Hello"
            text <==
              when(hover) choose "Hi!" otherwise "Hello"
          }
        }
      }
   }
}
