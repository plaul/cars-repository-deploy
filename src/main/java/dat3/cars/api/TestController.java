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

  @Value("${spring.datasource.url}")
  String url;


  @Value("${spring.datasource.username}")
  String user;

  @Value("${spring.datasource.password}")
  String pw;


  @GetMapping
  public String getMsg(){
    return "["+msg+" : " +url +" : "+ user +" : " +pw +  "]";
  }

}
