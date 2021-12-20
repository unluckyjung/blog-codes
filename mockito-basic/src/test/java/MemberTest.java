import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

class MemberTest {

    @Mock
    private Member member;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void test1() {
        given(member.getId()).willReturn(10);
        assertThat(member.getId()).isEqualTo(10);
    }
}

@ExtendWith(MockitoExtension.class)
class MemberTest2 {

    @Mock
    private Member member;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void test1() {
        given(member.getId()).willReturn(10);
        assertThat(member.getId()).isEqualTo(10);
    }
}

