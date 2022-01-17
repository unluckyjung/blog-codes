package dto;

import domain.TeamEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TeamMapper extends EntityMapper<TeamDTO, TeamEntity> {

    TeamMapper MAPPER = Mappers.getMapper(TeamMapper.class);
}

