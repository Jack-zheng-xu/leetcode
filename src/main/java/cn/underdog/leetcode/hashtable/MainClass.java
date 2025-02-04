package cn.underdog.leetcode.hashtable;


import cn.underdog.leetcode.MainClass.ListNode;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
//        System.out.println(divisor(5, 6));
//        containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3);
//        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
//        canConstruct("aa", "ab");
//        System.out.println(isIsomorphic("badc", "baba"));
//        System.out.println(buddyStrings("ab", "ba"));
//        System.out.println(buddyStrings("aa", "aa"));
//        System.out.println(buddyStrings("ab", "ab"));
//        System.out.println(buddyStrings("aaaaaaabc", "aaaaaaacb"));
//        System.out.println(buddyStrings("abcd",     "badc"));
//        System.out.println(buddyStrings("abab",     "abab"));
//        System.out.println(buddyStrings("abcd",     "abcd"));
//        System.out.println(buddyStrings("abcabc", "abcabc"));
//        System.out.println(buddyStrings("abab", "baba"));
//        System.out.println(wordPattern("abba", "dog cat cat dog"));
//        System.out.println(wordPattern("abba", "dog cat cat finsh"));
//        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
//        System.out.println(wordPattern("abba", "dog dog dog dog"));
        //letterCombinations("23");
//        findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"});
//        findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"}, new String[]{"KFC", "Shogun", "Burger King"});

       /* List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        System.out.println(wordBreak("leetcode", list));*/
      /*  List<String> list = new ArrayList<>();
        list.add("go");
        list.add("goal");
        list.add("goals");
        list.add("special");
        System.out.println(wordBreak("goalspecial", list));*/
//        findErrorNums(new int[]{1, 2, 2, 4});
//        commonChars(new String[]{"bella","label","roller"});
//        commonChars(new String[]{"cool", "lock", "cook"});
//        longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1});
//        System.out.println(fourSumCount(new int[]{0, 1, -1}, new int[]{-1, 1, 0}, new int[]{0, 0, 1}, new int[]{-1, 1, 1}));
//        System.out.println(intToRoman(1994));
//        longestWord(new String[]{"a", "banana", "appl", "ap", "apply", "apple"});
//        System.out.println(longestWord(new String[]{"a", "ba", "ban", "b", "banana", "appl", "ap", "apply", "apple"}));
//        System.out.println(longestWord(new String[]{"a"}));
//        System.out.println(frequencySort("tree"));
//        System.out.println(fiindJudge(2, new int[][]{}));
//        uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});
        MainClass mainClass = new MainClass();
