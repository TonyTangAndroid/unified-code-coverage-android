package net.rafaeltoledo.coverage;

public class PojoMissed {

  private String thing = "default string";

  public String getThing() {
    return thing;
  }

  public void setThing(String thing) {
    this.thing = thing;
  }

  public Object missedTest() {
    return thing;
  }
}
