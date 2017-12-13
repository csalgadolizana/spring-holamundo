/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import beans.BeanSpring;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author PC-Cristopher
 */
public class PruebaSpring {
    
    public static void main(String[] args) {
        Logger log = LogManager.getRootLogger();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BeanFactory factory = context;
        BeanSpring miBean = (BeanSpring) factory.getBean("miBean");
        log.info("Mensaje : " + miBean.getMensaje());
    }
}
