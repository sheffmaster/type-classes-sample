package typeclasses.converter

import typeclasses.model._

trait AdvertConverter[T] {
  def parse(someAdvert: T): Advert
}

object AdvertConverter {

  implicit object CarAdvertConverter extends AdvertConverter[CarAdvert] {
    override def parse(someAdvert: CarAdvert): Advert = {
      Advert(
        someAdvert.brand,
        "this is car",
        someAdvert.cost
      )
    }
  }

  implicit object FlaAdvertConverter extends AdvertConverter[FlatAdvert] {
    override def parse(someAdvert: FlatAdvert): Advert = {
      Advert(
        "sell my flat please",
        "flat advert",
        someAdvert.cost
      )
    }
  }
}
