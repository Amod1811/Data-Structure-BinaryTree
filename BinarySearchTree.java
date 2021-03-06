package com.bl.binarytree;

import java.util.Scanner;
/*
 * creating Binary search tree for inserting node 
 * @author : @mod Chaudhari 
 */
 
public class BinarySearchTree {

	public static void main(String[] args) {
		System.out.println("Welcome To Binary search Tree Program");
		System.out.println();
		
		//calling run method to perform insertion
		BinarySearchTree binarysearchtree = new BinarySearchTree();
		binarysearchtree.takeInput();
	}
		//Represent the node of BST
		static class Node {
			Node left;
			Node right;
			int number;
			
			//created constructor to insert value of number
			public Node(int number) {
				this.number=number;
			}
		}
		public void takeInput() {
			Node rootNode = new Node(56);
			System.out.println("Creating binary tree with root key ");
			System.out.println();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter how many nodes you want to add in binary tree : ");
			int nodeCount = sc.nextInt();
			System.out.println("Enter first value of root");
			for (int i = 0; i < nodeCount; i++) {
				System.out.println(" \nEnter node value : " + i);
				int key = sc.nextInt();
				insert(rootNode, key);
			
		}
			}
		/*
		 * Inserting node to left position if key of node is less than root node key and
		 * to right if grater than root node key the tree by comparing each time
		 */
		
		public void insert(Node node,int number) {
			if(number < node.number) {
				if(node.left!=null) {
					insert(node.left,number);
				}
				else {
					System.out.println("Inserted" + number + "to left of node " + node.number + "\n");
					node.left = new Node(number);
					
				}
			}
				else if (number > node.number) {
					if (node.right!=null) {
						insert(node.right,number);
					}
					else {
						System.out.println("Inserted" + number + "to right of node " + node.number + "\n");
						node.right = new Node(number);
					}
				}
			}
		}
	


