class Solution {
    public List<Integer> majorityElement(int[] nums) {

        // Moore's Algorithm

        int n = nums.length;

        int ele1 = 0, ele2 = 0;
        int count1 = 0, count2 = 0;

        // Candidate find karna
        for (int i = 0; i < n; i++) {

            if (nums[i] == ele1) {
                count1++;
            } else if (nums[i] == ele2) {
                count2++;
            } else if (count1 == 0) {
                ele1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                ele2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Dobara actual count nikalenge
        count1 = 0;
        count2 = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] == ele1) {
                count1++;
            } else if (nums[i] == ele2) {
                count2++;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        if (count1 > n / 3) {
            list.add(ele1);
        }

        if (count2 > n / 3) {
            list.add(ele2);
        }

        return list;

        // Brute Force Approch
        
        // int n = nums.length;
        // ArrayList<Integer> list = new ArrayList<>();

        // for (int i = 0; i < n; i++) {
        //     int count = 0;
        //     for (int j = 0; j < n; j++) {
        //         if (nums[i] == nums[j]) {
        //             count++;
        //         }
        //     }
        //     if (count > (n / 3) && !list.contains(nums[i])) {
        //         list.add(nums[i]);
        //     }
        // }
        // return list;
    }
}
