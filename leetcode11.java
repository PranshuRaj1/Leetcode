public class leetcode11 {
    public static void main(String[] args) {

    }
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left < right){
            int width = right - left;
            int height_tower = Math.min(height[left],height[right]);
            int area = height_tower*width;
            max = Math.max(max,area);

            if(height[left] < height[right]){
                left++;
            }
            else if(height[right] < height[left]){
                right--;
            }
            else{
                left++;
                right--;
            }

        }
        return max;
    }
}
