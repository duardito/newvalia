package com.nva.web.config;

import com.nva.web.WebConfigurations;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

/**
 * Created by edu on 07/12/2014.
 */


public class WebInitContext extends
        AbstractAnnotationConfigDispatcherServletInitializer {

        @Override
        protected Class<?>[] getRootConfigClasses() {
                return new Class<?>[]{WebConfigurations.class,};
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
                GenericWebApplicationContext context = new GenericWebApplicationContext();
                ConfigurableEnvironment env = context.getEnvironment();
                env.setActiveProfiles("${active.profile}");
                return new Class<?>[0];
        }

        @Override
        protected Filter[] getServletFilters() {

                final SimpleCORSFilter simpleCORSFilter = new SimpleCORSFilter();
                //it is required to be name shirofilter, when spring scans all components will search a bean named shiroFilter
                final DelegatingFilterProxy securityFilterChain =
                        new DelegatingFilterProxy("shiroFilter");

                CharacterEncodingFilter characterEncodingFilter =
                        new CharacterEncodingFilter();
                characterEncodingFilter.setEncoding("UTF-8");
                characterEncodingFilter.setForceEncoding(true);


                return new Filter[] {securityFilterChain,simpleCORSFilter ,characterEncodingFilter };
        }

        @Override
        protected String[] getServletMappings() {
                return new String[] {"/" };
        }
}
