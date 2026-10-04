package com.aspose.words;

import com.aspose.words.Node;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class NodeList<T extends Node> implements Iterable<T> {
    private java.util.List<Node> zzXVa;

    public NodeList(java.util.List<Node> list) {
        this.zzXVa = list;
    }

    public Node get(int i) {
        if ((i >= 0 || (i = i + getCount()) >= 0) && i < this.zzXVa.size()) {
            return this.zzXVa.get(i);
        }
        return null;
    }

    public int getCount() {
        return this.zzXVa.size();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.zzXVa.iterator();
    }

    public Node[] toArray() {
        int count = getCount();
        Node[] nodeArr = new Node[count];
        for (int i = 0; i < count; i++) {
            nodeArr[i] = get(i);
        }
        return nodeArr;
    }
}
