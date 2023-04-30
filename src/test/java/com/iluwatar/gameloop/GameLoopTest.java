package com.iluwatar.gameloop;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameLoopTest {

  private GameLoop gameLoop;

  @BeforeEach
  void setup() {
    gameLoop = new GameLoop() {
      @Override
      protected void processGameLoop() {
      }
    };
  }

  @AfterEach
  void tearDown() {
    gameLoop = null;
  }

  @Test
  void testRun() {
    gameLoop.run();
    Assertions.assertEquals(GameStatus.RUNNING, gameLoop.status);
  }

  @Test
  void testStop() {
    gameLoop.stop();
    Assertions.assertEquals(GameStatus.STOPPED, gameLoop.status);
  }

  @Test
  void testIsGameRunning() {
    assertFalse(gameLoop.isGameRunning());
  }
}
