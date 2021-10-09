package top.mowang.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * Spring-MVC-Demo
 * web工程的初始化类，代替web.xml
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/09 22:26
 **/
public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * @description: 指定spring的配置类
     * @author: Xuan Li
     * @date: 2021/10/9 22:27
    */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    /**
     * @description: 指定springMVC的配置类
     * @author: Xuan Li
     * @date: 2021/10/9 22:27
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    /**
     * @description: 指定dispatcherServlet的映射规则，url-pattern
     * @author: Xuan Li
     * @date: 2021/10/9 22:27
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     * @description: 注册过滤器
     * @author: Xuan Li
     * @date: 2021/10/9 22:33
    */
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceResponseEncoding(true);
        HiddenHttpMethodFilter hiddenHttpMethodFilter = new HiddenHttpMethodFilter();
        return new Filter[]{characterEncodingFilter,hiddenHttpMethodFilter};
    }
}
