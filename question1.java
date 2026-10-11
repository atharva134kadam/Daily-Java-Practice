public class question1 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};

        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1 ; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate is "+arr[j]);
                }
            }
        }
    }
}
