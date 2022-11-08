package com.greatlearning.sumOfBST;

import java.util.ArrayList;
import java.util.Scanner;

import org.w3c.dom.NodeList;

public class CalculateSum {
	ArrayList<Integer> nodeList = new ArrayList<>();

	public static Node newNode(int data) {
		Node temp = new Node();
		temp.left = null;
		temp.data = data;
		temp.right = null;

		return temp;
	}

	public void insert(Node root, Node data) {
		if (data.data < root.data) {
			if (root.left == null) {
				root.left = data;
			} else {
				insert(root.left, data);
			}
		} else {
			if (root.right == null) {
				root.right = data;
			} else {
				insert(root.right, data);
			}
		}
	}

	public void traverse(Node root) {
		if (root != null) {
			traverse(root.left);
			nodeList.add(root.data);
			traverse(root.right);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculateSum cs = new CalculateSum();
		Node root = null;
		Node nodeData = null;
		System.out.println("Enter the number of nodes");
		int totalNodes = sc.nextInt();
		for (int i = 1; i <= totalNodes; i++) {
			System.out.println("Enter the data of the Node");
			int data = sc.nextInt();
			nodeData = newNode(data);
			if (root == null) {
				root = nodeData;
			} else {
				cs.insert(root, nodeData);
			}
		}

		cs.traverse(root);
		System.out.println("Enter sum");
		int sum = sc.nextInt();
		int flag = 0;

		for (int i = 0; i < cs.nodeList.size(); i++) {
			if (cs.nodeList.contains(sum - cs.nodeList.get(i))) {
				System.out.println("Pair found [" + cs.nodeList.get(i) + "," + (sum - cs.nodeList.get(i)) + "]");
				flag = 1;
				break;
			}

		}
		if (flag == 0) {
			System.out.println("No pair found");
		}

		sc.close();
	}

}
