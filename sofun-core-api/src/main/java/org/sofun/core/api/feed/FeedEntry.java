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

package org.sofun.core.api.feed;

import java.io.Serializable;
import java.util.Date;

import org.sofun.core.api.member.Member;

/**
 * 
 * @author <a href="mailto:julien@anguenot.org">Julien Anguenot</a>
 * 
 */
public interface FeedEntry extends Comparable<FeedEntry>, Serializable {

    long getId();

    void setId(long id);

    Member getMember();

    void setMember(Member member);

    Date getDate();

    void setDate(Date date);

    String getContent();

    void setContent(String content);

    Feed getFeed();

    void setFeed(Feed feed);

}
