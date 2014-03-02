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

package org.sofun.core.prediction.tournament.contestant;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.sofun.core.api.prediction.tournament.contestant.PredictionSeasonOrderedContestantsList;
import org.sofun.core.api.sport.tournament.TournamentSeason;
import org.sofun.core.prediction.contestant.PredictionOrderedContestantsListImpl;
import org.sofun.core.sport.tournament.TournamentSeasonImpl;

/**
 * 
 * @author <a href="mailto:julien@anguenot.org">Julien Anguenot</a>
 * 
 */
@Entity
@Table(name = "predictions_ordered_contestants_seasons")
@Inheritance(strategy = InheritanceType.JOINED)
public class PredictionSeasonOrderedContestantsListImpl extends PredictionOrderedContestantsListImpl implements
        PredictionSeasonOrderedContestantsList {

    private static final long serialVersionUID = 835025690988919144L;

    @ManyToOne(targetEntity = TournamentSeasonImpl.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "season_id")
    protected TournamentSeason season;

    @Override
    public TournamentSeason getTournamentSeason() {
        return season;
    }

    @Override
    public void setTournamentSeason(TournamentSeason season) {
        this.season = season;
    }

}
