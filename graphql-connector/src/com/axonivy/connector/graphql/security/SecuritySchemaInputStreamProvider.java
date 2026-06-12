package com.axonivy.connector.graphql.security;

import java.io.InputStream;

import com.axonivy.connector.graphql.SchemaInputStreamProvider;

public class SecuritySchemaInputStreamProvider implements SchemaInputStreamProvider {

  @Override
  public InputStream schema() {
    return getClass().getResourceAsStream("schema.graphqls");
  }
}
