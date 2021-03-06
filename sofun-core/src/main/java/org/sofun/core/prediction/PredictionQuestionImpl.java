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

package org.sofun.core.prediction;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.sofun.core.api.prediction.PredictionQuestion;
import org.sofun.core.api.question.Question;
import org.sofun.core.question.QuestionImpl;

/**
 * @author <a href="mailto:julien@anguenot.org">Julien Anguenot</a>
 * 
 */
@Entity
@Table(name = "predictions_questions")
@Inheritance(strategy = InheritanceType.JOINED)
public class PredictionQuestionImpl extends PredictionImpl implements PredictionQuestion {

    private static final long serialVersionUID = -5224618725594749308L;

    @ManyToOne(targetEntity = QuestionImpl.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "question_id")
    protected Question question;

    @Column(name = "answer")
    protected String answer;

    @Override
    public Question getQuestion() {
        return question;
    }

    @Override
    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String getAnswer() {
        return answer;
    }

    @Override
    public void setAswer(String answer) {
        this.answer = answer;
    }

}
