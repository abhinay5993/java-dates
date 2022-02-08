package com.serenitydojo.exceptions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static com.serenitydojo.exceptions.DataSetup.loadTestData;
import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithExceptions {

    @Before
    public void setupTestData() {
        loadTestData();
    }

    @Test
    public void basicExceptions() {
        int a = 1;
        int b = 2;
        assertThat(a + b).isEqualTo(3);
    }
}