//        mainClass.minMutation("AACCGGTT","AACCGGTA",new String[]{"AACCGGTA"});
//        System.out.println(mainClass.minMutation("AACCGGTT", "AAACGGTA", new String[]{"AACCGGTA", "AACCGCTA", "AAACGGTA"}));
//        System.out.println(mainClass.minMutation("AACCTTGG", "AATTCCGG", new String[]{"AATTCCGG", "AACCTGGG", "AACCCCGG", "AACCTACC"}));
//        System.out.println(mainClass.minMutation("AACCGGTT", "AAACGGTA", new String[]{"AACCGATT", "AACCGATA", "AAACGATA", "AAACGGTA"}));
//        mainClass.mostCommonWord( "Bob hit a ball, the hit BALL flew far after it was hit.",new String[]{"hit"});
//        mainClass.mostCommonWord("a, a, a, a, b,b,b,c, c", new String[]{"a"});
//        System.out.println(mainClass.hasGroupsSizeX(new int[]{1, 1, 2, 2, 2, 2}));
//        System.out.println(mainClass.hasGroupsSizeX(new int[]{1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3}));
        String str = "通话";
        String str1 = "重地";
        System.out.println(str == str1);
        Map<String, String> map = new HashMap<>();
        map.put("通话", "通话");
        map.put("重地", "重地");
        System.out.println(map.size());
    }

    /**
     * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
     * <p>
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：[3,2,3]
     * 输出：3
     * 示例 2：
     * <p>
     * 输入：[2,2,1,1,1,2,2]
     * 输出：2
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/majority-element
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int majorityElement(int[] nums) {
        int length = nums.length / 2;
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            integerMap.put(nums[i], integerMap.getOrDefault(nums[i], 0) + 1);

        int res = -1;
        Set<Map.Entry<Integer, Integer>> entries = integerMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() > length) {
                res = entry.getKey();
                break;
            }
        }
        return res;
    }

    /**
     * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
     * <p>
     *  
     * <p>
     * 示例 1:
     * <p>
     * 输入: nums = [1,2,3,1], k = 3
     * 输出: true
     * 示例 2:
     * <p>
     * 输入: nums = [1,0,1,1], k = 1
     * 输出: true
     * 示例 3:
     * <p>
     * 输入: nums = [1,2,3,1,2,3], k = 2
     * 输出: false
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/contains-duplicate-ii
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums
     * @param k
     * @return
     */
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
       /* Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> orDefault = map.getOrDefault(nums[i], new ArrayList<>());
            orDefault.add(i);
            map.put(nums[i], orDefault);
        }
        Set<Map.Entry<Integer, List<Integer>>> entries = map.entrySet();
        for (Map.Entry<Integer, List<Integer>> entry : entries) {
            if (entry.getValue().size() >= 2) {
                List<Integer> value = entry.getValue();
                for (int i = 0; i < value.size() - 1; i++) {
                    if (Math.abs(value.get(i) - value.get(i + 1)) <= k) {
                        return true;
                    }
                }
            }
        }
        return false;*/
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            // 如果当前滑动窗口包含当前的数字则直接返回true
            if (set.contains(nums[i])) return true;
            // 添加当前元素
            set.add(nums[i]);
            // 如果窗口大小大于k窗口向前移动一个位置
            if (set.size() > k) set.remove(nums[i - k]);
        }
        return false;

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ransomMap = new HashMap<>();
        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++)
            ransomMap.put(ransomNote.charAt(i), ransomMap.getOrDefault(ransomNote.charAt(i), 0) + 1);
        for (int i = 0; i < magazine.length(); i++)
            magazineMap.put(magazine.charAt(i), magazineMap.getOrDefault(magazine.charAt(i), 0) + 1);

        Set<Map.Entry<Character, Integer>> entries = ransomMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character key = entry.getKey();
            Integer valueR = entry.getValue();
            Integer valueM = magazineMap.getOrDefault(key, 0);
            if (valueR > valueM)
                return false;
        }
        return true;
    }

    /**
     * 给定两个字符串 s 和 t，判断它们是否是同构的。
     * <p>
     * 如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。
     * <p>
     * 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/isomorphic-strings
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param s
     * @param t
     * @return
     */
    public static boolean isIsomorphic(String s, String t) {
        // k为s的Character v为t的Character
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            // 如果不包含
            if (!map.containsKey(s.charAt(i))) {
                // 但是包含t的值，直接返回false
                if (map.containsValue(t.charAt(i)))
                    return false;
                map.put(s.charAt(i), t.charAt(i));
            } else {
                if (map.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
        }
        return true;
    }

  /*  public static boolean buddyStrings(String s, String goal) {
        // k为s的Character v为t的Character
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), goal.charAt(i));
        Set<Map.Entry<Character, Character>> entries = map.entrySet();
        int count = 0;
        if(s.length()!=goal.length())
            return false;
        if (map.size() == 1)
            return true;
        if (s.equals(goal) && s.length() > 2)
            return map.size() == s.length() ? false : true;
        for (Map.Entry<Character, Character> entry : entries) {
            Character sKey = entry.getKey();
            Character sValue = entry.getValue();
            if (sKey == sValue)
                continue;
            if (map.containsKey(sValue)) {
                Character gValue = map.get(sValue);
                if (sKey != gValue)
                    return false;
                else
                    count++;
            } else {
                return false;
            }
        }
        return count == 2 ? true : false;
    }*/

    public static boolean buddyStrings(String s, String goal) {
        // 如果长度不相等，直接返回false
        if (s.length() != goal.length())
            return false;
        if (s.equals(goal)) {
            Set<Character> characters = new HashSet<>();
            for (int i = 0; i < s.length(); i++)
                characters.add(s.charAt(i));
            if (characters.size() == s.length())
                return false;
            else
                return true;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    int u = s.indexOf(goal.charAt(i));
                    if (u == -1)
                        return false;
                    StringBuilder sb = new StringBuilder(s);
                    sb.setCharAt(i, goal.charAt(i));
                    sb.setCharAt(u, s.charAt(i));
                    String temp = sb.toString();
                    if (temp.equals(goal))
                        return true;
                }
            }
        }
        return false;

    }

    /**
     * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
     * <p>
     * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
     * <p>
     * 示例1:
     * <p>
     * 输入: pattern = "abba", str = "dog cat cat dog"
     * 输出: true
     * 示例 2:
     * <p>
     * 输入:pattern = "abba", str = "dog cat cat fish"
     * 输出: false
     * 示例 3:
     * <p>
     * 输入: pattern = "aaaa", str = "dog cat cat dog"
     * 输出: false
     * 示例 4:
     * <p>
     * 输入: pattern = "abba", str = "dog dog dog dog"
     * 输出: false
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/word-pattern
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param pattern
     * @param s
     * @return
     */
    public static boolean wordPattern(String pattern, String s) {

        String[] tempStrs = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        if (pattern.length() != tempStrs.length)
            return false;
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(tempStrs[i]))
                    return false;
                map.put(pattern.charAt(i), tempStrs[i]);
            } else {
                String temp = map.get(pattern.charAt(i));
                if (!temp.equals(tempStrs[i]))
                    return false;
            }
        }
        return true;
    }

    /**
     * 给定两个字符串 s 和 t，它们只包含小写字母。
     * <p>
     * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
     * <p>
     * 请找出在 t 中被添加的字母。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：s = "abcd", t = "abcde"
     * 输出："e"
     * 解释：'e' 是那个被添加的字母。
     * 示例 2：
     * <p>
     * 输入：s = "", t = "y"
     * 输出："y"
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/find-the-difference
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
        for (int i = 0; i < t.length(); i++)
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);

        Set<Map.Entry<Character, Integer>> entries = tMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character key = entry.getKey();
            if (!sMap.containsKey(key)) {
                return key;
            } else {
                Integer tValue = entry.getValue();
                Integer sValue = sMap.get(key);
                if (!tValue.equals(sValue))
                    return key;
            }
        }
        return ' ';
    }

    static Map<Integer, List<String>> map = new HashMap() {
        {
            put(2, new ArrayList() {{
                add("a");
                add("b");
                add("c");
            }});
            put(3, new ArrayList() {{
                add("d");
                add("e");
                add("f");
            }});
            put(4, new ArrayList() {{
                add("g");
                add("h");
                add("i");
            }});
            put(5, new ArrayList() {{
                add("j");
                add("k");
                add("l");
            }});
            put(6, new ArrayList() {{
                add("m");
                add("n");
                add("o");
            }});
            put(7, new ArrayList() {{
                add("p");
                add("q");
                add("r");
                add("s");
            }});
            put(8, new ArrayList() {{
                add("t");
                add("u");
                add("v");
            }});
            put(9, new ArrayList() {{
                add("w");
                add("x");
                add("y");
                add("z");
            }});
        }
    };

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0)
            return ans;
        List<List<String>> tempAns = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            tempAns.add(map.get(Integer.parseInt(digits.charAt(i) + "")));
        }
        if (digits.length() == 1)
            return tempAns.get(0);
        if (digits.length() == 2) {
            List<String> list1 = tempAns.get(0);
            List<String> list2 = tempAns.get(1);
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    ans.add(list1.get(i) + "" + list2.get(j));
                }
            }
        }
        if (digits.length() == 3) {
            List<String> list1 = tempAns.get(0);
            List<String> list2 = tempAns.get(1);
            List<String> list3 = tempAns.get(2);
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    for (int u = 0; u < list3.size(); u++) {
                        ans.add(list1.get(i) + list2.get(j) + list3.get(u));
                    }
                }
            }
        }
        if (digits.length() == 4) {
            List<String> list1 = tempAns.get(0);
            List<String> list2 = tempAns.get(1);
            List<String> list3 = tempAns.get(2);
            List<String> list4 = tempAns.get(3);
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list2.size(); j++) {
                    for (int u = 0; u < list3.size(); u++) {
                        for (int t = 0; t < list4.size(); t++) {
                            ans.add(list1.get(i) + list2.get(j) + list3.get(u) + list4.get(t));
                        }
                    }
                }
            }
        }
        return ans;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] help = new int[nums.length + 1];
        for (int num : nums) {
            help[num] = 1;
        }
        for (int i = 1; i < help.length; i++) {
            if (help[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            map2.put(list2[i], i);
        }
        Map<String, List<Integer>> temp = new HashMap<>();
        Set<Map.Entry<String, Integer>> entries = map1.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            if (map2.containsKey(key)) {
                Integer integer = map2.get(key);
                List<Integer> tempList = new ArrayList<>();
                tempList.add(entry.getValue());
                tempList.add(integer);
                temp.put(key, tempList);
            }
        }
        List<String> resTemp = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        Set<Map.Entry<String, List<Integer>>> entries1 = temp.entrySet();
        for (Map.Entry<String, List<Integer>> stringListEntry : entries1) {
            List<Integer> value = stringListEntry.getValue();
            Integer collect = value.stream().collect(Collectors.summingInt(item -> item.intValue()));
            if (collect < min) {
                resTemp.clear();
                resTemp.add(stringListEntry.getKey());
                min = collect;
            } else if (collect == min) {
                resTemp.add(stringListEntry.getKey());
            }
        }
        String[] ans = new String[resTemp.size()];
        for (int i = 0; i < resTemp.size(); i++) {
            ans[i] = resTemp.get(i);
        }
        return ans;
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        int length = s.length();
        boolean[] flag = new boolean[s.length() + 1];
        flag[0] = true;
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < i; j++) {
                if (flag[j] && wordDict.contains(s.substring(j, i))) {
                    flag[i] = true;
                    break;
                }
            }
        }
        return flag[length];
    }

    public static int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        Set<Integer> list = new HashSet<>();
        int sum = 0;
        int sumL = 0;
        int length = nums.length;
        for (int i = 1; i <= length; i++) {
            if (list.contains(nums[i - 1]))
                res[0] = nums[i - 1];
            else {
                list.add(nums[i - 1]);
                sumL += nums[i - 1];
            }
            sum += i;
        }
        res[1] = sum - sumL;
        return res;
    }

    public void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (Integer integer : row) {
            int temp = matrix[integer].length;
            for (int i = 0; i < temp; i++) {
                matrix[integer][i] = 0;
            }
        }
        for (Integer integer : col) {
            int length = matrix.length;
            for (int i = 0; i < length; i++) {
                matrix[i][integer] = 0;
            }
        }

    }

    public static List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        Map<Character, Integer> resMap = new HashMap<>();
        String word = words[0];
        for (int i = 0; i < word.length(); i++)
            resMap.put(word.charAt(i), resMap.getOrDefault(word.charAt(i), 0) + 1);
        for (int i = 1; i < words.length; i++) {
            String currentStr = words[i];
            Map<Character, Integer> currentMap = new HashMap<>();
            Map<Character, Integer> tempRes = new HashMap<>();
            for (int j = 0; j < currentStr.length(); j++)
                currentMap.put(currentStr.charAt(j), currentMap.getOrDefault(currentStr.charAt(j), 0) + 1);
            Set<Map.Entry<Character, Integer>> entries = resMap.entrySet();
            for (Map.Entry<Character, Integer> entry : entries) {
                Character key = entry.getKey();
                if (currentMap.containsKey(key))
                    tempRes.put(key, Math.min(currentMap.get(key), entry.getValue()));
            }
            resMap.clear();
            resMap = tempRes;

        }
        Set<Map.Entry<Character, Integer>> entries = resMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            for (Integer i = 0; i < value; i++)
                res.add(key + "");
        }
        return res;
    }

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int res = 0;
        int max = 1;
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int last = Integer.MIN_VALUE;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (last + 1 != next) {
                if (res > max)
                    max = res;
                res = 1;
                last = next;
            } else {
                last = next;
                res++;
            }
        }
        if (res > max)
            max = res;
        return max;
    }

    public int repeatedNTimes(int[] nums) {
        int length1 = nums.length;
        int length2 = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length1; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == length2) {
                res = entry.getKey();
                break;
            }
        }
        return res;
    }

    public ListNode detectCycle(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            if (list.contains(head))
                return head;
            list.add(head);
            head = head.next;
        }
        return null;
    }

    public static int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < stones.length(); i++)
            map.put(stones.charAt(i), map.getOrDefault(stones.charAt(i), 0) + 1);
        int res = 0;
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            characters.add(jewels.charAt(i));
        }
        Iterator<Character> iterator = characters.iterator();
        while (iterator.hasNext()) {
            Character next = iterator.next();
            if (map.containsKey(next)) {
                res += map.get(next);
            }
        }
        return res;
    }

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            for (int j : nums2) {
                map.put(i + j, map.getOrDefault(i + j, 0) + 1);
            }
        }
        for (int u : nums3) {
            for (int t : nums4) {
                if (map.containsKey(-(u + t))) {
                    res += map.get(-(u + t));
                }
            }
        }
        return res;
    }

    /**
     * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
     * <p>
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
     * <p>
     * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
     * <p>
     * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
     * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
     * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
     * 给你一个整数，将其转为罗马数字。
     * <p>
     *  
     * <p>
     * 示例 1:
     * <p>
     * 输入: num = 3
     * 输出: "III"
     * 示例 2:
     * <p>
     * 输入: num = 4
     * 输出: "IV"
     * 示例 3:
     * <p>
     * 输入: num = 9
     * 输出: "IX"
     * 示例 4:
     * <p>
     * 输入: num = 58
     * 输出: "LVIII"
     * 解释: L = 50, V = 5, III = 3.
     * 示例 5:
     * <p>
     * 输入: num = 1994
     * 输出: "MCMXCIV"
     * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/integer-to-roman
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            if (num >= 1000) {
                sb.append("M");
                num -= 1000;
            } else if (num >= 900 && num < 1000) {
                sb.append("CM");
                num -= 900;
            } else if (num >= 500 && num < 900) {
                sb.append("D");
                num -= 500;
            } else if (num >= 400 && num < 500) {
                sb.append("CD");
                num -= 400;
            } else if (num >= 100 && num < 400) {
                sb.append("C");
                num -= 100;
            } else if (num >= 90 && num < 100) {
                sb.append("XC");
                num -= 90;
            } else if (num >= 50 && num < 90) {
                sb.append("L");
                num -= 50;
            } else if (num >= 40 && num < 50) {
                sb.append("XL");
                num -= 40;
            } else if (num >= 10 && num < 40) {
                sb.append("X");
                num -= 10;
            } else if (num == 9) {
                sb.append("IX");
                num -= 9;
            } else if (num >= 5 && num < 9) {
                sb.append("V");
                num -= 5;
            } else if (num == 4) {
                sb.append("IV");
                num -= 4;
            } else {
                sb.append("I");
                num -= 1;
            }
        }
        return sb.toString();
    }

    /**
     * 给出一个字符串数组words组成的一本英语词典。从中找出最长的一个单词，该单词是由words词典中其他单词逐步添加一个字母组成。若其中有多个可行的答案，则返回答案中字典序最小的单词。
     * <p>
     * 若无答案，则返回空字符串。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：
     * words = ["w","wo","wor","worl", "world"]
     * 输出："world"
     * 解释：
     * 单词"world"可由"w", "wo", "wor", 和 "worl"添加一个字母组成。
     * 示例 2：
     * <p>
     * 输入：
     * words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
     * 输出："apple"
     * 解释：
     * "apply"和"apple"都能由词典中的单词组成。但是"apple"的字典序小于"apply"。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-word-in-dictionary
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param words
     * @return
     */
    public static String longestWord(String[] words) {
        Arrays.sort(words);
        String res = "";
        Set<String> set = new TreeSet<>();
        for (String word : words) {
            if (word.length() == 1) {
                if (res.length() < word.length())
                    res = word;
                set.add(word);
            } else {
                int len = word.length() - 1;
                if (set.contains(word.substring(0, len))) {
                    if (res.length() < word.length())
                        res = word;
                    set.add(word);
                }
            }
        }
        return res;
    }

    /**
     * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
     * <p>
     * 示例 1:
     * <p>
     * 输入:
     * "tree"
     * <p>
     * 输出:
     * "eert"
     * <p>
     * 解释:
     * 'e'出现两次，'r'和't'都只出现一次。
     * 因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
     * 示例 2:
     * <p>
     * 输入:
     * "cccaaa"
     * <p>
     * 输出:
     * "cccaaa"
     * <p>
     * 解释:
     * 'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
     * 注意"cacaca"是不正确的，因为相同的字母必须放在一起。
     * 示例 3:
     * <p>
     * 输入:
     * "Aabb"
     * <p>
     * 输出:
     * "bbAa"
     * <p>
     * 解释:
     * 此外，"bbaA"也是一个有效的答案，但"Aabb"是不正确的。
     * 注意'A'和'a'被认为是两种不同的字符。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/sort-characters-by-frequency
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param s
     * @return
     */
    public static String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        Map<Integer, List<Character>> integerCharacterMap = new TreeMap<>(Comparator.reverseOrder());
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            List<Character> orDefault = integerCharacterMap.getOrDefault(characterIntegerEntry.getValue(), new ArrayList<>());
            orDefault.add(characterIntegerEntry.getKey());
            integerCharacterMap.put(characterIntegerEntry.getValue(), orDefault);
        }
        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<Integer, List<Character>>> entries = integerCharacterMap.entrySet();
        for (Map.Entry<Integer, List<Character>> entry : entries) {
            for (Character character : entry.getValue()) {
                for (Integer i = 0; i < entry.getKey(); i++) {
                    sb.append(character);
                }
            }
        }
        return sb.toString();

    }

    /**
     * 句子 是一串由空格分隔的单词。每个 单词 仅由小写字母组成。
     * <p>
     * 如果某个单词在其中一个句子中恰好出现一次，在另一个句子中却 没有出现 ，那么这个单词就是 不常见的 。
     * <p>
     * 给你两个 句子 s1 和 s2 ，返回所有 不常用单词 的列表。返回列表中单词可以按 任意顺序 组织。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：s1 = "this apple is sweet", s2 = "this apple is sour"
     * 输出：["sweet","sour"]
     * 示例 2：
     * <p>
     * 输入：s1 = "apple apple", s2 = "banana"
     * 输出：["banana"]
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/uncommon-words-from-two-sentences
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param s1
     * @param s2
     * @return
     */
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] strList1 = s1.split(" ");
        String[] strList2 = s2.split(" ");
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < strList1.length; i++) {
            map1.put(strList1[i], map1.getOrDefault(strList1[i], 0) + 1);
        }

        for (int i = 0; i < strList2.length; i++) {
            map2.put(strList2[i], map2.getOrDefault(strList2[i], 0) + 1);
        }
        Set<String> set = new HashSet<>();
        Set<Map.Entry<String, Integer>> entries = map1.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == 1) {
                if (!map2.containsKey(entry.getKey())) {
                    set.add(entry.getKey());
                }
            }
        }
        Set<Map.Entry<String, Integer>> entries1 = map2.entrySet();
        for (Map.Entry<String, Integer> entry : entries1) {
            if (entry.getValue() == 1) {
                if (!map1.containsKey(entry.getKey())) {
                    set.add(entry.getKey());
                }
            }
        }
        String[] res = new String[set.size()];
        int index = 0;
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            res[index++] = iterator.next();
        }

        return res;
    }

    /**
     * 在一个小镇里，按从 1 到 n 为 n 个人进行编号。传言称，这些人中有一个是小镇上的秘密法官。
     * <p>
     * 如果小镇的法官真的存在，那么：
     * <p>
     * 小镇的法官不相信任何人。
     * 每个人（除了小镇法官外）都信任小镇的法官。
     * 只有一个人同时满足条件 1 和条件 2 。
     * 给定数组 trust，该数组由信任对 trust[i] = [a, b] 组成，表示编号为 a 的人信任编号为 b 的人。
     * <p>
     * 如果小镇存在秘密法官并且可以确定他的身份，请返回该法官的编号。否则，返回 -1。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：n = 2, trust = [[1,2]]
     * 输出：2
     * 示例 2：
     * <p>
     * 输入：n = 3, trust = [[1,3],[2,3]]
     * 输出：3
     * 示例 3：
     * <p>
     * 输入：n = 3, trust = [[1,3],[2,3],[3,1]]
     * 输出：-1
     * 示例 4：
     * <p>
     * 输入：n = 3, trust = [[1,2],[2,3]]
     * 输出：-1
     * 示例 5：
     * <p>
     * 输入：n = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
     * 输出：3
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/find-the-town-judge
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param n
     * @param trust
     * @return
     */
    public static int findJudge(int n, int[][] trust) {
        if (trust.length == 0 || trust == null)
            return n == 1 ? 1 : -1;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int[] ints : trust) {
            list1.add(ints[0]);
            list2.add(ints[1]);
        }
        List<Integer> collect = new ArrayList<>();
        Map<Integer, Long> collectMap = list2.stream().collect(Collectors.groupingBy(item -> item.intValue(), Collectors.counting()));
        Set<Map.Entry<Integer, Long>> entries = collectMap.entrySet();
        for (Map.Entry<Integer, Long> entry : entries) {
            if (entry.getValue() == n - 1 && !list1.contains(entry.getKey())) {
                collect.add(entry.getKey());
            }
        }
        if (collect.size() == 1)
            return collect.get(0);
        else
            return -1;
