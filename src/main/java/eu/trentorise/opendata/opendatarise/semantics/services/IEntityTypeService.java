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

package eu.trentorise.opendata.opendatarise.semantics.services;

import eu.trentorise.opendata.opendatarise.semantics.model.entity.IAttributeDef;
import eu.trentorise.opendata.opendatarise.semantics.model.entity.IEntityType;
import eu.trentorise.opendata.opendatarise.semantics.model.entity.IUniqueIndex;
import java.util.List;

/**
 * Entity type services allow reading and modifying entity types
 *
 * @author Juan Pane <pane@disi.unitn.it>
 * @author Moaz Reyad <reyad@disi.unitn.it>
 * @date Jul 24, 2013
 */
public interface IEntityTypeService {

    /**
     * Reads all entity types available in the system
     *
     * @return list of all entity types in the system
     */
    List<IEntityType> getAllEntityTypes();

    /**
     * Adds an attribute definition to an entity type
     *
     * @param entityType the entity type that will own the attribute definition
     * @param attrDef the attribute definition to be added
     */
    void addAttributeDefToEtype(IEntityType entityType, IAttributeDef attrDef);

    /**
     * Adds a unique index to an entity type
     *
     * @param entityType the entity type that will own the matching set
     * @param uniqueIndex the unique index to be added
     */
    void addUniqueIndexToEtype(IEntityType entityType, IUniqueIndex uniqueIndex);
}
