package com.zhshio.springframework.context;


import com.zhshio.springframework.beans.factory.HierarchicalBeanFactory;
import com.zhshio.springframework.beans.factory.ListableBeanFactory;
import com.zhshio.springframework.core.io.ResourceLoader;

/**
 * @Auther: 张帅
 * @Date: 2023/11/18 - 11 - 18 - 23:31
 * @Description: com.zhshio.springframework.context
 * @version: 1.0
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
    //目前还不需要添获取ID和父类上下文，暂无接口方法的定义。
}
