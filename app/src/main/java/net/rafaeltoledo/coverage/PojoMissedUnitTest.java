package net.rafaeltoledo.coverage;

public class PojoMissedUnitTest {

  private Object thing;

  public Object getThing() {
    return thing;
  }

  public void setThing(Object thing) {
    this.thing = thing;
  }

  public Object missedTest() {
    return thing;
  }
}
