package com.zetcode;
import java.awt.Color;
public class SnakeNode {
private int x;
private int y;
private Color c;
private SnakeNode next;
public SnakeNode() {
next = null;

}
public SnakeNode(int x, int y, Color c) {
this.x = x;
this.y = y;
this.c = c;
}
public int getX() {
return x;
}
public void setX(int x) {
this.x = x;
}
public int getY() {
return y;
}
public void setY(int y) {
this.y = y;
}
public Color getColor() {
return c;
}
public void setColor(Color c) {
this.c = c;
}
public SnakeNode getNext() {
return next;
}
public void setNext(SnakeNode next) {
this.next = next;

}
}
