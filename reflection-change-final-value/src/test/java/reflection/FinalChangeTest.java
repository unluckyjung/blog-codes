package reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.assertj.core.api.Assertions.assertThat;

class FinalChangeTest {
    @Test
    void test() {

        // 초기 userName의 value값을 런타임에 "jys" 로 설정
         UserName userName = new UserName("jys");

        // UserName userName = new UserName();

        try {
            Class clazz = UserName.class;
            Field field = clazz.getDeclaredField("value");
            field.setAccessible(true);

            // jys -> unluckyjung으로 변경
            field.set(userName, "unluckyjung");

            assertThat(userName.getValue()).isEqualTo("unluckyjung");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class UserName {
    private final String value;

    UserName(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

//class UserName {
//
//    // 인스턴스 변수를 미리 "jys"로 설정
//    private final String value = "jys";
//
//    public String getValue() {
//        return value;
//    }
//}

