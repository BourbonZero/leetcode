package leetcode.solutions;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Bourbon
 * @date 2018/4/26
 * @description 728. 自除数
 * 自除数 是指可以被它包含的每一位数除尽的数。
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * 还有，自除数不允许包含 0 。
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 */
public class SelfDividingNumbers {

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new LinkedList<Integer>();
		for (int i = left; i <= right; i++) {
			if (check(i)) {
				list.add(new Integer(i));
			}
		}
		return list;
	}

	private boolean check(int n) {
		int num = n;
		while (num > 0) {
			int x = num % 10;
			if (x == 0 || n % x != 0) {
				return false;
			}
			num = num / 10;
		}
		return true;
	}
}
