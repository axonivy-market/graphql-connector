package com.axonivy.demo.graphql.resource;

import jakarta.annotation.security.PermitAll;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import com.axonivy.demo.graphql.runtime.GraphQLExecutor;

@Path("graphql")
public class GraphQLResource {

  @POST
  @PermitAll
  public String qraphql(String body) {
    return GraphQLExecutor.run(body);
  }
}
