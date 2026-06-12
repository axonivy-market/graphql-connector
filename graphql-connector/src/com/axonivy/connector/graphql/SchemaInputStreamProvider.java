package com.axonivy.connector.graphql;

import java.io.InputStream;
import java.util.stream.Stream;

import com.axonivy.connector.graphql.security.SecuritySchemaInputStreamProvider;
import com.axonivy.connector.graphql.workflow.WorkflowSchemaInputStreamProvider;

public interface SchemaInputStreamProvider {

  InputStream schema();

  static Stream<SchemaInputStreamProvider> providers() {
    return Stream.of(new BaseSchemaInputStreamProvider(),
            new WorkflowSchemaInputStreamProvider(),
            new SecuritySchemaInputStreamProvider());
  }
}
