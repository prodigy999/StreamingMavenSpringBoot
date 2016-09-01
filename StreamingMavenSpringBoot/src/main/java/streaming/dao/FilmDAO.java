package streaming.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Film;


public interface FilmDAO extends CrudRepository<Film, Long>{
    
    public Film findOneByTitre(String t);
    
    public List<Film> findAllByAnnee (Integer a);
    
    public List<Film> findAllByTitreOrAnnee (String t, Integer a);
    
    public List<Film> findAllByTitreAndAnnee (String t, Integer a);
    
    public List<Film> findAllByPaysId (Long id);
    
    public List<Film> findAllByActeursNomAndActeursPrenom (String n, String p);
    
    public Long countAllByActeursNomAndActeursPrenom ( String n, String p);
    
    public List<Film> findAllByRealisateursNomAndRealisateursPrenomOrderByTitre (String n, String p);
    
    public Long countAllByRealisateursNomAndRealisateursPrenom (String n, String p);
    
    public List<Film> findAllByPaysNomAndRealisateursPrenomAndRealisateursNomAndActeursPrenomAndActeursNom (String realPrenom, String realNom, String actPrenom, String actNom, String paysNom);
    
}
