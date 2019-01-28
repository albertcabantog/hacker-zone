/**
 * 
 */
package com.hacker.bst;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author Albert
 * 
 */
public class BinarySearchTree<Key extends Comparable<? super Key>, E>
		implements Map<Key, E> {
	private Key key;
	private E value;

	private BinarySearchTreeNode<Key, E> leftChild;
	private BinarySearchTreeNode<Key, E> rightChild;

	public BinarySearchTree(Key key, E value,
			BinarySearchTreeNode<Key, E> leftChild,
			BinarySearchTreeNode<Key, E> rightChild) {
		this.key = key;
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public Key getKey() {
		return this.key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public E getValue() {
		return this.value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public BinarySearchTreeNode<Key, E> getLeftChild() {
		return this.leftChild;
	}

	public void setLeftChild(BinarySearchTreeNode<Key, E> leftChild) {
		this.leftChild = leftChild;
	}

	public BinarySearchTreeNode<Key, E> getRightChild() {
		return this.rightChild;
	}

	public void setRightChild(BinarySearchTreeNode<Key, E> rightChild) {
		this.rightChild = rightChild;
	}

	public boolean isLeaf() {
		if (this.leftChild == null && this.rightChild == null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public E compute(Key arg0,
			BiFunction<? super Key, ? super E, ? extends E> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E computeIfAbsent(Key arg0, Function<? super Key, ? extends E> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E computeIfPresent(Key arg0,
			BiFunction<? super Key, ? super E, ? extends E> arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<java.util.Map.Entry<Key, E>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void forEach(BiConsumer<? super Key, ? super E> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public E get(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getOrDefault(Object arg0, E arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Key> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E merge(Key arg0, E arg1,
			BiFunction<? super E, ? super E, ? extends E> arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E put(Key arg0, E arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map<? extends Key, ? extends E> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public E putIfAbsent(Key arg0, E arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E replace(Key arg0, E arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean replace(Key arg0, E arg1, E arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void replaceAll(BiFunction<? super Key, ? super E, ? extends E> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<E> values() {
		// TODO Auto-generated method stub
		return null;
	}
}
