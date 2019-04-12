package org.umssdiplo.automationv01.core.dataProviders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import org.umssdiplo.automationv01.core.managers.FileReaderManager;
import org.umssdiplo.automationv01.core.testDataTypes.Machinery;

public class JsonDataReader {
  private final String customerFilePath = "";
  //          FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath() + "Customer.json";
  private List<Machinery> customerList;

  public JsonDataReader() {
    customerList = getMachineryData();
  }

  private List<Machinery> getMachineryData() {
    Gson gson = new Gson();
    BufferedReader bufferReader = null;
    try {
      bufferReader = new BufferedReader(new FileReader(customerFilePath));
      Machinery[] customers = gson.fromJson(bufferReader, Machinery[].class);
      return Arrays.asList(customers);
    } catch (FileNotFoundException e) {
      throw new RuntimeException("Json file not found at path : " + customerFilePath);
    } finally {
      try {
        if (bufferReader != null) bufferReader.close();
      } catch (IOException ignore) {
      }
    }
  }

}
