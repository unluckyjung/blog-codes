package utils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.MockedStatic;

class RandomsTest {

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 1})
    @DisplayName("원하는 Random값이 나오면, 테스트를 통과한다.")
    void randomSetsTest(final int expectValue) {
        MockedStatic<Randoms> randoms = mockStatic(Randoms.class);
        given(Randoms.nextInt(1, 2)).willReturn(expectValue);
        assertThat(Randoms.nextInt(1, 2)).isEqualTo(expectValue);

        randoms.close();
    }
}
