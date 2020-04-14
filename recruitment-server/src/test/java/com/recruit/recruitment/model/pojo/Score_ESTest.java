/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 10 13:02:13 GMT 2020
 */

package com.recruit.recruitment.model.pojo;

import org.junit.Test;
import static org.junit.Assert.*;
import com.recruit.recruitment.model.pojo.Score;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Score_ESTest extends Score_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Score score0 = new Score();
      Integer integer0 = new Integer(0);
      score0.setScoreid(integer0);
      Integer integer1 = score0.getScoreid();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Score score0 = new Score();
      Integer integer0 = new Integer((-2257));
      score0.setScoreid(integer0);
      Integer integer1 = score0.getScoreid();
      assertEquals((-2257), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Score score0 = new Score();
      Integer integer0 = new Integer(1232);
      score0.setScoreid(integer0);
      Integer integer1 = score0.getScoreid();
      assertEquals(1232, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Score score0 = new Score();
      BigDecimal bigDecimal0 = new BigDecimal(0.0);
      score0.setScore(bigDecimal0);
      BigDecimal bigDecimal1 = score0.getScore();
      assertEquals((byte)0, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Score score0 = new Score();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)111;
      BigInteger bigInteger0 = new BigInteger(byteArray0);
      BigDecimal bigDecimal0 = new BigDecimal(bigInteger0);
      score0.setScore(bigDecimal0);
      BigDecimal bigDecimal1 = score0.getScore();
      assertEquals((byte)111, bigDecimal1.byteValue());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Score score0 = new Score();
      BigDecimal bigDecimal0 = new BigDecimal((-69));
      score0.setScore(bigDecimal0);
      BigDecimal bigDecimal1 = score0.getScore();
      assertSame(bigDecimal1, bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Score score0 = new Score();
      Integer integer0 = new Integer(0);
      score0.setMarkerid(integer0);
      Integer integer1 = score0.getMarkerid();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Score score0 = new Score();
      Integer integer0 = new Integer(627);
      score0.setMarkerid(integer0);
      Integer integer1 = score0.getMarkerid();
      assertEquals(627, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Score score0 = new Score();
      Integer integer0 = new Integer((-2155));
      score0.setMarkerid(integer0);
      Integer integer1 = score0.getMarkerid();
      assertEquals((-2155), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Score score0 = new Score();
      Integer integer0 = new Integer(1579);
      score0.setApplicationid(integer0);
      Integer integer1 = score0.getApplicationid();
      assertEquals(1579, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Score score0 = new Score();
      Integer integer0 = new Integer(0);
      score0.setApplicationid(integer0);
      Integer integer1 = score0.getApplicationid();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Score score0 = new Score();
      Integer integer0 = new Integer((-129));
      score0.setApplicationid(integer0);
      Integer integer1 = score0.getApplicationid();
      assertEquals((-129), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Score score0 = new Score();
      Integer integer0 = score0.getApplicationid();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Score score0 = new Score();
      BigDecimal bigDecimal0 = score0.getScore();
      assertNull(bigDecimal0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Score score0 = new Score();
      Integer integer0 = score0.getScoreid();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Score score0 = new Score();
      Integer integer0 = score0.getMarkerid();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Score score0 = new Score();
      Integer integer0 = new Integer((-578));
      score0.setApplicationid(integer0);
      Integer integer1 = score0.getApplicationid();
      assertEquals((-578), (int)integer1);
  }
}