package listeners;

import org.testng.*;

/**
 * Created by Oleksii_Sydorenko on 11/1/2016.
 */
public class MethodListener implements IInvokedMethodListener {


    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
    }
    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        Reporter.log("Class - " + this.returnClassName(iInvokedMethod.getTestMethod()) + ", Method - " + this.returnMethodName(iInvokedMethod.getTestMethod()) + ", Status - " + this.returnStatus(iTestResult) + ", Elapsed time: " + (iTestResult.getEndMillis() - iTestResult.getStartMillis()));
    }

    private String returnMethodName(ITestNGMethod method) {
        return method.getMethodName();
    }

    private String returnClassName(ITestNGMethod method) {
        return method.getRealClass().getSimpleName();
    }

    private int returnStatus(ITestResult result) {
        return result.getStatus();
    }
}