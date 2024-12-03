package core;

import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author vlad
 */
public class ManagerEntities {
    EntityManagerFactory emf;
    EntityManager em;
    SetupPersistence persistence;
    Map<String, String> properties;
    
    private String persistenceUnitName;
    
    public ManagerEntities(String persistenceUnitName)
    {   
        persistence = new SetupPersistence("/home/vlad/Desktop/Variables.env");
        persistence.setProperties();
        properties = persistence.getProperties(); 
        
        this.persistenceUnitName = persistenceUnitName;
        emf = Persistence.createEntityManagerFactory(this.persistenceUnitName, properties);
        em = emf.createEntityManager();
    }

    public EntityManagerFactory getManagerEntitiesFactory() {
        return emf;
    }
    
    public EntityManager getManagerEntities() {
        return em;
    }
    
    public String getPersistenceUnitName() {
        return this.persistenceUnitName;
    }
    
    public void BeginDataTransaction() { em.getTransaction().begin(); }
    public void InsertData(Object entity) { em.persist(entity); }
    public void RemoveEntity(Object entity) { em.remove(entity); }
    public void UpdateDataTransaction() { em.getTransaction().commit(); }
    public void EndDataTransaction() { em.close(); emf.close();}
}
