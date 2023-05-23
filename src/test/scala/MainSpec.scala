// AnyFlatSpec permet la syntaxe "ma fonction" should "do something" in {}
import org.scalatest.flatspec.AnyFlatSpec

// Matchers permet la syntaxe 'output shouldBe expected'
import org.scalatest.matchers.should.Matchers
import org.scalatest.matchers.should.Matchers._

class MathSpec extends AnyFlatSpec with Matchers {
  // To keep
  
  "square" should "return square value of a number" in {
    // Given
    val x = 10

    // When
    val squareX = Math.square(x)

    // Then
    squareX shouldBe 100

  }
  it should "return square value of a negative number" in {
    // Given
    val x = -5

    // When
    val squareX = Math.square(x)

    // Then
    squareX shouldBe 25
  }

  "divide" should "return the division of two numbers when the divisor is not zero" in {
    // Given
    val x = 10
    val y = 2

    // When
    val result = Math.divide(x, y)

    // Then
    result shouldBe Some(5.0)
  }

  "power" should "calculate the power of a number" in {
    // Given
    val base = 2
    val exponent = 3

    // When
    val result = Math.power(base, exponent)

    // Then
    result shouldBe 8
  }

  "quadraticEquation" should "resolve quadraticEquation with positive delta" in {
   // Given
    val (a, b, c) = (1, -1, -2)

  // When
    val solution = Math.quadraticEquation(a, b, c)

  // Then
    solution shouldBe Some((2.0, -1.0))
}

  it should "resolve quadraticEquation with null delta" in {
    // Given
    val (a, b, c) = (2, 3, 1.125)

    // When
    val solution = Math.quadraticEquation(a, b, c)

    // Then
    solution shouldBe Some(-0.75, -0.75)
  }

  it should "resolve quadraticEquation with negative delta" in {
    // Given
    val (a, b, c) = (2, 3, 4)

    // When
    val solution = Math.quadraticEquation(a, b, c)

    // Then
    solution shouldBe None
  }

  "abs" should "resolve abs with positive int" in {

    val x = 5.6
    val result = Math.abs(x)
    result shouldBe 5.6
  }

  "abs" should "resolve abs with negative int" in {

    val x = -3.8
    val result = Math.abs(x)
    result shouldBe 3.8
  }

  "sqrt_heron" should "calculate the square with Heron's method" in {
    val a = 25
    val result = Math.heron_sqrt(a)
    result shouldEqual 5.0
  }
  
}
