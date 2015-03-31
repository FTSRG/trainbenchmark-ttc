package hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery.util;

import hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery.EntrySemaphoreMatch;
import hu.bme.mit.trainbenchmark.ttc.railway.Route;
import hu.bme.mit.trainbenchmark.ttc.railway.Semaphore;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.trainbenchmark.ttc.benchmark.emfincquery.entrySemaphore pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class EntrySemaphoreProcessor implements IMatchProcessor<EntrySemaphoreMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRoute the value of pattern parameter route in the currently processed match
   * @param pSemaphore the value of pattern parameter semaphore in the currently processed match
   * 
   */
  public abstract void process(final Route pRoute, final Semaphore pSemaphore);
  
  @Override
  public void process(final EntrySemaphoreMatch match) {
    process(match.getRoute(), match.getSemaphore());
  }
}
