package domain;

import static org.assertj.core.api.Assertions.assertThat;

import dto.TeamDTO;
import dto.TeamMapper;
import org.junit.jupiter.api.Test;

class TeamEntityTest {

    @Test
    void toEntityTest() {

        //given
        TeamDTO teamDTO = new TeamDTO("team1", "red");

        //when
        TeamEntity teamEntity = TeamMapper.MAPPER.toEntity(teamDTO);

        //then
        assertThat(teamDTO).usingRecursiveComparison().isEqualTo(teamEntity);
    }
}