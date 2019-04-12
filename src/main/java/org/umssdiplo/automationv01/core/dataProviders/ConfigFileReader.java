package org.umssdiplo.automationv01.core.dataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
  private Properties properties;
  private final String propertyFilePath= "configs//Configuration.properties";

  public ConfigFileReader(){
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader(propertyFilePath));
      properties = new Properties();
      try { properties.load(reader); }
      catch (IOException e) { e.printStackTrace(); }
    } catch (FileNotFoundException e) {
      throw new RuntimeException("Properties file not found at path : " + propertyFilePath);
    }finally {
      try { if(reader != null) reader.close(); }
      catch (IOException ignore) {}
    }
  }

}
