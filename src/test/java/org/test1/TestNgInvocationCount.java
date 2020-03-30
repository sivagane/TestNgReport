package org.test1;

import org.testng.annotations.Test;

public class TestNgInvocationCount {
@Test(invocationCount=5, threadPoolSize=2)
public void test() {
	System.out.println("Test is Executed Multiple Times");
}
}
