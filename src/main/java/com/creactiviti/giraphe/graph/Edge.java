package com.creactiviti.giraphe.graph;

/**
 * Represents a link between two {@link Node}s.
 * 
 * @author Arik Cohen
 * @since Dec 16, 2017
 */
public interface Edge extends Element {

  Node from ();
  
  Node to ();
  
}
