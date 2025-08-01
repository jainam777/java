package arrays;

public class CustomArrayList {
	int size=5;
	int count = 0;
	int[] arr = new int[size];
	
	public void add(int num) {
		if (count >= arr.length) {
			 int[] newArr = new int[arr.length + 5];
			 for (int i = 0; i < arr.length; i++) {
	                newArr[i] = arr[i];
	            }
			 arr = newArr;
			}
		
		arr[count] = num;
		count++;

		
		
	}
	
	public void print() {
		System.out.print("{");
		for (int n = 0; n < count; n++) {
			System.out.print(arr[n]);
			if (n < count - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}

	public static void remove(int num) {
		
	}
	
	
	public static void main(String[] args) {
		CustomArrayList list = new CustomArrayList();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.print();
	}
}
