package 附加;

/*
题目描述：
你和你的朋友，两个人一起玩 Nim 游戏：桌子上有一堆石头，每次你们轮流拿掉 1 - 3 块石头。
拿掉最后一块石头的人就是获胜者。你作为先手。你们是聪明人，每一步都是最优解。
编写一个函数，来判断你是否可以在给定石头数量的情况下赢得游戏。
示例:
输入: 4
输出: false
解释: 如果堆中有 4 块石头，那么你永远不会赢得比赛；
     因为无论你拿走 1 块、2 块 还是 3 块石头，最后一块石头总是会被你的朋友拿走。
思路：了解博弈问题的必胜态，必败态，以及最终态
分析：
如果只有三颗以内的石子，那么无论先手怎么选择都是必胜的
如果有四颗石子，那么无论先手选择一、二、三颗石子，那么对手都能把剩下的拿走，因此先手必输
如果有四颗的基础上多一、二、三颗石子，那么先手可以选择拿出多的颗数，那么必然会将后手放在
“四颗先手”的状态
如果在四颗的基础上多四颗石子，那么无论先手如何选择，必然无法让后手变成“四颗先手”的状态，
后手选择一、二、三颗，必然可以使先手处于“四颗先手”的状态，就是必败态
依次类推：如果石子处于能够被四整除的状态，如果先手取出i个，那么后手可以取出4-i个，让先手处于
“四颗先手”的必败态，所以无论如果，只要石子数量是 4 的倍数，先手最终总会处于“四颗先手”的必败态。
故，只要石子颗数只要不是4个倍数，那么先手一定会赢。
 */
public class Solution {
    public boolean canWinNim(int n) {
        if (n % 4 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
