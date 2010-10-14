public enum Container
{
  CUP   (2),
  GLASS (1);

  Container(int size) { this.size = size; }
  private final int size;
  public int size() { return size; }
}