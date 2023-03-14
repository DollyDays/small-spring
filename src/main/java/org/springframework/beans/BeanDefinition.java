package org.springframework.beans;

//定义：BeanDefinition，
// 可能这是你在查阅 Spring 源码时经常看到的一个类，例如它会包括 singleton、prototype、BeanClassName 等。
// 但目前我们初步实现会更加简单的处理，只定义一个 Object 类型用于存放对象。
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        //测试推送
        return bean;
    }

}
