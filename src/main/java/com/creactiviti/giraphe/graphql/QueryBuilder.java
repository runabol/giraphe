package com.creactiviti.giraphe.graphql;

import graphql.schema.GraphQLObjectType.Builder;;

/**
 * @author Arik Cohen
 * @since Dec 16, 2017
 */
public interface QueryBuilder {

  void build (Builder aBuilder);
  
}
