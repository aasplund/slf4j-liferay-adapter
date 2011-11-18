/**
 * Copyright 2010 Västra Götalandsregionen
 *
 *   This library is free software; you can redistribute it and/or modify
 *   it under the terms of version 2.1 of the GNU Lesser General Public
 *   License as published by the Free Software Foundation.
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the
 *   Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 *   Boston, MA 02111-1307  USA
 *
 */

/**
 * 
 */
package org.slf4j.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * @author anders
 *
 */
public class LiferayLoggerFactory implements ILoggerFactory {
    Map<String, Logger> loggerMap;

    public LiferayLoggerFactory() {
        loggerMap = new HashMap<String, Logger>();
    }

    @Override
    public Logger getLogger(String name) {
        Logger slf4jLogger = null;
        synchronized (this) {
            slf4jLogger = loggerMap.get(name);
            if(slf4jLogger == null)
            {
                Log liferayLogger = LogFactoryUtil.getLog(name);
                slf4jLogger = new LiferayLoggerAdapter(liferayLogger);
                loggerMap.put(name, slf4jLogger);
            }
        }
        return slf4jLogger;
    }

}
