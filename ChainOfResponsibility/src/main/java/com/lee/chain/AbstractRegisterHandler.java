package com.lee.chain;

public abstract class AbstractRegisterHandler {

    /**
     * 获取注册渠道ID
     *
     * @return
     */
    public abstract int getSource();

    /**
     * 注册之后的核心通知模块程序
     *
     * @param registerInputParam
     * @return
     */
    public abstract boolean doPostProcessorAfterRegister(RegisterInputParam registerInputParam);

}