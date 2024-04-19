class Solution {
    public void nextPermutation(int[] nums) 
    {
        int[] arr = new int[nums.length];

        for(int i=0;i<nums.length;i++)
            arr[i]=nums[i];

        int index = -1;
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                index = i;
                break;
            }
        }

        if(index == -1)
        {
            for(int i=0;i<nums.length;i++)
                nums[i]=arr[nums.length-i-1];
            return;
        }

        for(int i=nums.length-1;i>index;i--)
        {
            if(arr[i] > arr[index])
            {
                int t = arr[index];
                arr[index] = arr[i];
                arr[i]=t;

                break;
            }
        }

        int j=0;
        nums[index] = arr[index];
        for(int i=index+1;i<nums.length;i++)
        {
            nums[i]=arr[nums.length-j-1];
            j++;
        }

    }
}