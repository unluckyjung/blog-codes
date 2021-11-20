package domain;

import static org.assertj.core.api.Assertions.assertThat;

import dto.UserDTO;
import dto.UserMapper;
import org.junit.jupiter.api.Test;

class UserEntityTest {

    @Test
    void toEntityTest() {

        //given
        UserDTO userDTO = new UserDTO(777L);

        //when
        UserEntity userEntity = UserMapper.MAPPER.toEntity(userDTO);

        //then
        assertThat(userEntity.getId()).isEqualTo(userDTO.getUserId());
    }
}