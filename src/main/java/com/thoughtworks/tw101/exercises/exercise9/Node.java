package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left, right;

    public Node(String name) {
        this.name = name;
    }

    public void add(String nameOfNewNode) {
        //If new-node is bigger, call add to node's right leaf
        if (nameOfNewNode.compareTo(name) > 0) {
            if (right == null) {
                right = new Node(nameOfNewNode);
            }
            else {
                right.add(nameOfNewNode);
            }
        }
        //If new-node is smaller, call add to node's left leaf
        else if (nameOfNewNode.compareTo(name) < 0) {
            if (left == null) {
                left = new Node(nameOfNewNode);
            }
            else {
                left.add(nameOfNewNode);
            }
        }

    }

    public List<String> names() {

        List<String> nameList = new ArrayList<String>();
        names(nameList, this);
        return nameList;
    }


    public void names(List<String> currentNames, Node currentNode) {
        if (currentNode != null) {
            names(currentNames, currentNode.left);
            currentNames.add(currentNode.name);
            names(currentNames, currentNode.right);
        }
    }

}

