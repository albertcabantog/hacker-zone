package com.hacker.bst;

public interface BinNode<E> {
	public E getValue();
    public void setValue(E value);

    public BinNode<E> getLeftChild();

    public BinNode<E> getRightChild();

    public boolean isLeaf();
}
