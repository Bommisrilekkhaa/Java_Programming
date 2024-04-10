int firstMissingPositive(int* nums, int numsSize){
    int j=1;
       int n=numsSize;
         for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for(int i=0;i<numsSize;i++)
        {
           if(nums[i]==j)
           j++;
            
        }
        return j;
}