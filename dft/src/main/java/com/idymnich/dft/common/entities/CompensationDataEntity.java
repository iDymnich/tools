package com.idymnich.dft.common.entities;

import com.google.common.base.MoreObjects;

/**
 * The class
 *
 * @author: IDymnich
 * @date: 3/18/2015 5:02 PM
 */
public class CompensationDataEntity {
    public long userId;
    public int levelDelta;
    public long balanceDelta;


    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("userId", userId)
                .add("levelDelta", levelDelta)
                .add("balanceDelta", balanceDelta)
                .toString();
    }
}
