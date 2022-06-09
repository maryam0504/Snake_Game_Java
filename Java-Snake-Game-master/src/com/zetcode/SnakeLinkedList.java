package com.zetcode;
import java.awt.Color;
public class SnakeLinkedList {
SnakeNode head = null;
public void addHead(int x, int y, Color c) {
head = new SnakeNode(x, y, c);
}
public void addJoint(int x, int y, Color c) {
SnakeNode newJoint = new SnakeNode(x, y, c);
newJoint.setNext(head.getNext());
head.setNext(newJoint);
}
public void addTail(Color c) {
SnakeNode curr = head;
while (curr.getNext() != null) {
curr = curr.getNext();
}
SnakeNode newJoint = new SnakeNode(curr.getX() + 10, curr.getY() + 10, c);
curr.setNext(newJoint);
}
public SnakeNode getHead() {
return head;
}
public SnakeNode getJoint(int i) {
SnakeNode curr = head;
for (int k = 0; k < i; k++) {
curr = curr.getNext();

}
return curr;
}
public void addFirst(SnakeNode node) {
node.setNext(head);
head = node;
}
public void addLast(SnakeNode node) {
if (head == null) {
head = node;
return;
}
SnakeNode curr = head;
while (curr.getNext() != null) {
curr = curr.getNext();
}
curr.setNext(node);
}
public void snakeMove(int dots, boolean leftDirection, boolean rightDirection, boolean upDirection, boolean
downDirection, final int DOT_SIZE) {
// write your code based on the move() method in Board.java
  for (int z = dots-1; z > 0; z--) {
    getJoint(z).setX(getJoint(z-1).getX());
    getJoint(z).setY(getJoint(z-1).getY());
    
  }
  if (leftDirection) {
    getHead().setX(getHead().getX() - DOT_SIZE);
  }
  if (rightDirection) {
    getHead().setX(getHead().getX() + DOT_SIZE);
  }
  if (upDirection) {
    getHead().setY(getHead().getY() - DOT_SIZE);
  }
  if (downDirection) {
    getHead().setY(getHead().getY() + DOT_SIZE);
  }
}
}