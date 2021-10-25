package classes;

public class MyClass<T> {
  private T t;
  private T[] backingArray = (T[]) new Object[2];

  public void set(T t) {
    this.backingArray[0] = t;
    this.t = backingArray[0];
  }

  public T get() {
    return t;
  }
}

