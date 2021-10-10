package com.lee.chain;

public interface IRegisterService {

    /**
     * 用户注册之后处理函数
     *
     * @param registerInputParam 用户注册之后的传入参数
     */
    void postProcessorAfterRegister(RegisterInputParam registerInputParam);
}