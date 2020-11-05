/**
 * 
 */
package core.inheritance;

/**
 * @author CANTV
 *
 */
public class TestCow {

	private String name;

	/**
	 * 
	 */

	public int[] shuffle(int[] nums, int n) {
		System.out.println(nums[0]);

		int[] shuffled = new int[nums.length];

		for (int i = 0, j = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				shuffled[i] = nums[j];
			} else {
				shuffled[i] = nums[j + n];
				j++;
			}
		}

		return shuffled;
	}

	public int numIdenticalPairs2(int[] nums) {
		int pairNum = 0;
		int i, j;
		for (i = 0; i < nums.length; i++) {
			for (j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j] && i < j)
					pairNum++;
			}
		}
		return pairNum;
	}

	public int numIdenticalPairs(int[] nums) {
		int a[] = new int[10];
		int sum = 0;
		for (int num : nums) {
			System.out.println("num: " + num);
			a[num]++;
		}

		/*
		 * for (int i : a) { System.out.println(i); }
		 */

		for (int i : a) {
			if (i > 1)
				sum += ((i * (i - 1)) / 2);
		}

		return sum;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestCow tCow = new TestCow();
		int [] nums = {2,5,1,3,4,7};
		for (Integer i:nums) 
			System.out.println(i);
		
		char [] chars = {'A','n','h','C','a','n'};
		System.out.println(new String(chars));
		/*
		 * int [] nums = {2,5,1,3,4,7}; int [] results = tCow.shuffle(nums, 3); for(int
		 * i: results) { System.out.println(i); }
		 */

//		System.out.println(tCow.numIdenticalPairs(new int[] { 1, 2, 3, 1, 1, 3 }));
		

		/*
		 * System.out.println(0 % 2); System.out.println(1 % 2); System.out.println(2 %
		 * 2); System.out.println(3 % 2); System.out.println(4 % 2);
		 * System.out.println(5 % 2);
		 */
		// TODO Auto-generated method stub
//		Cow objCow = new Cow();
//		objCow.moo();
	}

}
