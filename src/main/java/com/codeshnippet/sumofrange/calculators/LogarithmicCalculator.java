package com.codeshnippet.sumofrange.calculators;

import com.codeshnippet.sumofrange.models.Range;
import com.codeshnippet.sumofrange.models.TreeNode;

public class LogarithmicCalculator {

    private final LinearCalculator linearCalculator;
    private final TreeNode root;

    public LogarithmicCalculator(int[] input) {
        this.linearCalculator = new LinearCalculator();
        this.root = buildTree(input, 0, input.length);
    }

    public int calculate(int startInclusive, int endExclusive) {
        return findSum(root, startInclusive, endExclusive);
    }

    private TreeNode buildTree(int[] input, int start, int end) {
        if(end - start <= 1){
            return new TreeNode(null, null, Range.of(start, end), input[start]);
        }

        int middle = start + (end - start) / 2;
        TreeNode left = buildTree(input, start, middle);
        TreeNode right = buildTree(input, middle, end);
        int sum = linearCalculator.calculate(input, start, end);
        return new TreeNode(left, right, Range.of(start, end), sum);
    }

    private int findSum(TreeNode node, int start, int end) {
        if(node.getRange().isCompletelyWithin(Range.of(start, end))) {
            // Case 1
            return node.getData();
        } else if(node.getRange().isCompletelyOutside(Range.of(start, end))){
            // Case 2
            return 0;
        }
        // Case 3
        return findSum(node.getLeft(), start, end) + findSum(node.getRight(), start, end);
    }
}
