package leetcode.solutions;

/**
 * @author Bourbon
 * @date 2018/4/25
 * @description 383. 赎金信
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
 * 如果可以构成，返回 true ；否则返回 false。
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
 * 字符不能重复使用
 */
public class RansomNote {

	public boolean canConstruct(String ransomNote, String magazine) {
		boolean flag = true;
		for (int i = 0; i < ransomNote.length(); i++) {
			if (!magazine.contains("" + ransomNote.charAt(i))) {
				flag = false;
				break;
			}
			magazine = magazine.replaceFirst(""+ransomNote.charAt(i), "");
			System.out.println(magazine);
		}
		return flag;
	}
}
