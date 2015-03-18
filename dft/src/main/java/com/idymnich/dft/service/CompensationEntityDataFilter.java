package com.idymnich.dft.service;

import java.util.Collection;
import java.util.Set;

import com.idymnich.dft.common.components.Component;
import com.idymnich.dft.common.entities.CompensationDataEntity;

/**
 * The class
 *
 * @author: IDymnich
 * @date: 3/18/2015 5:41 PM
 */
public class CompensationEntityDataFilter extends Component implements FilterService<Collection<CompensationDataEntity>> {

    @Override
    public Collection<CompensationDataEntity> filter(Collection<CompensationDataEntity> input) {
        getLogger().debug("filter has been called with input: {}", input);
        Set<CompensationDataEntity> result =
    }
}
