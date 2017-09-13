class Item
{
  private String name;

  public Item(String s)
  {
    setName(s);
  }

  public Item()
  {
    setName("mystery item");
  }

  public String getName()
  {
    return name;
  }

  public void setName(String s)
  {
    name = s.toUpperCase();
  }
}
