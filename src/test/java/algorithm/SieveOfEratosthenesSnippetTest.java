/*
 * MIT License
 *
 * Copyright (c) 2017-2022 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Tests for 30 Seconds of Java code library
 *
 */

class SieveOfEratosthenesSnippetTest {
  /**
   * Tests for {@link SieveOfEratosthenesSnippet (int)}.
   */

  @Test
  void testSieveOfEratosthenes() {
    boolean[] arr = SieveOfEratosthenesSnippet.sieveOfEratosthenes(4);
    assertTrue(arr[0]);
    assertTrue(arr[1]);
    assertTrue(arr[2]);
    assertTrue(arr[3]);
    assertFalse(arr[4]);

    boolean[] arr2 = SieveOfEratosthenesSnippet.sieveOfEratosthenes(7);
    assertTrue(arr2[0]);
    assertTrue(arr2[1]);
    assertTrue(arr2[2]);
    assertTrue(arr2[3]);
    assertFalse(arr2[4]);
    assertTrue(arr2[5]);
    assertFalse(arr2[6]);
    assertTrue(arr2[7]);

    boolean[] arr3 = SieveOfEratosthenesSnippet.sieveOfEratosthenes(2);
    assertTrue(arr3[0]);
    assertTrue(arr3[1]);
    assertTrue(arr3[2]);
  }
}
