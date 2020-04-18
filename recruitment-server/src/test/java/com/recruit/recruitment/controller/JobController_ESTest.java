/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 09 22:27:43 GMT 2020
 */

package com.recruit.recruitment.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;

import com.recruit.recruitment.model.entity.Result;
import com.recruit.recruitment.service.JobService;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.javaee.injection.Injector;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class JobController_ESTest extends JobController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JobController jobController0 = new JobController();
      JobService jobService0 = mock(JobService.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(jobService0).findJobExpByUserid();
      Injector.inject(jobController0, (Class<?>) JobController.class, "jobService", (Object) jobService0);
      Injector.validateBean(jobController0, (Class<?>) JobController.class);
      Result result0 = jobController0.findJobByUserId();
      assertEquals("Query successful", result0.getMessage());
      assertEquals(200, (int)result0.getCode());
  }
}
