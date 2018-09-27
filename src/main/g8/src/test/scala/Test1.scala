
// Needed to run or show quotes
import dotty.tools.dotc.quoted.Toolbox._

import org.junit.Test
import org.junit.Assert._

class Test1 {
  @Test def t1(): Unit = {
    val code = '(println("foo"))
    assertEquals("scala.Predef.println(\"foo\")", code.show)
  }
}
