package typeclasses.service

import typeclasses.converter.AdvertConverter

trait AdvertService {
  this: AdvertSaverServiceComponent =>

  def saveAdvert[T](someAdvert: T)(implicit advertParser: AdvertConverter[T]): Unit = {
    val advert = advertParser.parse(someAdvert)
    advertSaverService.save(advert)
  }
}

