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

package org.sofun.core.api.kup;

/**
 * Kup type.
 * 
 * @author <a href="mailto:julien@anguenot.org">Julien Anguenot</a>
 */
public final class KupType {

    /**
     * Kup open to all types of accounts. No gambling here.
     */
    public static final String FREE = "FREE";

    /**
     * Kup in compliance with French regulations regarding gambling.
     */
    public static final String GAMBLING_FR = "GAMBLING_FR";

}
