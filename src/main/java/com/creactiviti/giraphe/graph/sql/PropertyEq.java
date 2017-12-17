package com.creactiviti.giraphe.graph.sql;

public class PropertyEq implements SelectClause {

  @Override
  public void apply(SelectBuilder aSelectBuilder) {
    aSelectBuilder.where("properties->? = ?");
  }

}
