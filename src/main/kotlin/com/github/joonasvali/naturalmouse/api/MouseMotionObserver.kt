package com.github.joonasvali.naturalmouse.api

/**
 * Use to observe mouse movement in MouseMotion
 */
interface MouseMotionObserver {
  fun observe(xPos: Int, yPos: Int)
}
