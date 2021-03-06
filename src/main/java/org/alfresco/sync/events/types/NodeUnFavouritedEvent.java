/*
 * #%L
 * Alfresco Repository
 * %%
 * Copyright (C) 2005 - 2018 Alfresco Software Limited
 * %%
 * This file is part of the Alfresco software.
 * If the software was purchased under a paid Alfresco license, the terms of
 * the paid license agreement will prevail.  Otherwise, the software is
 * provided under the following open source license terms:
 *
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */
package org.alfresco.sync.events.types;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.alfresco.sync.repo.Client;

/**
 * Node un-favourited event.
 * 
 * @author steveglover
 *
 */
public class NodeUnFavouritedEvent extends NodeEvent
{
    private static final long serialVersionUID = -4692768819566246958L;

    public static final String EVENT_TYPE = "NODEUNFAVOURITED";

    public NodeUnFavouritedEvent()
    {
    }

    public NodeUnFavouritedEvent(long seqNumber, String name, String txnId, long time, String networkId, String siteId, String nodeId,
            String nodeType, List<String> paths, List<List<String>> pathNodeIds, String userId, Long modificationTime,
            Client client, Set<String> aspects, Map<String, Serializable> properties)
    {
        super(seqNumber, name, EVENT_TYPE, txnId, time, networkId, siteId, nodeId, nodeType, paths, pathNodeIds, userId,
                modificationTime, client, aspects, properties);
    }
}
