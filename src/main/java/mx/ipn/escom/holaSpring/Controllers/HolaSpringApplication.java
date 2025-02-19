package mx.ipn.escom.holaSpring.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaSpringApplication {

	 @GetMapping("/hola")
    public String holaSpring() {
        return "hola";
    }

}
