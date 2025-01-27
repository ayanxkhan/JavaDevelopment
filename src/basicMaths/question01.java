package basicMaths;

public class question01 {

    public static int searchElem(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }


    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target1 = 5,target2 = 2;

        System.out.println(searchElem(nums,target1));
        System.out.println(searchElem(nums,target2));

    }
}
