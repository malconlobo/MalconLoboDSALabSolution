package com.greatlearning.main;

import java.util.*;

class Node {
	int data;
	Node left, right;

	Node(int val) {
		data = val;
		left = right = null;
	}
}

public class Driver2 {

	private static ArrayList<Integer> path = new ArrayList<>();
	private static ArrayList<Integer> maxPath = new ArrayList<>();

	public static void main(String[] args) {

		Node node1 = new Node(100);
		Node node2 = new Node(20);
		Node node3 = new Node(130);
		Node node4 = new Node(10);
		Node node5 = new Node(50);
		Node node6 = new Node(110);
		Node node7 = new Node(140);
		Node node8 = new Node(5);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		node4.left = node8;

		findMaxPath(node1);
		System.out.println(maxPath);

	}

	private static void findMaxPath(Node node) {
		// TODO Auto-generated method stub
		
		if(node == null) {
			return;
		}
		
		if (node.right == null && node.left == null) {
			path.add(node.data);
			if (path.size() > maxPath.size()) {
				maxPath.clear();
				maxPath.addAll(path);
			}
			return;
		}

		path.add(node.data);
		if (node.left != null) {
			findMaxPath(node.left);
			path.remove(path.size() - 1);
		}
		if (node.right != null) {
			findMaxPath(node.right);
			path.remove(path.size() - 1);
		}

		return;
	}

}
