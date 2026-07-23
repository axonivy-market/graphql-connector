package com.axonivy.connector.graphql.workflow;

import java.io.InputStream;

import com.axonivy.connector.graphql.SchemaInputStreamProvider;

public class WorkflowSchemaInputStreamProvider implements SchemaInputStreamProvider {

  @Override
  public InputStream schema() {
    return getClass().getResourceAsStream("schema.graphqls");
  }
}
