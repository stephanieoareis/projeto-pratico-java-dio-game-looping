package com.iluwatar.gameloop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class FixedStepGameLoopTest {

  private FixedStepGameLoop gameLoop;

  @BeforeEach
  void setup() {
    gameLoop = new FixedStepGameLoop();
  }

  @AfterEach
  void tearDown() {
    gameLoop = null;
  }

  @Test
  void testUpdate() {
    gameLoop.update();
    assertEquals(0.01f, gameLoop.controller.getBulletPosition(), 0);
  }

}
