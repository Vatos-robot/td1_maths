object Math {

  def square(x: Int): Int = x * x

  def power(x: Double, n: Int): Double = {
    if (n == 1) {
      x
    } else {
      power(x, n - 1) * x
    }
  }

  def divide(x: Double, y: Double): Option[Double] =
    if (y != 0) Some(x / y)
    else None

  def quadraticEquation(a: Double, b: Double, c: Double): Option[(Double, Double)] = {
    val delta = b * b - 4 * a * c

    if (delta > 0) {
      val x1 = (-b + math.sqrt(delta)) / (2 * a)
      val x2 = (-b - math.sqrt(delta)) / (2 * a)
      Some((x1, x2))
    } else if (delta == 0) {
      val x = -b / (2 * a)
      Some((x, x))
    } else {
      None
    }
  }

  def abs(x: Double): Double = {
  if (x >= 0)
    x
  else
    -x
}

def heron_sqrt(a: Int, xn: Double = 1.0, threshold: Double = 1.0): Double = {
  val xnPlus1 = xn + a / (2 * xn)
  val distance = math.abs(xnPlus1 - xn) / (2 * a)

  if (distance < threshold)
    xnPlus1
  else
    heron_sqrt(a, xnPlus1, threshold)
}
//marche pas 
}
