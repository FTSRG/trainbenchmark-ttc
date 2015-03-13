/*******************************************************************************
 * Copyright (c) 2010-2014, Benedek Izso, Gabor Szarnyas, Istvan Rath and Daniel Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Benedek Izso - initial API and implementation
 *   Gabor Szarnyas - initial API and implementation
 *******************************************************************************/

package hu.bme.mit.trainbenchmark.ttc.benchmark.java.benchmarkcases;

import hu.bme.mit.trainbenchmark.ttc.emf.transformation.SwitchSensorTransformation;
import hu.bme.mit.trainbenchmark.ttc.railway.Switch;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class SwitchSensor extends JavaBenchmarkCase<Switch> {

	@Override
	protected Collection<Switch> check() {
		results = new ArrayList<>();

		final TreeIterator<EObject> contents = container.eAllContents();	
		while (contents.hasNext()) {
			final EObject eObject = contents.next();

			if (eObject instanceof Switch) {
				final Switch sw = (Switch) eObject;
				if (sw.getSensor() == null) {
					results.add(sw);
				}
			}
		}

		return results;
	}

	@Override
	protected void modify(final Collection<Switch> vertices, final long nElementsToModify) {
		final SwitchSensorTransformation transformation = new SwitchSensorTransformation();
		transformation.transform(vertices, nElementsToModify);
	}
	
}
