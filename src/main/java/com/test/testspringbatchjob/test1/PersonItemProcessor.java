package com.test.testspringbatchjob.test1;


import com.test.testspringbatchjob.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor
    implements ItemProcessor<CreditBill, String> {

  private static final Logger LOGGER =
      LoggerFactory.getLogger(PersonItemProcessor.class);

  @Override
  public String process(CreditBill creditBill) throws Exception {
    String greeting = "Hello " + creditBill.getAccountID() + " "
        + creditBill.getName() + "!";

    LOGGER.info("converting '{}' into '{}'", creditBill, greeting);
    return greeting;
  }


}
