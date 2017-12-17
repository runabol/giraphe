package com.creactiviti.giraphe.graph;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.creactiviti.giraphe.graph.Edge;
import com.creactiviti.giraphe.graph.Graph;
import com.creactiviti.giraphe.graph.Node;
import com.creactiviti.giraphe.graph.SimpleEdge;
import com.creactiviti.giraphe.graph.SimpleNode;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SqlGraphTests {
  
  @Autowired private Graph g;

	@Test
	public void test1 () {
	  
    // building a Movie node instance
    Node movie = SimpleNode.builder(g)
                           .type("Movie")
                           .property("title", "Terminator")
                           .build();
                        
    // adding the movie to the Graph
    movie = g.add(movie);
    
    // building a director node instance
    Node director = SimpleNode.builder(g)
                              .type("Director")
                              .property("name", "James Cameron")
                              .build();
                        
    // adding the director to the graph.
    director = g.add(director);
    
    // creating a "directed" link between the director
    // and the movie
    Edge directed = SimpleEdge.builder(g)
                              .fromNodeId(director.id())
                              .type("directed")
                              .toNodeId(movie.id())
                              .build();
    
    directed = g.add(directed);
    
    Assert.assertEquals(movie.id(), directed.to().id());
    Assert.assertEquals(director.id(), directed.from().id());
    
    Node directedMovie = director.to("directed").next();
    
    Assert.assertEquals(movie.id(), directedMovie.id());
    
	}
	

}
