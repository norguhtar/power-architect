/*
 * Copyright (c) 2010, SQL Power Group Inc.
 *
 * This file is part of Power*Architect.
 *
 * Power*Architect is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * Power*Architect is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>. 
 */

package ca.sqlpower.architect.swingui.olap;

import ca.sqlpower.architect.olap.MondrianModel.Dimension;
import ca.sqlpower.object.SPObject;

public class TestDimensionPane extends TestOLAPComponent {

    public TestDimensionPane(String name) {
        super(name);
    }
    
    public void setUp() throws Exception {
        super.setUp();
        Dimension dimension = new Dimension();
        schema.addDimension(dimension);
        olapComponent = new DimensionPane(dimension, contentPane);
        contentPane.addChild(olapComponent, 0);
    }
    
    @Override
    protected Class<? extends SPObject> getChildClassType() {
        return DimensionPane.class;
    }

}
