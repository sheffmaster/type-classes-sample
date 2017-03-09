package typeclasses.service

import typeclasses.model.Advert

trait AdvertSaverService {
  def save(advert: Advert)
}

trait AdvertSaverServiceComponent {
  def advertSaverService: AdvertSaverService
}


