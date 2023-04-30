package com.iluwatar.gameloop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VariableStepGameLoopTest {

  private VariableStepGameLoop gameLoop;

  @BeforeEach
  void setup() {
    gameLoop = new VariableStepGameLoop();
  }

  @AfterEach
  void tearDown() {
    gameLoop = null;
  }

  @Test
  void testUpdate() {
    gameLoop.update(20L);
    Assertions.assertEquals(0.01f, gameLoop.controller.getBulletPosition(), 0);
  }
}
