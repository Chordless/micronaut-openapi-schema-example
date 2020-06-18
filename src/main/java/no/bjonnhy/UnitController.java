package no.bjonnhy;

import java.math.BigDecimal;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class UnitController {

    /**
     * Time of 10 seconds
     *
     * @return Time of 10 seconds
     */
    @Get("/time")
    Time getTime() {
        return Time.of(BigDecimal.TEN, TimeUnit.Second);
    }

    /**
     * Length of 10 Kilometer
     *
     * @return Length of 10 Kilometer
     */
    @Get("/length")
    Length getLength() {
        return Length.of(BigDecimal.ONE, LengthUnit.Kilometer);
    }
}
