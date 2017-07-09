package com.jhoon.springboard.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.web.context.WebApplicationContext;
 
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        // test 시 tilesConfigurer 의 scope를 request로 변경해준다.
        BeanDefinition bd = beanFactory.getBeanDefinition("tilesConfigurer");
        bd.setScope(WebApplicationContext.SCOPE_REQUEST);
    }
}
