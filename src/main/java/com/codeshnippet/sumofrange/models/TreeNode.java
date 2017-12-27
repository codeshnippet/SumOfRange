package com.codeshnippet.sumofrange.models;

public class TreeNode {

    private final TreeNode left;
    private final TreeNode right;
    private final int data;
    private final Range range;

    public TreeNode(TreeNode left, TreeNode right, Range range, int data) {
        this.left = left;
        this.right = right;
        this.range = range;
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public Range getRange() {
        return range;
    }

    public int getData() {
        return data;
    }
}
