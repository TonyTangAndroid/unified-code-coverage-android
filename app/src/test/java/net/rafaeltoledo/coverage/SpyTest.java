package net.rafaeltoledo.coverage;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

public class SpyTest {

  @Test
  public void whenSpyingOnList_thenCorrect() {
    List<String> list = new ArrayList<>();
    List<String> spyList = spy(list);

    spyList.add("one");
    spyList.add("two");

    verify(spyList).add("one");
    verify(spyList).add("two");

    verifyNoMoreInteractions(spyList);

    assertEquals(2, spyList.size());
  }

  /**
   * Bug test for spy
   */
  @Ignore
  @Test
  public void testIssues() {

    PrintStream testStream = spy(System.out);
    testStream.println("Hello!");
    testStream.println("Goodbye!");

    verify(testStream).println("Hello!");
    verify(testStream).println("Goodbye!");

    verifyNoMoreInteractions(testStream);
  }
}