package reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.assertj.core.api.Assertions.assertThat;

class FinalChangeTest {
    @Test
    void test() {
        UserName userName = new UserName("jys");

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
