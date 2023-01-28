/*
 * This file was automatically generated by EvoSuite
 * Thu May 12 15:30:32 GMT 2022
 */

package DataStructures;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import DataStructures.StackAr;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StackAr_ESTest extends StackAr_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1226);
      stackAr0.push((Object) null);
      stackAr0.push((Object) null);
      assertFalse(stackAr0.isFull());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1226);
      stackAr0.push((Object) null);
      stackAr0.makeEmpty();
      assertTrue(stackAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1);
      stackAr0.push("n-Fdq#&r*7~V2RaNO");
      stackAr0.topAndPop();
      assertTrue(stackAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1);
      assertFalse(stackAr0.isFull());
      
      stackAr0.push("n-Fdq#&r*7~V2RaNO");
      stackAr0.top();
      assertTrue(stackAr0.isFull());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StackAr stackAr0 = new StackAr(0);
      boolean boolean0 = stackAr0.isFull();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StackAr stackAr0 = new StackAr(1468);
      boolean boolean0 = stackAr0.isFull();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StackAr stackAr0 = new StackAr(159);
      stackAr0.push((Object) null);
      stackAr0.isEmpty();
      assertFalse(stackAr0.isFull());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StackAr stackAr0 = new StackAr(2824);
      boolean boolean0 = stackAr0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StackAr stackAr0 = new StackAr(3718);
      try { 
        stackAr0.pop();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("DataStructures.StackAr", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StackAr stackAr0 = new StackAr(0);
      stackAr0.top();
      assertTrue(stackAr0.isFull());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StackAr stackAr0 = new StackAr(3718);
      stackAr0.push((Object) null);
      stackAr0.topAndPop();
      assertTrue(stackAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StackAr stackAr0 = new StackAr(0);
      try { 
        stackAr0.push((Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("DataStructures.StackAr", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StackAr stackAr0 = new StackAr(3718);
      stackAr0.topAndPop();
      assertTrue(stackAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StackAr stackAr0 = new StackAr(3718);
      stackAr0.push((Object) null);
      assertFalse(stackAr0.isEmpty());
      
      stackAr0.pop();
      assertTrue(stackAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StackAr stackAr0 = null;
      try {
        stackAr0 = new StackAr((-137));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("DataStructures.StackAr", e);
      }
  }
}
