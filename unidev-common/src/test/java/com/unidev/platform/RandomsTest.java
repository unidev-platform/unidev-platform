package com.unidev.platform;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.Random;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RandomsTest {

    private Randoms randoms;

    @BeforeEach
    void init() {
        randoms = new Randoms(new Random());
    }

    @Test
    void testOneElementSelection() {
        String value = randoms.randomValue(Arrays.asList("potato"));
        assertThat(value).isNotNull();
        assertThat(value).isEqualTo("potato");

    }

}