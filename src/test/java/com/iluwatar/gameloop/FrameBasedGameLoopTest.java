package com.iluwatar.gameloop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FrameBasedGameLoopTest {

  private FrameBasedGameLoop gameLoop;

  @BeforeEach
  void setup() {
    gameLoop = new FrameBasedGameLoop();
  }

  @AfterEach
  void tearDown() {
    gameLoop = null;
  }

  @Test
  void testUpdate() {
    gameLoop.update();
    assertEquals(0.5f, gameLoop.controller.getBulletPosition(), 0);
  }
}
