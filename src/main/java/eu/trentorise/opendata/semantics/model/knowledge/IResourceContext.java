/**
 * *****************************************************************************
 * Copyright 2012-2013 Trento Rise (www.trentorise.eu/)
 *
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the GNU Lesser General Public License (LGPL)
 * version 2.1 which accompanies this distribution, and is available at
 *
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 *******************************************************************************
 */
package eu.trentorise.opendata.semantics.model.knowledge;

/**
 * The context of a resource coming from a catalog such as i.e. Ckan.
 * 
 * @author David Leoni <david.leoni@unitn.it>
 */
public interface IResourceContext {

    /**
     * Gets the name of the resource as found in the catalog.
     * @return the name of the resource
     */
    String getResourceName();
    
    /**
     * Gets the resource filename. Notice sometimes it can be meaningless, like 'g83_f3.dat' 
     * @return the resource filename
     */
    String getResourceFilename();
    
    /**
     * Gets the name of the dataset which contains the resource.
     * @return the dataset name
     */
    String getDatasetName();
    
}
