package parallel_execution;

import org.testng.annotations.Test;

public class ParallelM {

		@Test
		public void TC1() {
			System.out.println("output for TC1 :"+Thread.currentThread().getId());
		}
		
		@Test(threadPoolSize = 3,invocationCount = 3)
		public void TC2() {
			System.out.println("output for TC2 :"+Thread.currentThread().getId());
		}
		
		@Test
		public void TC3() {
			System.out.println("output for TC3 :"+Thread.currentThread().getId());
		}
}
