package com.axonivy.connector.graphql;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import com.axonivy.connector.graphql.security.SecurityMutationTypeWiringProvider;
import com.axonivy.connector.graphql.security.SecurityQueryTypeWiringProvider;
import com.axonivy.connector.graphql.workflow.WorkflowCaseTypeWiringProvider;
import com.axonivy.connector.graphql.workflow.WorkflowQueryTypeWiringProvider;

import graphql.schema.idl.TypeRuntimeWiring.Builder;

public interface TypeWiringProvider {

  default String typeName() {
    return "Query";
  }

  UnaryOperator<Builder> wiring();

  static Stream<TypeWiringProvider> providers() {
    return Stream.of(new WorkflowQueryTypeWiringProvider(),
            new WorkflowCaseTypeWiringProvider(),
            new SecurityQueryTypeWiringProvider(),
            new SecurityMutationTypeWiringProvider());
  }
}
