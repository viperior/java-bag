public interface BagInterface
{
	abstract public int getCount();
	abstract public boolean isEmpty();
	abstract public boolean isFull();
	abstract public void add (Item item);
	abstract public Item remove();
	abstract public Item remove(String s);
	abstract public void clear();
}
