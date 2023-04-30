package com.iluwatar.gameloop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameControllerTest {

  private GameController controller;

  @BeforeEach
  void setup() {
    controller = new GameController();
  }

  @AfterEach
  void tearDown() {
    controller = null;
  }

  @Test
  void testMoveBullet() {
    controller.moveBullet(1.5f);
    assertEquals(1.5f, controller.bullet.getPosition(), 0);
  }

  @Test
  void testGetBulletPosition() {
    assertEquals(controller.bullet.getPosition(), controller.getBulletPosition(), 0);
  }

}
