package streaming.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {
    
    @Before ("execution (* streaming.dao.*.*deleteAll(..))")
    public void testDeleteAll (JoinPoint jp)throws RuntimeException{
        
        throw new RuntimeException(" ***---*** Une tentative de deleteAll a ete capture ! ***---*** " + jp );
    }
    
    
    
    
}
