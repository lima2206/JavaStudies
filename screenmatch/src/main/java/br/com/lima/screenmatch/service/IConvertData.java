package br.com.lima.screenmatch.service;

public interface IConvertData {

  <T> T  getData(String json, Class<T> classe);
}
