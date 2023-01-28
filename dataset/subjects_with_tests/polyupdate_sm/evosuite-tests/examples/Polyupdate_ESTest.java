/*
 * This file was automatically generated by EvoSuite
 * Thu May 12 14:57:08 GMT 2022
 */

package examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import examples.Polyupdate;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Polyupdate_ESTest extends Polyupdate_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Polyupdate polyupdate0 = new Polyupdate();
      polyupdate0.a((-804));
      polyupdate0.a(0);
      assertEquals((-804), polyupdate0.sm());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Polyupdate polyupdate0 = new Polyupdate(arrayList0, 1148);
      polyupdate0._var426 = (-448);
      int int0 = polyupdate0.sm();
      assertEquals(700, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Polyupdate polyupdate0 = new Polyupdate(arrayList0, 4825);
      polyupdate0.a(4825);
      polyupdate0.clear();
      assertEquals(0, polyupdate0.sm());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Polyupdate polyupdate0 = new Polyupdate();
      polyupdate0.add3(0, 0, 143, (-254));
      assertEquals((-111), polyupdate0.sm());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Polyupdate polyupdate0 = new Polyupdate();
      polyupdate0.add3(1527, 0, (-1), 1527);
      assertEquals(3053, polyupdate0.sm());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Polyupdate polyupdate0 = new Polyupdate(arrayList0, (-101));
      int int0 = polyupdate0.sm();
      assertEquals((-101), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      arrayList0.add((Integer) null);
      Polyupdate polyupdate0 = null;
      try {
        polyupdate0 = new Polyupdate(arrayList0, 1719);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("examples.Polyupdate", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Polyupdate polyupdate0 = new Polyupdate();
      polyupdate0.a(1);
      assertEquals(2, polyupdate0.sm());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-1015));
      arrayList0.add(integer0);
      Polyupdate polyupdate0 = new Polyupdate(arrayList0, (-1015));
      assertEquals((-2030), polyupdate0.sm());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Polyupdate polyupdate0 = new Polyupdate();
      polyupdate0.add3((-4006), (-4006), (-4006), (-4006));
      assertEquals((-16024), polyupdate0.sm());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Polyupdate polyupdate0 = new Polyupdate();
      int int0 = polyupdate0.sm();
      assertEquals(0, int0);
  }
}
