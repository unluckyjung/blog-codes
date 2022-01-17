package com.example.playground.domain;

import com.example.playground.repository.MemberRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;

import javax.validation.ConstraintViolationException;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Java6Assertions.assertThatThrownBy;

@SpringBootTest
class MemberTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    void nameTest() {
        Member member = new Member("jys");
        Member savedMember = memberRepository.save(member);
        assertThat(member.getName()).isEqualTo(savedMember.getName());
    }

    @DisplayName("@NotNull")
    @Test
    void nameNullTest() {
        assertThatThrownBy(() -> {
            Member member = new Member(null);
            Member savedMember = memberRepository.save(member);
        }).isExactlyInstanceOf(ConstraintViolationException.class);
    }

    @Disabled
    @DisplayName("Column nullable = false")
    @Test
    void nameNullTest2() {
        assertThatThrownBy(() -> {
            Member member = new Member(null);
            Member savedMember = memberRepository.save(member);
        }).isExactlyInstanceOf(DataIntegrityViolationException.class);
    }
}
