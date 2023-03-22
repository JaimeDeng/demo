package LeetCode;
import java.util.Scanner;

import org.springframework.util.StringUtils;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Map解法 (用單個迴圈)
public class $1TwoSum_Map {
	public static void main(String[] args) {
		
		int[] nums = { 2 , 7 , 11 , 15};
		int target = 18;
		int count = 0;
		//Map有contains可查找存在內容 , 也有get可取值 , 因此只用Map (Set不能取值 , list不能直接找contains)
		Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];		//target扣掉目前值求出的數就是要找的對象數字
            if (map.containsKey(complement)) {		//每次for都會循遍一次Map的Key(所以省去第二個迴圈) , 看有沒有對象數字
               int[] result = new int[] { map.get(complement), i};		//  [ 用map.get取該Key的Value , 目前i值 ]
               System.out.println(Arrays.toString(result));
               break;
            }
            count ++;
            map.put(nums[i], i);		//把nums[i]的值丟給map的key跟value
        }
        if(count == nums.length) {
        	System.out.println("no answer");
        }
        
	}
}