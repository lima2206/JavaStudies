package br.com.lima.screenmatch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertData implements IConvertData {

  private final ObjectMapper mapper = new ObjectMapper();


  @Override
  public <T> T getData(String json, Class<T> classe) {
    try {
      return mapper.readValue(json, classe);
    } catch (JsonProcessingException e) {
      throw new RuntimeException(e);
    }
  }
}
