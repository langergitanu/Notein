package com.aspose.slides.Collections.Generic;

/* JADX INFO: loaded from: classes3.dex */
public class LinkedListNode<T> {

    /* JADX INFO: renamed from: k4 */
    LinkedListNode<T> f1650k4;

    /* JADX INFO: renamed from: kk */
    private T f1651kk;

    /* JADX INFO: renamed from: to */
    private LinkedList<T> f1652to;

    /* JADX INFO: renamed from: x1 */
    LinkedListNode<T> f1653x1;

    public LinkedListNode(LinkedList<T> linkedList, T t) {
        this.f1652to = linkedList;
        this.f1651kk = t;
        this.f1650k4 = this;
        this.f1653x1 = this;
    }

    public LinkedList<T> getList() {
        return this.f1652to;
    }

    public LinkedListNode<T> getNext() {
        LinkedListNode<T> linkedListNode;
        LinkedList<T> linkedList = this.f1652to;
        if (linkedList == null || (linkedListNode = this.f1650k4) == linkedList.f1640k4) {
            return null;
        }
        return linkedListNode;
    }

    public LinkedListNode<T> getPrevious() {
        LinkedList<T> linkedList = this.f1652to;
        if (linkedList == null || this == linkedList.f1640k4) {
            return null;
        }
        return this.f1653x1;
    }

    public T getValue() {
        return this.f1651kk;
    }

    /* JADX INFO: renamed from: k4 */
    public void m843k4() {
        LinkedListNode<T> linkedListNode = this.f1653x1;
        linkedListNode.f1650k4 = this.f1650k4;
        this.f1650k4.f1653x1 = linkedListNode;
        this.f1653x1 = null;
        this.f1650k4 = null;
        this.f1652to = null;
    }

    public void setValue(T t) {
        this.f1651kk = t;
    }

    public LinkedListNode(LinkedList<T> linkedList, T t, LinkedListNode<T> linkedListNode, LinkedListNode<T> linkedListNode2) {
        this.f1652to = linkedList;
        this.f1651kk = t;
        this.f1653x1 = linkedListNode;
        this.f1650k4 = linkedListNode2;
        linkedListNode.f1650k4 = this;
        linkedListNode2.f1653x1 = this;
    }

    /* JADX INFO: renamed from: k4 */
    public void m844k4(LinkedList<T> linkedList) {
        this.f1650k4 = this;
        this.f1653x1 = this;
        this.f1652to = linkedList;
    }

    public LinkedListNode(T t) {
        this.f1651kk = t;
    }

    /* JADX INFO: renamed from: k4 */
    public void m845k4(LinkedListNode<T> linkedListNode, LinkedListNode<T> linkedListNode2, LinkedList<T> linkedList) {
        linkedListNode.f1650k4 = this;
        linkedListNode2.f1653x1 = this;
        this.f1650k4 = linkedListNode2;
        this.f1653x1 = linkedListNode;
        this.f1652to = linkedList;
    }
}
