package jdk.example;

import java.lang.reflect.Method;

public interface Interceptor {

    boolean before(Object proxy, Object target, Method method,Object[] args);
    boolean around(Object proxy, Object target, Method method,Object[] args);
    boolean after(Object proxy, Object target, Method method,Object[] args);

}
