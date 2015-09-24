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

package hu.bme.mit.trainbenchmark.ttc.benchmark.java.matches;

import java.util.Comparator;

import hu.bme.mit.trainbenchmark.ttc.railway.RailwayElement;

public class JavaMatchComparator implements Comparator<Object> {

	@Override
	public int compare(final Object o1, final Object o2) {
		final RailwayElement[] m1 = ((JavaMatch) o1).match;
		final RailwayElement[] m2 = ((JavaMatch) o2).match;
		for (int i = 0; i < m1.length; i++) {
			final RailwayElement t1 = m1[i];
			final RailwayElement t2 = m2[i];

			final int comparison = t1.getId2() - t2.getId2();
			if (comparison != 0) {
				return comparison;
			}
		}

		return 0;
	}

}
