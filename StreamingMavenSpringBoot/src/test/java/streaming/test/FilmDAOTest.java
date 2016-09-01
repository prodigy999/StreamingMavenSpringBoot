/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import streaming.spring.SpringConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import streaming.dao.FilmDAO;
import streaming.entity.Film;

/**
 *
 * @author ETY
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class FilmDAOTest {
    
    @Autowired
    private FilmDAO dao;
    
    @Test
    public void testFilms(){
        
        Film f = new Film();
        f.setTitre("Armageddon");
        f.setAnnee(2003);
        f.setDuree(120);
        f.setSynopsis("bla bla bla");
        f.setId(2015L);
        
        dao.save(f);
        
//        Assert.assertNotNull(dao.findOneByTitre("Les deux tours"));
//        Assert.assertNotNull(dao.findAllByAnnee(1983));
//        Assert.assertNotNull(dao.findAllByTitreOrAnnee("Les deuxze tours", 2016));
//        Assert.assertNotNull(dao.findAllByTitreAndAnnee("Les deuxze tours", 2016));
        
        dao.delete(f);
        
        dao.deleteAll();
    }
    
}
