package com.github.joonasvali.naturalmouse.api

import java.awt.Dimension

/**
 * Abstracts ordinary static System calls away
 */
interface SystemCalls {
  fun currentTimeMillis(): Long
  fun sleep(time: Long)
  fun getScreenSize(): Dimension
  fun setMousePosition(x: Int, y: Int)
}
