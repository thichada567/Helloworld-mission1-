package devtraining.mission1;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {
    @GetMapping("/hello")
    public String Hello() {
      return "Hello world!!";
    }

}
