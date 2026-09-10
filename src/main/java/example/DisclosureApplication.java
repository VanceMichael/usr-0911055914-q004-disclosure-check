package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DisclosureApplication {
  public static void main(String[] args) { SpringApplication.run(DisclosureApplication.class, args); }
  @RestController static class Health {
    @GetMapping("/health") String health() { return "{\"status\":\"ok\"}"; }
  }
}
