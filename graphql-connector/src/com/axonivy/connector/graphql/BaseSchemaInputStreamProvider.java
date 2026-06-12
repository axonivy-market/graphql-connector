package com.axonivy.connector.graphql;

import java.io.InputStream;

public class BaseSchemaInputStreamProvider implements SchemaInputStreamProvider {

  @Override
  public InputStream schema() {
    return getClass().getResourceAsStream("schema.graphqls");
  }
}
