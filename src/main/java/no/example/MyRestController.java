package no.example;

import java.math.BigDecimal;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class MyRestController {

    /**
     * Gets some data.
     *
     * @return A MyData Object
     */
    @Get("/data")
    MyData getData() {
        return new MyData();
    }
}