/*
        if (collect.containsKey(n - 1)) {
            List<Integer> list = collect.get(n - 1);
            List<Integer> collect1 = list1.stream().filter(item -> !list.contains(item)).collect(Collectors.toList());
            if (collect1.size() == 1)
                return collect1.get(0);
            return -1;
        } else {
            return -1;
        }*/


    }

    /**
     * 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 比如:
     * <p>
     * 'a' 对应 ".-" ，
     * 'b' 对应 "-..." ，
     * 'c' 对应 "-.-." ，以此类推。
     * 为了方便，所有 26 个英文字母的摩尔斯密码表如下：
     * <p>
     * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
     * 给你一个字符串数组 words ，每个单词可以写成每个字母对应摩尔斯密码的组合。
     * <p>
     * 例如，"cab" 可以写成 "-.-..--..." ，(即 "-.-." + ".-" + "-..." 字符串的结合)。我们将这样一个连接过程称作 单词翻译 。
     * 对 words 中所有单词进行单词翻译，返回不同 单词翻译 的数量。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入: words = ["gin", "zen", "gig", "msg"]
     * 输出: 2
     * 解释:
     * 各单词翻译如下:
     * "gin" -> "--...-."
     * "zen" -> "--...-."
     * "gig" -> "--...--."
     * "msg" -> "--...--."
     * <p>
     * 共有 2 种不同翻译, "--...-." 和 "--...--.".
     * 示例 2：
     * <p>
     * 输入：words = ["a"]
     * 输出：1
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/unique-morse-code-words
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param words
     * @return
     */
    public static int uniqueMorseRepresentations(String[] words) {
        String[] strings = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();
        String temp = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int u = 0; u < word.length(); u++) {
                temp += strings[word.charAt(u) - 'a'];
            }
            set.add(temp);
            temp = "";
        }
        return set.size();
    }

    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2)
                res.add(entry.getKey());
        }
        return res;

    }


    /**
     * 一条基因序列由一个带有8个字符的字符串表示，其中每个字符都属于 "A", "C", "G", "T"中的任意一个。
     * <p>
     * 假设我们要调查一个基因序列的变化。一次基因变化意味着这个基因序列中的一个字符发生了变化。
     * <p>
     * 例如，基因序列由"AACCGGTT" 变化至 "AACCGGTA" 即发生了一次基因变化。
     * <p>
     * 与此同时，每一次基因变化的结果，都需要是一个合法的基因串，即该结果属于一个基因库。
     * <p>
     * 现在给定3个参数 — start, end, bank，分别代表起始基因序列，目标基因序列及基因库，请找出能够使起始基因序列变化为目标基因序列所需的最少变化次数。如果无法实现目标变化，请返回 -1。
     * <p>
     * 注意：
     * <p>
     * 起始基因序列默认是合法的，但是它并不一定会出现在基因库中。
     * 如果一个起始基因序列需要多次变化，那么它每一次变化之后的基因序列都必须是合法的。
     * 假定起始基因序列与目标基因序列是不一样的。
     *  
     * <p>
     * 示例 1：
     * <p>
     * start: "AACCGGTT"
     * end:   "AACCGGTA"
     * bank: ["AACCGGTA"]
     * <p>
     * 返回值: 1
     * 示例 2：
     * <p>
     * start: "AACCGGTT"
     * end:   "AAACGGTA"
     * bank: ["AACCGGTA", "AACCGCTA", "AAACGGTA"]
     * <p>
     * 返回值: 2
     * 示例 3：
     * <p>
     * start: "AAAAACCC"
     * end:   "AACCCCCC"
     * bank: ["AAAACCCC", "AAACCCCC", "AACCCCCC"]
     * <p>
     * 返回值: 3
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/minimum-genetic-mutation
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int minMutation(String start, String end, String[] bank) {
        // 0. 如果两个相等直接返回
        if (start.equals(end))
            return 0;
        // 1.判断bank中是否包含end数
        boolean flag = Arrays.stream(bank).anyMatch(item -> item.equals(end));
        if (!flag)
            return -1;
        // 2.判断start和end不同的位置
        if (start.length() != end.length())
            return -1;
        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) != end.charAt(i)) {
                map.put(i, end.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder(start);
        // 判断每次是否包含
        int res = map.size();
        // 如果成功最少为map.size次
        for (int i = 0; i < res; i++) {
            boolean flagCurrent = false;
            // 每次都替换为当前
            for (Map.Entry<Integer, Character> entry : map.entrySet()) {
                // 本次替换前
                String tempStr = sb.toString();

                sb.setCharAt(entry.getKey(), entry.getValue());

                // 本次替换后
                String s = sb.toString();

                //判断本次替换在bank中是否存在
                boolean flagTemp = Arrays.stream(bank).anyMatch(item -> item.equals(s));
                // 如果包含当前值则本次成功进行更换
                if (flagTemp) {
                    flagCurrent = true;
                    map.remove(entry.getKey());
                    break;
                }
                // 如果不包含，则替换为最开始
                sb = new StringBuilder(tempStr);
            }
            if (!flagCurrent)
                return -1;
        }

        return res;

    }

    public void testTopVotedCandidate() {
        TopVotedCandidate topVotedCandidate = new TopVotedCandidate(new int[]{0, 1, 1, 0, 0, 1, 0}, new int[]{0, 5, 10, 15, 20, 25, 30});
        System.out.println(topVotedCandidate.q(3));
        System.out.println(topVotedCandidate.q(12));
        System.out.println(topVotedCandidate.q(25));
        System.out.println(topVotedCandidate.q(15));
        System.out.println(topVotedCandidate.q(24));
        System.out.println(topVotedCandidate.q(8));
       /* TopVotedCandidate topVotedCandidate = new TopVotedCandidate(new int[]{0,0,0,0,1},new int[]{0,6,39,52,75});
        System.out.println(topVotedCandidate.q(45));
        System.out.println(topVotedCandidate.q(49));
        System.out.println(topVotedCandidate.q(59));
        System.out.println(topVotedCandidate.q(68));
        System.out.println(topVotedCandidate.q(42));
        System.out.println(topVotedCandidate.q(37));
        System.out.println(topVotedCandidate.q(99));
        System.out.println(topVotedCandidate.q(26));
        System.out.println(topVotedCandidate.q(78));
        System.out.println(topVotedCandidate.q(43));*/
    }


    /**
     * 给定一个段落 (paragraph) 和一个禁用单词列表 (banned)。返回出现次数最多，同时不在禁用列表中的单词。
     * <p>
     * 题目保证至少有一个词不在禁用列表中，而且答案唯一。
     * <p>
     * 禁用列表中的单词用小写字母表示，不含标点符号。段落中的单词不区分大小写。答案都是小写字母。
     * <p>
     *  
     * <p>
     * 示例：
     * <p>
     * 输入:
     * paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
     * banned = ["hit"]
     * 输出: "ball"
     * 解释:
     * "hit" 出现了3次，但它是一个禁用的单词。
     * "ball" 出现了2次 (同时没有其他单词出现2次)，所以它是段落里出现次数最多的，且不在禁用列表中的单词。
     * 注意，所有这些单词在段落里不区分大小写，标点符号需要忽略（即使是紧挨着单词也忽略， 比如 "ball,"），
     * "hit"不是最终的答案，虽然它出现次数更多，但它在禁用单词列表中。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/most-common-word
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param paragraph
     * @param banned
     * @return
     */
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase().replace("!", " ").replace("?", " ").replace("'", " ").replace(",", " ").replace(";", " ").replace(".", " ").replace("  ", " ");
        String[] strings = paragraph.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            if (Character.isLetter(string.charAt(string.length() - 1))) {
                string = string.toLowerCase();
                map.put(string, map.getOrDefault(string, 0) + 1);
            }
        }
        String res = "";

        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        for (Map.Entry<String, Integer> entry : entries) {
            if (!Arrays.stream(banned).anyMatch(item -> entry.getKey().equals(item))) {
                res = entry.getKey();
                break;
            }
        }
        return res;
    }

    /**
     * 给定一副牌，每张牌上都写着一个整数。
     * <p>
     * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
     * <p>
     * 每组都有 X 张牌。
     * 组内所有的牌上都写着相同的整数。
     * 仅当你可选的 X >= 2 时返回 true。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：[1,2,3,4,4,3,2,1]
     * 输出：true
     * 解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]
     * 示例 2：
     * <p>
     * 输入：[1,1,1,2,2,2,3,3]
     * 输出：false
     * 解释：没有满足要求的分组。
     * 示例 3：
     * <p>
     * 输入：[1]
     * 输出：false
     * 解释：没有满足要求的分组。
     * 示例 4：
     * <p>
     * 输入：[1,1]
     * 输出：true
     * 解释：可行的分组是 [1,1]
     * 示例 5：
     * <p>
     * 输入：[1,1,2,2,2,2]
     * 输出：true
     * 解释：可行的分组是 [1,1]，[2,2]，[2,2]
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/x-of-a-kind-in-a-deck-of-cards
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param deck
     * @return
     */
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Long> collect = Arrays.stream(deck).boxed().collect(Collectors.groupingBy(item -> item.intValue(), Collectors.counting()));
        return collect.values().stream().reduce(this::divisor).get() > 1l;

    }

    // 辗转相除法
    public long divisor(long a, long b) {
        return b == 0 ? a : divisor(b, a % b);
    }

    /**
     * 给你一个字符串 s 和一个整数 k ，请你找出 s 中的最长子串， 要求该子串中的每一字符出现次数都不少于 k 。返回这一子串的长度。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：s = "aaabb", k = 3
     * 输出：3
     * 解释：最长子串为 "aaa" ，其中 'a' 重复了 3 次。
     * 示例 2：
     * <p>
     * 输入：s = "ababbc", k = 2
     * 输出：5
     * 解释：最长子串为 "ababb" ，其中 'a' 重复了 2 次， 'b' 重复了 3 次。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/longest-substring-with-at-least-k-repeating-characters
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param s
     * @param k
     * @return
     */
    public int longestSubstring(String s, int k) {
        // 统计每个字符出现的次数
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        // 查找到第一个小于k的字母
        String split = "";
        for (int i = 0; i < cnt.length; i++) {
            int count = cnt[i];
            if (count > 0 && count < k) {
                split = String.valueOf(i + 'a');
                break;
            }
        }

        // 如果都大于k则直接返回u 递归出口，当前字符串中不包含小于k的的字符
        if (split == "" || "".equals(split)) {
            return s.length();
        }
        String[] strings = s.split(split);
        int max = 0;
        // 进行递归判断知道找出最大，根据当前的k的字符进行分割，
        for (String string : strings) {
            int i = longestSubstring(string, k);
            max = Math.max(i, max);
        }
        return max;
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : arr1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int total = 0;
        for (int i : arr2) {
            Integer integer = map.get(i);
            for (Integer i1 = 0; i1 < integer; i1++) {
                res[total++] = i;
            }
            map.remove(i);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            for (Integer i = 0; i < value; i++) {
                res[total++] = key;
            }
        }
        return res;
    }

    public int repeatedNTimes_1(int[] nums) {
        Set<Integer> exist = new HashSet<>();
        for (int num : nums) {
            if (exist.contains(num))
                return num;
            else
                exist.add(num);
        }
        return -1;
    }

}



