public class Bag implements BagInterface
{
  public static int MAXSIZE = 25;
  private static int NOTFOUND = -1;
  private Item[] contents;
  private int open_space_index;

  public Bag()
  {
    clear();
  }

  public void add(Item item)
  {
    if( isFull() )
    {
      System.out.println("The bag is full. Could not add a " + item.getName());
    }
    else
    {
      contents[open_space_index] = item;
      open_space_index++;
    }
  }

  public void clear()
  {
    contents = new Item[MAXSIZE];
    open_space_index = 0;
  }

  private int find(String item_name)
  {
    // Return the index of the named item or -1 if not found.
    int x = -1;
    int i = 0;

    do
    {
      if( contents[i].getName().equalsIgnoreCase(item_name) )
      {
        x = i;
        i = MAXSIZE;
      }
      else
      {
        i++;
      }
    } while ( i < getCount() );

    return x;
  }

  public int getCount()
  {
    return open_space_index;
  }

  public boolean isEmpty()
  {
    return getCount() == 0;
  }

  public boolean isFull()
  {
    return getCount() == MAXSIZE;
  }

  public Item remove()
  {
    // Remove the last item that was added.
    Item temp_item = null;

    if( isEmpty() )
    {
      System.out.println("There ain't nothin' there, Bubba.");
    }
    else
    {
      temp_item = contents[getCount() - 1];
      open_space_index--;
    }

    return temp_item;
  }

  public Item remove(String item_name)
  {
    // Remove the first occurrence of item with name s.
    int x = find(item_name);
    Item return_item = null;

    if( x == NOTFOUND )
    {
      System.out.println("Nope. Not found.");
    }
    else
    {
      return_item = contents[x];
      contents[x] = contents[getCount() - 1];
      open_space_index--;
    }

    return return_item;
  }
}
