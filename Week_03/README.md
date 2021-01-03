##### 1. 递归的实现、特性以及思维要点

之前我们讲了很多树的数据结构，发现很多树的数据结构都是递归型的定义。所以这一课我们重点来讲递归，也就是所谓的泛型递归，以及树的递归。

之前的章节里面给大家讲了，一般树的题目都是使用递归来求解的。这主要是因为

一：它的节点和树本身它的数据结构的定义就是用树本身来进行的。

二：不仅是树本身，二叉树，以及搜索二叉树。他在定义他自身的数据结构和算法特性的时候，也是有重复性的。也就是【自相似性】

比如说二叉搜素树，他就是左子树都小于根节点，右子树都要大于根节点。

树的遍历的话，前中序遍历的话，就是一个递归的函数。

递归本身有哪些要注意的点。是本节的重点所在。

递归本质上类似于循环。汇编没有所谓的循环嵌套这一说，之前有指令写在什么地方，那就不断的跳到这个地方来执行。



##### 递归代码的四部分


1. 递归终结的条件
2. 处理当前层逻辑
3. 下探到下一层
4. 清理当前层


```
public void recur(int level, int param) { 
  // terminator   递归终结的条件
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); 
  // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 
 
}
```

##### 2   分治、回溯的实现和特性

- 分治和回溯其实本质上是递归，最后达到的效果就是碰到一个题目，就找他的重复性。
  重复性有【最近的重复性】或者是有所谓的【最优重复性】。
  最优重复性就是动态规划。
  最近重复性的话根据怎么构造，怎么分解就有 分治和回溯。

一个复杂的问题怎么解决呢？肯定是找重复性，找到重复性之后，就变成了若干的子问题。
那么这样理解呢就是一个分治算法。这样分治的本质呢，就是一个重复性。

- 为什么会这样呢，因为我们用的程序语言只支持  if else   for loop  和  recursion.

分治代码模板

```
private static int divide_conquer(Problem problem, ) {
    # recursion terminator 
    if (problem == NULL) {
        int res = process_last_result();
        return res; 
    }
    # prepare data
    subProblems = split_problem(problem)
    # conquer subproblems 
    res0 = divide_conquer(subProblems[0])
    res1 = divide_conquer(subProblems[1])
    # process and generate the final result 
    result = process_result(res0, res1);
    # revert the current level states
    return result;
}
```
