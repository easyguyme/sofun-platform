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

package org.sofun.platform.web.rest.api.bet.results;

import java.util.List;

import org.sofun.platform.web.rest.api.tournament.ReSTTournamentGame;

/**
 * @author <a href="mailto:julien@anguenot.org">Julien Anguenot</a>
 * 
 */
public interface ReSTTournamentGameResult extends ReSTTournamentGame {

    List<Integer> getPronostic();

    void setPronostic(List<Integer> pronostic);

    int getPoints();

    void setPoints(int points);

    double getCommunitySuccesPercentage();

    void setCommunitySuccesPercentage(double communitySuccesPercentage);

}
