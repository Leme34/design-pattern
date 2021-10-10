package com.lee.chain;

import org.junit.Test;

public class ChainTest {

    @Test
    public void testChain() {
        RegisterInputParam registerInputParam = new RegisterInputParam();
        registerInputParam.setUserId(10012);
        registerInputParam.setSource(0);

        IRegisterService registerService = new RegisterServiceImpl();
        registerService.postProcessorAfterRegister(registerInputParam);

        RegisterInputParam registerInputParam2 = new RegisterInputParam();
        registerInputParam2.setUserId(10013);
        registerInputParam2.setSource(1);
        registerService.postProcessorAfterRegister(registerInputParam2);

        System.out.println("=======");
    }
}