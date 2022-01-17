package dto;

import domain.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper extends EntityMapper<UserDTO, UserEntity> {

    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    @Override
    @Mapping(source = "userId", target = "id")
    UserEntity toEntity(final UserDTO dto);

    @Override
    @Mapping(source = "id", target = "userId")
    UserDTO toDto(final UserEntity entity);
}
