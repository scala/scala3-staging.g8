
import scala.quoted._
import scala.quoted.staging.{run, withQuotes, Toolbox}

import org.junit.Test
import org.junit.Assert._

class Test1 {

  // Needed to run or show quotes
  given Toolbox = Toolbox.make(getClass.getClassLoader)

  private def code(using Quotes) = '{ identity("foo") }

  @Test def t1(): Unit = {
    assertEquals("scala.Predef.identity[java.lang.String](\"foo\")", withQuotes(code.show))
    assertEquals("foo", run(code))
  }
}
