package com.lee.chain;

public class AppRegisterHandler extends AbstractRegisterHandler {


    @Override
    public int getSource() {
        return RegisterConstants.RegisterEnum.APP_CHANNEL.getCode();
    }


    @Override
    public boolean doPostProcessorAfterRegister(RegisterInputParam registerInputParam) {
        System.out.println("app处理逻辑");
        return true;
    }
}