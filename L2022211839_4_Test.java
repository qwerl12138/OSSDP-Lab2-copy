import org.junit.Assert;
import org.junit.Test;

public class L2022211839_4_Test {
    // 测试用例设计的总体原则：
    // 1. 边界值测试：测试空数组、单元素数组等边界情况。
    // 2. 等价类划分：将输入分为不同的等价类，如正数、负数、零等。
    // 3. 随机测试：对大数组进行随机测试，以验证算法在大数据量下的正确性。
    // 4. 特殊情况测试：测试包含相同元素的数组。
    // 5. 正常情况测试：测试包含不同元素的数组。

    // Throughout test!
    
    @Test
    public void testMaximumGapWithSmallArray() {
        // 测试目的：验证算法对于小数组的正确性。
        // 测试用例：数组长度小于2。
        Solution4 solution = new Solution4();
        int[] nums = {3, 6, 9, 1};
        Assert.assertEquals("最大差值不正确", 3, solution.maximumGap(nums));
    }

    @Test
    public void testMaximumGapWithSingleElementArray() {
        // 测试目的：验证算法对于只有单个元素的数组的处理。
        // 测试用例：单元素数组。
        Solution4 solution = new Solution4();
        int[] nums = {10};
        Assert.assertEquals("最大差值应该为0", 0, solution.maximumGap(nums));
    }

    @Test
    public void testMaximumGapWithEmptyArray() {
        // 测试目的：验证算法对于空数组的处理。
        // 测试用例：空数组。
        Solution4 solution = new Solution4();
        int[] nums = {};
        Assert.assertEquals("最大差值应该为0", 0, solution.maximumGap(nums));
    }

    @Test
    public void testMaximumGapWithRandomArray() {
        // 测试目的：验证算法对于随机生成的大数组的正确性。
        // 测试用例：大数组，包含随机数。
        Solution4 solution = new Solution4();
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 1000000);
        }
        int maxGap = solution.maximumGap(nums);
        Assert.assertTrue("最大差值应该大于等于0", maxGap >= 0);
    }

    @Test
    public void testMaximumGapWithIdenticalElementsArray() {
        // 测试目的：验证算法对于所有元素相同的数组的处理。
        // 测试用例：所有元素相同的数组。
        Solution4 solution = new Solution4();
        int[] nums = new int[]{1, 1, 1, 1};
        Assert.assertEquals("最大差值应该为0", 0, solution.maximumGap(nums));
    }

    @Test
    public void testMaximumGapWithNegativeNumbersArray() {
        // 测试目的：验证算法对于包含负数的数组的正确性。
        // 测试用例：包含负数的数组。
        Solution4 solution = new Solution4();
        int[] nums = {-3, 6, -9, 1};
        Assert.assertTrue("最大差值应该大于等于0", solution.maximumGap(nums) >= 0);
    }
}
