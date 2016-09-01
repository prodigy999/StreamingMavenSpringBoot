package streaming.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import streaming.entity.Film;

@Component
@Aspect
public class LoggingAspect {
      
    @Before ("execution (* streaming.dao.FilmDAO.*save(..))")
    public void nouvFilm (JoinPoint jp){
        
        Film f = (Film) jp.getArgs()[0];
        
        System.out.println("***---*** Un nouveau film a ete cree ! ***---*** " + f.getTitre() );
    }
    
    @After ("execution (* streaming.dao.FilmDAO.*save(..))")
    public void verificationNouvFilm (JoinPoint jp){
        
        Film f = (Film) jp.getArgs()[0];
        
        System.out.println("***---*** After du nouveau film cree ! ***---*** " + f.getTitre());
    }
    
    @Before ("execution (* streaming.dao.FilmDAO.*delete(..))")
    public void SignaleFilmSupprime(JoinPoint jp){
        
        Film f = (Film) jp.getArgs()[0];
        
        System.out.println("***---*** Le film a ete supprime ! ***---*** " + f.getTitre());
    }
    
    
    
//    @Before("execution (* streaming.dao.*.*(..))")
//    public void log (JoinPoint jp){
        
//        System.out.println(jp);
//     }
    
}
