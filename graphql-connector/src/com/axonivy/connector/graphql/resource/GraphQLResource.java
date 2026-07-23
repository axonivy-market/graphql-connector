package com.axonivy.connector.graphql.resource;

import javax.annotation.security.PermitAll;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.axonivy.connector.graphql.runtime.GraphQLExecutor;

@Path("graphql")
public class GraphQLResource {

  @POST
  @PermitAll
  public String qraphql(String body) {
    return GraphQLExecutor.run(body);
  }
}
