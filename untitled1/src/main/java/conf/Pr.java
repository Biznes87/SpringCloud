package conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Pr {

  PropertyPrinter propertyPrinter;

  @Autowired
  public Pr(PropertyPrinter propertyPrinter) {
    this.propertyPrinter = propertyPrinter;
    propertyPrinter.print();
  }
}
