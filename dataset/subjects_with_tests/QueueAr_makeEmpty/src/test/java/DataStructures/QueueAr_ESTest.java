/*
 * This file was automatically generated by EvoSuite
 * Thu May 12 15:08:30 GMT 2022
 */

package DataStructures;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import DataStructures.QueueAr;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class QueueAr_ESTest extends QueueAr_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(1064);
      Object object0 = queueAr0.getFront();
      queueAr0.enqueue(object0);
      queueAr0.enqueue(object0);
      assertFalse(queueAr0.isEmpty());
      
      queueAr0.dequeueAll();
      assertTrue(queueAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(1196);
      queueAr0.makeEmpty();
      assertTrue(queueAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(574);
      assertTrue(queueAr0.isEmpty());
      
      Object object0 = new Object();
      queueAr0.enqueue(object0);
      queueAr0.getFront();
      assertFalse(queueAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      QueueAr queueAr0 = null;
      try {
        queueAr0 = new QueueAr((-2342));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("DataStructures.QueueAr", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(612);
      Object object0 = new Object();
      queueAr0.enqueue(object0);
      assertFalse(queueAr0.isEmpty());
      
      queueAr0.dequeue();
      assertTrue(queueAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(1);
      boolean boolean0 = queueAr0.isFull();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(1);
      queueAr0.enqueue((Object) null);
      boolean boolean0 = queueAr0.isFull();
      assertFalse(queueAr0.isEmpty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(574);
      boolean boolean0 = queueAr0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(612);
      assertTrue(queueAr0.isEmpty());
      
      Object object0 = new Object();
      queueAr0.enqueue(object0);
      boolean boolean0 = queueAr0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(1);
      queueAr0.enqueue((Object) null);
      try { 
        queueAr0.enqueue((Object) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("DataStructures.QueueAr", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(1);
      queueAr0.dequeue();
      assertTrue(queueAr0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      QueueAr queueAr0 = new QueueAr(1);
      queueAr0.enqueue((Object) null);
      assertFalse(queueAr0.isEmpty());
      
      queueAr0.dequeue();
      assertTrue(queueAr0.isEmpty());
  }
}