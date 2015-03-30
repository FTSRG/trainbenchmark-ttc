package hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery.util;

import com.google.common.collect.Sets;
import hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery.SemaphoreNeighborMatch;
import hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery.SemaphoreNeighborMatcher;
import hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery.util.EntrySemaphoreQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate SemaphoreNeighborMatcher in a type-safe way.
 * 
 * @see SemaphoreNeighborMatcher
 * @see SemaphoreNeighborMatch
 * 
 */
@SuppressWarnings("all")
public final class SemaphoreNeighborQuerySpecification extends BaseGeneratedEMFQuerySpecification<SemaphoreNeighborMatcher> {
  private SemaphoreNeighborQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SemaphoreNeighborQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SemaphoreNeighborMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SemaphoreNeighborMatcher.on(engine);
  }
  
  @Override
  public SemaphoreNeighborMatch newEmptyMatch() {
    return SemaphoreNeighborMatch.newEmptyMatch();
  }
  
  @Override
  public SemaphoreNeighborMatch newMatch(final Object... parameters) {
    return SemaphoreNeighborMatch.newMatch((hu.bme.mit.trainbenchmark.ttc.railway.Semaphore) parameters[0], (hu.bme.mit.trainbenchmark.ttc.railway.Route) parameters[1], (hu.bme.mit.trainbenchmark.ttc.railway.Route) parameters[2], (hu.bme.mit.trainbenchmark.ttc.railway.Sensor) parameters[3], (hu.bme.mit.trainbenchmark.ttc.railway.Sensor) parameters[4], (hu.bme.mit.trainbenchmark.ttc.railway.TrackElement) parameters[5], (hu.bme.mit.trainbenchmark.ttc.railway.TrackElement) parameters[6]);
  }
  
  private static class LazyHolder {
    private final static SemaphoreNeighborQuerySpecification INSTANCE = make();
    
    public static SemaphoreNeighborQuerySpecification make() {
      return new SemaphoreNeighborQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SemaphoreNeighborQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery.semaphoreNeighbor";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("semaphore","route1","route2","sensor1","sensor2","te1","te2");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("semaphore", "hu.bme.mit.trainbenchmark.ttc.railway.Semaphore"),new PParameter("route1", "hu.bme.mit.trainbenchmark.ttc.railway.Route"),new PParameter("route2", "hu.bme.mit.trainbenchmark.ttc.railway.Route"),new PParameter("sensor1", "hu.bme.mit.trainbenchmark.ttc.railway.Sensor"),new PParameter("sensor2", "hu.bme.mit.trainbenchmark.ttc.railway.Sensor"),new PParameter("te1", "hu.bme.mit.trainbenchmark.ttc.railway.TrackElement"),new PParameter("te2", "hu.bme.mit.trainbenchmark.ttc.railway.TrackElement"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_semaphore = body.getOrCreateVariableByName("semaphore");
      	PVariable var_route1 = body.getOrCreateVariableByName("route1");
      	PVariable var_route2 = body.getOrCreateVariableByName("route2");
      	PVariable var_sensor1 = body.getOrCreateVariableByName("sensor1");
      	PVariable var_sensor2 = body.getOrCreateVariableByName("sensor2");
      	PVariable var_te1 = body.getOrCreateVariableByName("te1");
      	PVariable var_te2 = body.getOrCreateVariableByName("te2");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_semaphore, "semaphore"),
      				
      		new ExportedParameter(body, var_route1, "route1"),
      				
      		new ExportedParameter(body, var_route2, "route2"),
      				
      		new ExportedParameter(body, var_sensor1, "sensor1"),
      				
      		new ExportedParameter(body, var_sensor2, "sensor2"),
      				
      		new ExportedParameter(body, var_te1, "te1"),
      				
      		new ExportedParameter(body, var_te2, "te2")
      	));
      	new TypeBinary(body, CONTEXT, var_route1, var_semaphore, getFeatureLiteral("http://www.semanticweb.org/ontologies/2015/ttc/trainbenchmark", "Route", "exit"), "http://www.semanticweb.org/ontologies/2015/ttc/trainbenchmark/Route.exit");
      	new TypeBinary(body, CONTEXT, var_route1, var_sensor1, getFeatureLiteral("http://www.semanticweb.org/ontologies/2015/ttc/trainbenchmark", "Route", "definedBy"), "http://www.semanticweb.org/ontologies/2015/ttc/trainbenchmark/Route.definedBy");
      	new TypeBinary(body, CONTEXT, var_te1, var_sensor1, getFeatureLiteral("http://www.semanticweb.org/ontologies/2015/ttc/trainbenchmark", "TrackElement", "sensor"), "http://www.semanticweb.org/ontologies/2015/ttc/trainbenchmark/TrackElement.sensor");
      	new TypeBinary(body, CONTEXT, var_te1, var_te2, getFeatureLiteral("http://www.semanticweb.org/ontologies/2015/ttc/trainbenchmark", "TrackElement", "connectsTo"), "http://www.semanticweb.org/ontologies/2015/ttc/trainbenchmark/TrackElement.connectsTo");
      	new TypeBinary(body, CONTEXT, var_te2, var_sensor2, getFeatureLiteral("http://www.semanticweb.org/ontologies/2015/ttc/trainbenchmark", "TrackElement", "sensor"), "http://www.semanticweb.org/ontologies/2015/ttc/trainbenchmark/TrackElement.sensor");
      	new TypeBinary(body, CONTEXT, var_route2, var_sensor2, getFeatureLiteral("http://www.semanticweb.org/ontologies/2015/ttc/trainbenchmark", "Route", "definedBy"), "http://www.semanticweb.org/ontologies/2015/ttc/trainbenchmark/Route.definedBy");
      	new NegativePatternCall(body, new FlatTuple(var_route2, var_semaphore), EntrySemaphoreQuerySpecification.instance().getInternalQueryRepresentation());
      	new Inequality(body, var_route1, var_route2);
      	bodies.add(body);
      }
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
