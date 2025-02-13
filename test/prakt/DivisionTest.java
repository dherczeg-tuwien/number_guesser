package prakt;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class DivisionTest {

    @Test
    void when_bDividesA_thenResultIsWholeNumber(){
        int a = 10;
        int b = 2;
        int g = 5;

        double result = CustomMath.dividesAB(a,b);

        assertThat(result, is(closeTo(g, 0.01)));
    }

    @Test
    void BDoesNotDevidesA_ThenResultRoundedDown(){
        int a = 5;
        int b = 2;
        int g = 2;

        double result = CustomMath.dividesAB(a,b);

        assertThat(result, is(closeTo(g, 0.01)));
    }

    @Test
    void BIsZero_ThenResultIsNotANumber() {
        int a = 5;
        int b = 0;

        double result = CustomMath.dividesAB(a,b);

        assertThat(result, is(Double.NaN));
    }

    @Test
    void BEqualsA_ThenResultIsOne(){
        int a = 8;
        int b = 8;
        int g = 1;

        double result = CustomMath.dividesAB(a,b);

        assertThat(result, is(closeTo(g, 0.01)));
    }

    @Test
    void AIsEqualsZero_ThenResultIsZero(){
        int a = 0;
        int b = 1;
        int g = 0;

        double result = CustomMath.dividesAB(a,b);

        assertThat(result, is(closeTo(g, 0.01)));


    }
}
