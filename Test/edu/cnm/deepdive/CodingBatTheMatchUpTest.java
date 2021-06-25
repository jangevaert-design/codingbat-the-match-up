package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatTheMatchUp.matchUp;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatTheMatchUpTest {

  private int[][] match1Params = {
      {1, 2, 3},
      {1, 2, 3},
      {1, 2, 3},
      {5, 3},
      {5, 3},
      {5, 3},
      {5, 3},
      {5, 3},
      {5, 3},
      {4},
      {4}
  };

  private int[][] match2Params = {
      {2, 3, 10},
      {2, 3, 5},
      {2, 3, 3},
      {5, 5},
      {4, 4},
      {3, 3},
      {2, 2},
      {1, 1},
      {0, 0},
      {4},
      {5}
  };

  private int[] matchExpected = {2, 3, 2, 1, 2, 1, 1, 1, 0, 0, 1};


  @Test
  void matchTest() {
    for (int i = 0; i < match1Params.length; i++) {
      int actual = matchUp(match1Params[i], match2Params[i]);
      Assertions.assertEquals(actual, matchExpected[i]);
    }
  }


}