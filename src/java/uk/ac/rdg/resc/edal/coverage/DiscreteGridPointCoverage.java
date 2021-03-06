/*
 * Copyright (c) 2010 The University of Reading
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. Neither the name of the University of Reading, nor the names of the
 *    authors or contributors may be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package uk.ac.rdg.resc.edal.coverage;

import org.opengis.coverage.grid.GridCoordinates;
import org.opengis.referencing.crs.CoordinateReferenceSystem;
import uk.ac.rdg.resc.edal.coverage.domain.GridSeriesDomain;
import uk.ac.rdg.resc.edal.coverage.grid.HorizontalGrid;
import uk.ac.rdg.resc.edal.coverage.grid.ReferenceableAxis;

/**
 * @todo I guess we don't need a GridValuesMatrix class?  Maybe we only need the
 * high-level methods in this class for extracting different coverage types?  The
 * referencing is taken care of by the GridSeriesDomain.
 * @author Jon
 */
public interface DiscreteGridPointCoverage extends DiscreteCoverage<GridCoordinates> {

    /**
     * Returns the domain of this coverage, which is modelled as a composition
     * of a {@link HorizontalGrid}, plus {@link ReferenceableAxis ReferenceableAxes}
     * for the vertical and temporal dimensions.
     * @return the domain of this coverage.
     */
    @Override
    public GridSeriesDomain getDomain();

    /** getValues() will re-use the GridValueMatrix's getValues() method */

    /**
     * Returns the {@link CoordinateReferenceSystem} to which the points in the
     * {@link #getDomain() grid} can be referenced.  This must match the domain's
     * own {@link GridSeriesDomain#getCoordinateReferenceSystem() coordinate reference
     * system}.
     * @return the {@link CoordinateReferenceSystem} to which the points in the
     * {@link #getDomain() grid} can be referenced.
     */
    @Override
    public CoordinateReferenceSystem getCoordinateReferenceSystem();

}
