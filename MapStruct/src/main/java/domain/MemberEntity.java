package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemberEntity {

    private Long id;
    private String name;
    private int age;
}
