package warmUp;

import java.util.List;

public class Dublicates {

	public static void main(String[] args) {
		boolean res=hasDupliates(new int[] {5,3,10,1});
		System.out.println(res);
		res=hasDupliates(new int[] {5,3,10,1,5});
		System.out.println(res);
	}
	
		
		public static boolean hasDupliates(int[] nums) {
			if(nums.length<=1) return false;
			//{5,3,10,1}
			for(int i=0; i<nums.length; i++) {
				//{5,3,10,1}
				for(int k=i+1; k<nums.length; k++) {
				System.out.println(nums[i]+"->"+nums[k]);
				if(nums[i] == nums[k]) {
					return true;
				}
				}
			}
			
			return false;
		}
		

		public static boolean hasDupliates(List<Integer> nums) {
			if(nums.size()<=1) return false;
			//{5,3,10,1}
			for(int i=0; i<nums.size(); i++) {
				//{5,3,10,1}
				for(int k=i+1; k<nums.size(); k++) {
				System.out.println(nums.get(i)+"->"+nums.get(k));
				if(nums.get(i) == nums.get(k)) {
					return true;
				}
				}
			}
			
			return false;
		}

	}


