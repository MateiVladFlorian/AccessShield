package core;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.logging.*;

/**
 *
 * @author vlad
 */
public final class SetupPersistence 
{
    private Map<String, String> properties;
    
    public SetupPersistence(String AbsolutePath)
    {
        properties = new HashMap<>();
        loadEnv(AbsolutePath);
    }
    
    public void loadEnv(String filePath)
    {
        try {
            Files.lines(Paths.get(filePath)).filter(line -> !line.trim().isEmpty() && !line.startsWith("#"))
                    .map(line -> line.split("=", 2)).filter(keyValue -> keyValue.length == 2)
                    .forEach(keyValue -> System.setProperty(keyValue[0].trim(), keyValue[1].trim()));
        } 
        catch (IOException ex) { Logger.getLogger(ManagerEntities.class.getName()).log(Level.SEVERE, null, ex); }
    }
    
    public void setProperties()
    {
        if (System.getProperty("DB_URL") == null || System.getProperty("DB_USER") == null || System.getProperty("DB_PASSWORD") == null)
            throw new IllegalStateException("Database configuration is incomplete. Please check the .env file.");
        
        properties.put("javax.persistence.jdbc.url", System.getProperty("DB_URL"));
        properties.put("javax.persistence.jdbc.user", System.getProperty("DB_USER"));
        properties.put("javax.persistence.jdbc.password", System.getProperty("DB_PASSWORD"));
    }
    
    public Map<String, String> getProperties() {
        return properties;
    }
}
