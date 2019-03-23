
import scala.quoted._

import org.junit.Test
import org.junit.Assert._

class Test1 {

  // Needed to run or show quotes
  given as scala.quoted.Toolbox = scala.quoted.Toolbox.make(getClass.getClassLoader)

  private def code given QuoteContext = '{ identity("foo") }

  @Test def t1(): Unit = {
    assertEquals("scala.Predef.identity[java.lang.String](\"foo\")", withQuoteContext(code.show))
    assertEquals("foo", run(code))
  }
}
