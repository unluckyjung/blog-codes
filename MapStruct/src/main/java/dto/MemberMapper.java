package dto;

import domain.MemberEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MemberMapper extends EntityMapper<MemberDTO, MemberEntity> {

    MemberMapper MAPPER = Mappers.getMapper(MemberMapper.class);

    @Override
    @Mapping(target = "id", constant = "777L")
    MemberEntity toEntity(final MemberDTO dto);
}
