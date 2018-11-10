package com.tw

import org.scalatest.{FunSuite, Matchers}

class CalcTest extends FunSuite with Matchers {

  test("should add ") {
    val sum = new Calc().add(1, 3)
    sum shouldBe 4
  }

  test("should subtract"){
    val sub = new Calc().sub(4,3)
    sub shouldBe 1
  }

  test("should give true for even nums"){
    val is2Even = new Calc().isEven(2)
    assert(is2Even)

    val is3Even = new Calc().isEven(3)
    assert(!is3Even)
  }

  test("should give correct factorial of 2"){
    val fact2 = new Calc().factorial(2);
    fact2 shouldBe 2
  }

  test("should give 6 as factorial of 3"){
    val fact3 = new Calc().factorial(3);
    fact3 shouldBe 6
  }
  test("should give 0 as factorial of 0"){
    val fact0 = new Calc().factorial(0);

  }

}
