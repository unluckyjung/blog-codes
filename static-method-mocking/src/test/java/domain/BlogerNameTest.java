package domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import other.OtherClass;

class BlogerNameTest {

    @DisplayName("unluckyJung이 아니라, JungYoonsung이 나오면, 테스트를 통과한다.")
    @Test
    void blogerNameTest() {
        // 모킹전
        assertThat(OtherClass.getUserName()).isEqualTo("unluckyJung");

        try (MockedStatic<BlogerName> blogerName = mockStatic(BlogerName.class)) {
            given(BlogerName.getName()).willReturn("JungYoonsung");
            assertThat(OtherClass.getUserName()).isEqualTo("JungYoonsung");
        }
    }
}
