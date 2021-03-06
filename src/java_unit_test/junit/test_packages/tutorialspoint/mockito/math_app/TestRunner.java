package java_unit_test.junit.test_packages.tutorialspoint.mockito.math_app;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(
                MathApplicationTester.class,
                MathApplicationTesterBDDStyle.class,
                MathApplicationTesterCreateMock.class,
                MathApplicationTesterOrderedVerification.class,
                MathApplicationTesterThrowsException.class,
                MathApplicationTesterWithCallback.class,
                MathApplicationTesterWithResetMock.class,
                MathApplicationTesterWithSpy.class,
                MathApplicationTesterWithTimeout.class,
                MathApplicationTesterWithVerify.class,
                MathApplicationTesterWithVerifyTimesCall.class,
                MathApplicationTesterWithVerifyVaryingCalls.class
        );

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
