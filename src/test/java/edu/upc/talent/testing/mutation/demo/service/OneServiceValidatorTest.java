package edu.upc.talent.testing.mutation.demo.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;

public class OneServiceValidatorTest {
    @InjectMocks
    private OneServiceValidator serviceValidator;

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void fiftyReturnsTrue() {
        assertThat(serviceValidator.isValid(50)).isTrue();
    }


    @Test
    public void oneHundredOneReturnsFalse() {
        assertThat(serviceValidator.isValid(101)).isFalse();
    }

    @Test
    public void minusOneReturnsTrue() {
        assertThat(serviceValidator.isValid(-1)).isFalse();
    }


    @Test
    public void oneHundredReturnsTrue() {
        assertThat(serviceValidator.isValid(100)).isTrue();
    }

    @Test
    public void zeroReturnsFalse() {
        assertThat(serviceValidator.isValid(0)).isFalse();
    }
}

