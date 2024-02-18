public class anonoyamous13 {
   
        public int add(int nums[])
        {
            int result=0;
            for(int n: nums)
            {
                result=result+n;
            }
            return result;
        }
        public static void main(String[] args) {
            {
                anonoyamous13 s=new anonoyamous13();
                // int nums[]={1,2,3,4,5};
                // int result=s.add(nums);
                int result=s.add(new int[]{1,2,3,4});

                System.out.println(result);
            }
        }

    
}
