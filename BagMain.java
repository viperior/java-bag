class BagMain
{
	public static void main(String args[])
	{
		Bag b = new Bag();
		b.add(new Item("apple"));
		b.add(new Item("banana"));
		b.add(new Item("coconut"));
		b.add(new Item("doughnut"));
		b.add(new Item("apple"));
		b.add(new Item("banana"));

		System.out.println("There are " + b.getCount() + " items in the bag.");

		Item x;
		x = b.remove("apple");
		x = b.remove("doughnut");
		x = b.remove();

		System.out.println("There are " + b.getCount() + " items in the bag.");

		System.out.println("Last item removed was a(n) " + x.getName());
	}
}
