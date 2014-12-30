package com.nva.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * Created by edu on 08/12/2014.
 */
@Aspect
public class InstanceObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(InstanceObject.class);

    @Before("execution (* com.nva.service.*.*.*(..))")
    public void beforeGuardar(JoinPoint jp) throws Throwable{
        LOGGER.info(" ");
        LOGGER.debug("-------------------------   BEGIN   --------------------------------:" + jp.toShortString() + " " + jp.getTarget().getClass());
    }

    @After("execution (* com.nva.service.*.*.*(..))")
    public Object afterGuardar(JoinPoint jp) throws Throwable{
        LOGGER.info("------------------------------ END -------------------------------:"+jp.getTarget().getClass());
        LOGGER.info(" ");
        return null;
    }

    public Object guardar(ProceedingJoinPoint pjp) throws Throwable {

        Object [] t = pjp.getArgs();
        Class clazz = null;
        if( t.length > 0){
            for ( int i=0; i< t.length ; i++){
                System.out.println("el param en el posicion :"+i+" es :" +t[i]);
                clazz = t[i].getClass();
                LOGGER.info("el param en el posicion :"+i+" es :" +t[i]);
                if( LOGGER.isDebugEnabled()){
                    LOGGER.debug("el param en el posicion :"+i+" es :" +t[i]);
                }
            }

        }

        return pjp.proceed();
    }

    public Object delete(ProceedingJoinPoint pjp) throws Throwable {

        Object [] t = pjp.getArgs();
        Class clazz = null;
        if( t.length > 0){
            for ( int i=0; i< t.length ; i++){
                System.out.println("el param en el posicion :"+i+" es :" +t[i]);
                clazz = t[i].getClass();
                LOGGER.info("el param en el posicion :"+i+" es :" +t[i]);
                if( LOGGER.isDebugEnabled()){
                    LOGGER.debug("el param en el posicion :"+i+" es :" +t[i]);
                }
            }

        }

        return pjp.proceed();
    }

    public Object lista(ProceedingJoinPoint pjp) throws Throwable {

        Object [] t = pjp.getArgs();
        if( t.length > 0){
            for ( int i=0; i< t.length ; i++){
                System.out.println("el param en el posicion :"+i+" es :" +t[i]);
                LOGGER.info("el param en el posicion :"+i+" es :" +t[i]);
                if( LOGGER.isDebugEnabled()){
                    LOGGER.debug("el param en el posicion :"+i+" es :" +t[i]);
                }
            }
        }else{
            System.out.println("no tiene args");
        }

        return pjp.proceed();
    }

    @AfterThrowing(pointcut = "execution (* com.nva.service.*.*.*(..))", throwing = "t")
    public void error(JoinPoint pjp,Throwable t){
        try{
            LOGGER.error(" ********************************************************************************************************************************************");
            LOGGER.error(" ************************************************************* BEGIN ERROR InstanceObject ******************************************************************");
            Object [] args = pjp.getArgs();

            if( args.length > 0){
                for ( int i=0; i< args.length ; i++){
                    System.out.println("el param en el posicion :"+i+" es :" +args[i]);
                    LOGGER.error("el param en el posicion :"+i+" es :" +args[i]);
                }
            }else{
                System.out.println("no tiene args");
                LOGGER.info("no params");
            }

            LOGGER.error(t.getMessage());
            LOGGER.error(" ************************************************************* END ERROR InstanceObject ******************************************************************");
            LOGGER.error(" ********************************************************************************************************************************************");
        }catch( Exception e){
            System.out.println("la excepcion es:" + e.getStackTrace());
        }
    }

    public void afterThrowing(final Method method, final Object[] args, final Object thrower,
                              final Throwable error) {
        System.out.println("Entered afterThrowing()");

    }

}
