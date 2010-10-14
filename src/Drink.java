public enum Drink 
{
  BEER      (Container.GLASS),
  COFFEE    (Container.CUP),
  CHOCOLATE (Container.CUP);
  
  Drink(Container container) { this.container = container; }
  private final Container container;
  public Container container() { return container; }
}