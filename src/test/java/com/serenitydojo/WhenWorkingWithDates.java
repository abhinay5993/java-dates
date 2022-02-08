package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;

import static java.time.DayOfWeek.MONDAY;
import static java.time.temporal.TemporalAdjusters.nextOrSame;

@DisplayName("When working with dates in Java 8")
class WhenWorkingWithDates {

    @DisplayName("The LocalDate class represents a date")
    @Nested
    class CreatingLocalDates {

        @Test
        @DisplayName("We can create a date by specifying the year, month and day")
        void creatingASimpleDate() {
            LocalDate jan26 = LocalDate.of(2022, Month.JANUARY, 26);

            DateAssertions.assertThat(jan26).isEqualTo(27, Month.JANUARY, 2022);
        }

        @Test
        @DisplayName("We can create a date by using a string")
        void creatingASimpleDateFromAString() {
            LocalDate jan26 = LocalDate.parse("2022-01-26");

            DateAssertions.assertThat(jan26).isEqualTo(26, Month.JANUARY, 2022);
        }

        @Test
        @DisplayName("We can create a date by using a formatted string")
        void createADateFromAFormattedString() {
            LocalDate jan26
                    = LocalDate.parse("26/01/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            DateAssertions.assertThat(jan26).isEqualTo(26, Month.JANUARY, 2022);

        }

        @Test
        @DisplayName("We can create a date by using a different formatted string")
        void createADateFromADifferentFormattedString() {
            LocalDate jan26
                    = LocalDate.parse("Jan 26, 2022", DateTimeFormatter.ofPattern("MMM dd, yyyy"));

            DateAssertions.assertThat(jan26).isEqualTo(26, Month.JANUARY, 2022);

        }

    }

    @DisplayName("We can use LocalDates to find relative dates")
    @Nested
    class CreatingRelativeDates {
        @Test
        @DisplayName("We can create a date for the following day")
        void findTheNextDay() {
            LocalDate jan26 = LocalDate.parse("2022-01-26");

            LocalDate nextDay = jan26.plusDays(1);

            DateAssertions.assertThat(nextDay).isEqualTo(27, Month.JANUARY, 2022);

        }

        @Test
        @DisplayName("We can create a date for the following month")
        void findTheNextMonth() {
            LocalDate jan26 = LocalDate.parse("2022-01-31");

            LocalDate nextDay = jan26.plusMonths(1);

            DateAssertions.assertThat(nextDay).isEqualTo(28, Month.FEBRUARY, 2022);
        }

        @Test
        @DisplayName("We can find a specific day of the week")
        void findTheNextMonday() {
            LocalDate jan26 = LocalDate.parse("2022-01-26");
            LocalDate followingMonday = findFollowingWeekday(jan26, MONDAY);

            DateAssertions.assertThat(followingMonday).isEqualTo(31, Month.JANUARY, 2022);

        }

        @Test
        @DisplayName("We can find a specific day of the week using temporal adjusters")
        void usingTemporalAdjusters() {
            LocalDate jan26 = LocalDate.parse("2022-01-26");
            LocalDate followingMonday = jan26.with(nextOrSame(MONDAY));

            DateAssertions.assertThat(followingMonday).isEqualTo(31, Month.JANUARY, 2022);
        }

        @Test
        @DisplayName("We can find a specific day of the week using temporal adjusters")
        void usingTemporalAdjustersToGetTheNextOrCurrentDate() {
        }

        @Test
        @DisplayName("We can find the first day of the next month")
        void usingOtherTemporalAdjusters() {
        }

    }

    private LocalDate findFollowingWeekday(LocalDate startDate, DayOfWeek expectedDayOfWeek) {
        LocalDate followingDay = startDate;
        while(followingDay.getDayOfWeek() != expectedDayOfWeek) {
            followingDay = followingDay.plusDays(1);
        }
        return followingDay;
    }

    @Nested
    class FormattingDates {
        @Test
        @DisplayName("We can convert dates to a formatted string value")
        void createADateFromAFormattedString() {
        }

    }
}
