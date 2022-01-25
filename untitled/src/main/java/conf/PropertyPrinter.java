package conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyPrinter {

  @Value("${untitled.property}")
  String value;

  public void print() {
    System.out.println(value);
  }
}
