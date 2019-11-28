package com.jzhl.plate.common;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * spring bean 工厂,通过实现ApplicationContextAware,获取bean实例
 * @author 陈龙
 *
 */
@Component
public class SpringFactory implements ApplicationContextAware {

    private static ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext context)
            throws BeansException {
        // TODO Auto-generated method stub
        this.context = context;
    }

    /**
     * 获取spring bean实体
     * @param classId
     * @return
     */
    public static Object getBean(String classId){
        Object object = null;
        object = context.getBean(classId);
        return object;
    }

}
