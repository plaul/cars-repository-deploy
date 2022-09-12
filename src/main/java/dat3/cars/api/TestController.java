package dat3.cars.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")
public class TestController {


  @Value("${app.secret-msg}")
  private String msg;

  @GetMapping
  public String getMsg(){
    return "["+msg+"]";
  }

}
