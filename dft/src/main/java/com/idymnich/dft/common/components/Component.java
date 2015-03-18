package com.idymnich.dft.common.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The class
 *
 * @author: IDymnich
 * @date: 3/18/2015 5:51 PM
 */
public abstract class Component {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public Logger getLogger() {
        return logger;
    }
}
