public class question5 {
    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int max = nums[0];

        for(int i = 0; i < nums.length; i++) {

            int temp = 0;

            for(int j = i; j < nums.length; j++) {

                temp = temp + nums[j];

                if(temp > max) {
                    max = temp;
                }
            }
        }

        System.out.println(max);
    }
}