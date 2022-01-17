package domain;

import static org.assertj.core.api.Assertions.assertThat;

import dto.MemberDTO;
import dto.MemberMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MemberEntityTest {

    @DisplayName("id값없이 DTO를 가지고 Entity를 만들면, id는 777로 Entity가 만들어진다.")
    @Test
    void toEntityTest() {
        //given
        MemberDTO memberDTO = new MemberDTO("yoonsung", 29);

        //when
        MemberEntity memberEntity = MemberMapper.MAPPER.toEntity(memberDTO);

        //then
        MemberEntity expectedEntity = new MemberEntity(777L, "yoonsung", 29);
        assertThat(memberEntity).usingRecursiveComparison().isEqualTo(expectedEntity);
    }


    @Test
    void toDtoTest() {
        //given
        MemberEntity memberEntity = new MemberEntity(1L, "yoonsung", 30);

        //when
        MemberDTO memberDTO = MemberMapper.MAPPER.toDto(memberEntity);

        //then
        MemberDTO expectedDTO = new MemberDTO("yoonsung", 30);
        assertThat(memberDTO).usingRecursiveComparison().isEqualTo(expectedDTO);
    }
}