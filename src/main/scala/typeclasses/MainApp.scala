package typeclasses

import typeclasses.model.{CarAdvert, FlatAdvert}
import typeclasses.wiring.ComponentWiring._

object MainApp extends App {

  val carAdvert = CarAdvert("audi", 250000)
  val flatAdvert = FlatAdvert("moscow", 1000000)

  advertServiceImpl.saveAdvert(carAdvert)
  advertServiceImpl.saveAdvert(flatAdvert)

}
