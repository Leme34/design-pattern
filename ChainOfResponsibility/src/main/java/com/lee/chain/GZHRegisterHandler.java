package com.lee.chain;

public class GZHRegisterHandler  extends AbstractRegisterHandler {


    @Override
    public int getSource() {
        return RegisterConstants.RegisterEnum.GZH_CHANNEL.getCode();
    }


    @Override
    public boolean doPostProcessorAfterRegister(RegisterInputParam registerInputParam) {
        System.out.println("公众号处理逻辑");
        return true;
    }
}