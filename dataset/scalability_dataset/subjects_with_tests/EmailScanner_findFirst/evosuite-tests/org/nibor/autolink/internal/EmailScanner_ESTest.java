/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 05 05:08:48 GMT 2022
 */

package org.nibor.autolink.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.nibor.autolink.LinkSpan;
import org.nibor.autolink.internal.EmailScanner;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmailScanner_ESTest extends EmailScanner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(true);
      char[] charArray0 = new char[6];
      charArray0[4] = 'p';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.put("y\u0006");
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 3, (-2965));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(false);
      char[] charArray0 = new char[23];
      charArray0[2] = '@';
      charArray0[3] = 'D';
      charArray0[4] = '5';
      charArray0[5] = '_';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 6, (-2965));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(true);
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 1, 0);
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(false);
      char[] charArray0 = new char[23];
      charArray0[4] = '5';
      charArray0[5] = '_';
      charArray0[7] = 'Q';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 6, (-2965));
      assertEquals(4, linkSpan0.getBeginIndex());
      assertEquals(8, linkSpan0.getEndIndex());
      assertNotNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(true);
      // Undeclared exception!
      try { 
        emailScanner0.scan("y\u0006", 46, (-1423));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(false);
      // Undeclared exception!
      try { 
        emailScanner0.scan((CharSequence) null, 2034, 5);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(false);
      char[] charArray0 = new char[6];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        emailScanner0.scan(charBuffer0, 2044, 1835);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(true);
      char[] charArray0 = new char[6];
      charArray0[2] = '$';
      charArray0[4] = '\u008D';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 3, (-2965));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(true);
      char[] charArray0 = new char[6];
      charArray0[2] = '~';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 3, (-2965));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(true);
      char[] charArray0 = new char[7];
      charArray0[2] = '}';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 3, (-2965));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(false);
      char[] charArray0 = new char[9];
      charArray0[4] = '|';
      charArray0[5] = '_';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 6, (-2965));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(false);
      char[] charArray0 = new char[19];
      charArray0[5] = '`';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 6, (-2965));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(false);
      char[] charArray0 = new char[9];
      charArray0[3] = '^';
      charArray0[4] = '5';
      charArray0[5] = '?';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 6, (-2965));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(false);
      char[] charArray0 = new char[9];
      charArray0[4] = '=';
      charArray0[5] = 'R';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 6, (-2965));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(true);
      char[] charArray0 = new char[6];
      charArray0[2] = '-';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 3, (-2950));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(true);
      char[] charArray0 = new char[6];
      charArray0[2] = '+';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 3, (-2946));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(true);
      char[] charArray0 = new char[12];
      charArray0[2] = '\'';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 3, '\u0000');
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(true);
      char[] charArray0 = new char[6];
      charArray0[2] = '&';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 3, (-2965));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(false);
      char[] charArray0 = new char[6];
      charArray0[2] = '%';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 3, (-2965));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(true);
      char[] charArray0 = new char[6];
      charArray0[2] = '#';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 3, (-2965));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(true);
      char[] charArray0 = new char[9];
      charArray0[2] = '!';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 3, (-2965));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(true);
      char[] charArray0 = new char[7];
      charArray0[2] = '\u0087';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 3, (-2965));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(false);
      char[] charArray0 = new char[9];
      charArray0[5] = '?';
      charArray0[7] = 'Q';
      charArray0[8] = '5';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 6, (-2965));
      assertEquals(5, linkSpan0.getBeginIndex());
      assertEquals(9, linkSpan0.getEndIndex());
      assertNotNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(true);
      char[] charArray0 = new char[17];
      charArray0[4] = '.';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.put("y\u0006");
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 3, (-2965));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(true);
      char[] charArray0 = new char[6];
      charArray0[3] = '.';
      charArray0[4] = '{';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.put("y\u0006");
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 3, (-2965));
      assertNull(linkSpan0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(false);
      char[] charArray0 = new char[21];
      charArray0[2] = '/';
      charArray0[4] = 'p';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, 3, (-1239));
      assertEquals(2, linkSpan0.getBeginIndex());
      assertNotNull(linkSpan0);
      assertEquals(5, linkSpan0.getEndIndex());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      EmailScanner emailScanner0 = new EmailScanner(false);
      char[] charArray0 = new char[19];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      LinkSpan linkSpan0 = emailScanner0.scan(charBuffer0, (-2965), '`');
      assertNull(linkSpan0);
  }
}
