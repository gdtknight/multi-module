package dev.be.moduleapi.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoServiceTest {

  private final DemoService demoService;

  DemoServiceTest(@Autowired DemoService demoService) {
    this.demoService = demoService;
  }

  @Test
  public void given_whenCallSaveMethod_thenReturnSave() {
    demoService.save();
    assertEquals("save", demoService.save());
  }

  @Test
  public void givenNothing_whenCallFindMethod_thenReturnFind() {
    assertEquals("find", demoService.find());
  }

}
