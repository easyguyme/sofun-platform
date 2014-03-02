/*
 * Copyright (c)  Sofun Gaming SAS.
 * Copyright (c)  Julien Anguenot <julien@anguenot.org>
 * Copyright (c)  Julien De Preaumont <juliendepreaumont@gmail.com>
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Julien Anguenot <julien@anguenot.org> - initial API and implementation
*/

package org.sofun.core.api.banking;

import org.sofun.core.api.PropertyResource;

/**
 * Loads ISO countries from a properties file.
 * 
 * @author <a href="mailto:julien@anguenot.org">Julien Anguenot</a>
 * 
 */
public final class ISOCountries extends PropertyResource {
    
    private static final String RESOURCE_NAME = "/iso-countries.properties";

    private static final ISOCountries instance = new ISOCountries();

    public static final ISOCountries getInstance() {
        return instance;
    }

    protected String getResourceName() {
        return RESOURCE_NAME;
    }

}
