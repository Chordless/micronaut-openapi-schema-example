package no.bjonnhy;

import java.math.BigDecimal;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class TimeController {

    /**
     * Time of 10 seconds
     * @return Time of 10 seconds
     */
    @Get("/time")
    Time getTime() {
        return Time.of(BigDecimal.TEN, TimeUnit.Second);
    }
}
