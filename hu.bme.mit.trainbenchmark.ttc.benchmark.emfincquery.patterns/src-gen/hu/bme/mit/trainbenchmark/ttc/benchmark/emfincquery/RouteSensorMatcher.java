package hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery;

import hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery.RouteSensorMatch;
import hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery.util.RouteSensorQuerySpecification;
import hu.bme.mit.trainbenchmark.ttc.railway.Route;
import hu.bme.mit.trainbenchmark.ttc.railway.Sensor;
import hu.bme.mit.trainbenchmark.ttc.railway.Switch;
import hu.bme.mit.trainbenchmark.ttc.railway.SwitchPosition;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery.routeSensor pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link RouteSensorMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern routeSensor(route, sensor, switchPosition, sw)
 * {
 * 	Route.follows(route, switchPosition);
 * 	SwitchPosition.^switch(switchPosition, sw);
 * 	TrackElement.sensor(sw, sensor);
 * 	
 * 	neg find inverseRouteDefinition(sensor, route);	
 * }
 * </pre></code>
 * 
 * @see RouteSensorMatch
 * @see RouteSensorProcessor
 * @see RouteSensorQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class RouteSensorMatcher extends BaseMatcher<RouteSensorMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static RouteSensorMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    RouteSensorMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new RouteSensorMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_ROUTE = 0;
  
  private final static int POSITION_SENSOR = 1;
  
  private final static int POSITION_SWITCHPOSITION = 2;
  
  private final static int POSITION_SW = 3;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(RouteSensorMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public RouteSensorMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public RouteSensorMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRoute the fixed value of pattern parameter route, or null if not bound.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pSwitchPosition the fixed value of pattern parameter switchPosition, or null if not bound.
   * @param pSw the fixed value of pattern parameter sw, or null if not bound.
   * @return matches represented as a RouteSensorMatch object.
   * 
   */
  public Collection<RouteSensorMatch> getAllMatches(final Route pRoute, final Sensor pSensor, final SwitchPosition pSwitchPosition, final Switch pSw) {
    return rawGetAllMatches(new Object[]{pRoute, pSensor, pSwitchPosition, pSw});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRoute the fixed value of pattern parameter route, or null if not bound.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pSwitchPosition the fixed value of pattern parameter switchPosition, or null if not bound.
   * @param pSw the fixed value of pattern parameter sw, or null if not bound.
   * @return a match represented as a RouteSensorMatch object, or null if no match is found.
   * 
   */
  public RouteSensorMatch getOneArbitraryMatch(final Route pRoute, final Sensor pSensor, final SwitchPosition pSwitchPosition, final Switch pSw) {
    return rawGetOneArbitraryMatch(new Object[]{pRoute, pSensor, pSwitchPosition, pSw});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRoute the fixed value of pattern parameter route, or null if not bound.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pSwitchPosition the fixed value of pattern parameter switchPosition, or null if not bound.
   * @param pSw the fixed value of pattern parameter sw, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Route pRoute, final Sensor pSensor, final SwitchPosition pSwitchPosition, final Switch pSw) {
    return rawHasMatch(new Object[]{pRoute, pSensor, pSwitchPosition, pSw});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRoute the fixed value of pattern parameter route, or null if not bound.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pSwitchPosition the fixed value of pattern parameter switchPosition, or null if not bound.
   * @param pSw the fixed value of pattern parameter sw, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Route pRoute, final Sensor pSensor, final SwitchPosition pSwitchPosition, final Switch pSw) {
    return rawCountMatches(new Object[]{pRoute, pSensor, pSwitchPosition, pSw});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRoute the fixed value of pattern parameter route, or null if not bound.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pSwitchPosition the fixed value of pattern parameter switchPosition, or null if not bound.
   * @param pSw the fixed value of pattern parameter sw, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Route pRoute, final Sensor pSensor, final SwitchPosition pSwitchPosition, final Switch pSw, final IMatchProcessor<? super RouteSensorMatch> processor) {
    rawForEachMatch(new Object[]{pRoute, pSensor, pSwitchPosition, pSw}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRoute the fixed value of pattern parameter route, or null if not bound.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pSwitchPosition the fixed value of pattern parameter switchPosition, or null if not bound.
   * @param pSw the fixed value of pattern parameter sw, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Route pRoute, final Sensor pSensor, final SwitchPosition pSwitchPosition, final Switch pSw, final IMatchProcessor<? super RouteSensorMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRoute, pSensor, pSwitchPosition, pSw}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRoute the fixed value of pattern parameter route, or null if not bound.
   * @param pSensor the fixed value of pattern parameter sensor, or null if not bound.
   * @param pSwitchPosition the fixed value of pattern parameter switchPosition, or null if not bound.
   * @param pSw the fixed value of pattern parameter sw, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public RouteSensorMatch newMatch(final Route pRoute, final Sensor pSensor, final SwitchPosition pSwitchPosition, final Switch pSw) {
    return RouteSensorMatch.newMatch(pRoute, pSensor, pSwitchPosition, pSw);
  }
  
  /**
   * Retrieve the set of values that occur in matches for route.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Route> rawAccumulateAllValuesOfroute(final Object[] parameters) {
    Set<Route> results = new HashSet<Route>();
    rawAccumulateAllValues(POSITION_ROUTE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for route.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Route> getAllValuesOfroute() {
    return rawAccumulateAllValuesOfroute(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for route.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Route> getAllValuesOfroute(final RouteSensorMatch partialMatch) {
    return rawAccumulateAllValuesOfroute(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for route.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Route> getAllValuesOfroute(final Sensor pSensor, final SwitchPosition pSwitchPosition, final Switch pSw) {
    return rawAccumulateAllValuesOfroute(new Object[]{
    null, 
    pSensor, 
    pSwitchPosition, 
    pSw
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for sensor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Sensor> rawAccumulateAllValuesOfsensor(final Object[] parameters) {
    Set<Sensor> results = new HashSet<Sensor>();
    rawAccumulateAllValues(POSITION_SENSOR, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for sensor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Sensor> getAllValuesOfsensor() {
    return rawAccumulateAllValuesOfsensor(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sensor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Sensor> getAllValuesOfsensor(final RouteSensorMatch partialMatch) {
    return rawAccumulateAllValuesOfsensor(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sensor.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Sensor> getAllValuesOfsensor(final Route pRoute, final SwitchPosition pSwitchPosition, final Switch pSw) {
    return rawAccumulateAllValuesOfsensor(new Object[]{
    pRoute, 
    null, 
    pSwitchPosition, 
    pSw
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for switchPosition.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<SwitchPosition> rawAccumulateAllValuesOfswitchPosition(final Object[] parameters) {
    Set<SwitchPosition> results = new HashSet<SwitchPosition>();
    rawAccumulateAllValues(POSITION_SWITCHPOSITION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for switchPosition.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SwitchPosition> getAllValuesOfswitchPosition() {
    return rawAccumulateAllValuesOfswitchPosition(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for switchPosition.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SwitchPosition> getAllValuesOfswitchPosition(final RouteSensorMatch partialMatch) {
    return rawAccumulateAllValuesOfswitchPosition(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for switchPosition.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<SwitchPosition> getAllValuesOfswitchPosition(final Route pRoute, final Sensor pSensor, final Switch pSw) {
    return rawAccumulateAllValuesOfswitchPosition(new Object[]{
    pRoute, 
    pSensor, 
    null, 
    pSw
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for sw.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Switch> rawAccumulateAllValuesOfsw(final Object[] parameters) {
    Set<Switch> results = new HashSet<Switch>();
    rawAccumulateAllValues(POSITION_SW, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for sw.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Switch> getAllValuesOfsw() {
    return rawAccumulateAllValuesOfsw(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sw.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Switch> getAllValuesOfsw(final RouteSensorMatch partialMatch) {
    return rawAccumulateAllValuesOfsw(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for sw.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Switch> getAllValuesOfsw(final Route pRoute, final Sensor pSensor, final SwitchPosition pSwitchPosition) {
    return rawAccumulateAllValuesOfsw(new Object[]{
    pRoute, 
    pSensor, 
    pSwitchPosition, 
    null
    });
  }
  
  @Override
  protected RouteSensorMatch tupleToMatch(final Tuple t) {
    try {
    	return RouteSensorMatch.newMatch((hu.bme.mit.trainbenchmark.ttc.railway.Route) t.get(POSITION_ROUTE), (hu.bme.mit.trainbenchmark.ttc.railway.Sensor) t.get(POSITION_SENSOR), (hu.bme.mit.trainbenchmark.ttc.railway.SwitchPosition) t.get(POSITION_SWITCHPOSITION), (hu.bme.mit.trainbenchmark.ttc.railway.Switch) t.get(POSITION_SW));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RouteSensorMatch arrayToMatch(final Object[] match) {
    try {
    	return RouteSensorMatch.newMatch((hu.bme.mit.trainbenchmark.ttc.railway.Route) match[POSITION_ROUTE], (hu.bme.mit.trainbenchmark.ttc.railway.Sensor) match[POSITION_SENSOR], (hu.bme.mit.trainbenchmark.ttc.railway.SwitchPosition) match[POSITION_SWITCHPOSITION], (hu.bme.mit.trainbenchmark.ttc.railway.Switch) match[POSITION_SW]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected RouteSensorMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return RouteSensorMatch.newMutableMatch((hu.bme.mit.trainbenchmark.ttc.railway.Route) match[POSITION_ROUTE], (hu.bme.mit.trainbenchmark.ttc.railway.Sensor) match[POSITION_SENSOR], (hu.bme.mit.trainbenchmark.ttc.railway.SwitchPosition) match[POSITION_SWITCHPOSITION], (hu.bme.mit.trainbenchmark.ttc.railway.Switch) match[POSITION_SW]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<RouteSensorMatcher> querySpecification() throws IncQueryException {
    return RouteSensorQuerySpecification.instance();
  }
}
