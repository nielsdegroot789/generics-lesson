
public class Main2 {

	public static void main(String[] args) {
		Table<String, Integer> tablee = new Table<>();

		tablee.put("elf", 11);
		tablee.put("twaalf", 12);
		tablee.put("dertien", 13);

		Integer value = tablee.getValue("elf");

		tablee.removeEntry("twaalf");
		System.out.println(tablee.getEntries());

		Entry<Object, String> entry = new Entry<>(null, null);
	}

}
