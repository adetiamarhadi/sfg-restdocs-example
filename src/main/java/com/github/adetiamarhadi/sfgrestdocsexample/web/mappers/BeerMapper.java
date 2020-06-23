package com.github.adetiamarhadi.sfgrestdocsexample.web.mappers;

import com.github.adetiamarhadi.sfgrestdocsexample.domain.Beer;
import com.github.adetiamarhadi.sfgrestdocsexample.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
