package typeclasses.wiring

import typeclasses.model.Advert
import typeclasses.service.{AdvertSaverService, AdvertSaverServiceComponent, AdvertService}

object ComponentWiring {

  // services

  private lazy val advertSaverServiceImpl = new AdvertSaverService {
    override def save(advert: Advert): Unit = {
      println(s"Emulate saving $advert to somewhere.")
    }
  }

  lazy val advertServiceImpl = new AdvertService with AdvertSaverServiceComponentImpl
  // components

  trait AdvertSaverServiceComponentImpl extends AdvertSaverServiceComponent {
    override def advertSaverService: AdvertSaverService = advertSaverServiceImpl
  }

}
