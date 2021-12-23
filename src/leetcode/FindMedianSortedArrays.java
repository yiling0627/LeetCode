package leetcode;

public class FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total  = nums1.length + nums2.length;
        if (total % 2 == 1)
            return findKth(nums1, 0, nums2, 0, total / 2 + 1);
        else
            return (findKth(nums1, 0, nums2, 0, total / 2)
                    + findKth(nums1, 0, nums2, 0, total / 2 + 1)) / 2.0;
    }

    int findKth(int[] nums1, int left1, int[] nums2, int left2, int k){
        //always assume that nums1 is shorter than nums2
        if(nums1.length - left1 > nums2.length - left2) return findKth(nums2, left2, nums1, left1, k);

        if(nums1.length - left1 == 0) return nums2[left2 + k - 1];
        if(k == 1) return Math.min(nums1[left1], nums2[left2]);

        int k1 = Math.min(k/2, nums1.length - left1), k2 = k - k1;
        if(nums1[k1 - 1 + left1] < nums2[k2 - 1 + left2]) return findKth(nums1, left1 + k1, nums2, left2, k - k1);
        else if (nums1[k1 - 1 + left1] > nums2[k2 - 1 + left2]) return findKth(nums1, left1, nums2, left2 + k2, k - k2);
        else return nums1[k1 - 1 + left1];
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2,4};

        FindMedianSortedArrays f = new FindMedianSortedArrays();
        System.out.println(f.findMedianSortedArrays(nums1,nums2));
    }
}
