package com.creactiviti.giraphe.graph.sql;

public class EdgeTypeEq implements SelectClause {

  @Override
  public void apply(SelectBuilder aSelectBuilder) {
    aSelectBuilder.where("edge_type = ?");
  }

}
