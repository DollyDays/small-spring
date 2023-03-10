package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

public interface BeanFactory {

    //如果我们在获取Bean的时候，使用&则获取的是FactoryBean本身对象，否则是获取getObject的代理对象。
    //beanFactory.getBean("helloworld")
    //beanFactory.getBean("&helloService")  这个获取的是beanFactory对象
    String FACTORY_BEAN_PREFIX = "&";

    Object getBean(String name) throws BeansException;

    <T> T getBean(String name, Class<T> requireType) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;


    <T> T getBean(Class<T> requireType) throws BeansException;

    <T> T getBean(Class<T> requireType, Object... args) throws BeansException;


}
