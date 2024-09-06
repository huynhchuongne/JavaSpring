/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hnc.configs;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author ASUS
 */
public class DispatcherServletInit extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
         HibernateConfigs.class,
         TilesConfigs.class,  
         SpringSercurityConfigs.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
       return new Class[]{
         WebAppContextConfigs.class
       };
    }

    @Override
    protected String[] getServletMappings() {
       return new String[] {"/"};
    }
    
}
