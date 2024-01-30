package entity;

import org.example.entity.SearchCity;
import org.example.exception.NotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SearchTest {

    private SearchCity searchCity;

    @BeforeEach
    void setUp(){
        searchCity = new SearchCity();
        searchCity.setCities(Arrays.asList("Paris", "Budapest", "Rotterdam", "Valence", "Vancouver"));
    }

    @Test
    void testSearchCitiesMethodShouldRaiseNotFoundExceptionWhenWordLengthLT2() {
        Assertions.assertThrowsExactly(NotFoundException.class, () -> {
            searchCity.search("a");
        });
    }

    @Test
    void testSearchCitiesMethodShouldNotRaiseExceptionWhenWordLengthGT2() {
        Assertions.assertDoesNotThrow(() -> searchCity.search("azo"));
    }

    @Test
    void testSearchCityShouldReturnCitiesStartedWithWordSearch() {
        List<String> result = searchCity.search("Va");
        Assertions.assertEquals(Arrays.asList("Valence", "Vancouver"), result);
    }

    @Test
    void testSearchCityShouldNotBeCaseSensitive(){
        List<String> result = searchCity.search("vA");
        Assertions.assertEquals(Arrays.asList("Valence", "Vancouver"), result);
    }

    @Test
    void testSearchCityShouldReturnCitiesContainsWordSearch(){
        List<String> result = searchCity.search("ape");
        Assertions.assertEquals(List.of("Budapest"), result);
    }

    @Test
    void testSearchCityShouldReturnAllCitiesWordSearchIsAsterisk(){
        List<String> result = searchCity.search("*");
        Assertions.assertEquals(List.of("Paris", "Budapest", "Rotterdam", "Valence", "Vancouver"), result);
    }
}
