package org.springframework.beans.factory;

import org.springframework.beans.BeanDefinition;
import org.springframework.beans.BeansException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {

    //使用线程安全的哈希表做最初始的容器
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
