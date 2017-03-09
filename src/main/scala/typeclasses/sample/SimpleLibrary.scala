package typeclasses.sample

import typeclasses.sample.Samples.NumberLike

object SimpleLibrary {

  def sum[T](list: Seq[T])(implicit ev: NumberLike[T]): T = {
    list.reduce((a, b) => ev.plus(a, b))
  }

}
