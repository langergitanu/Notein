package com.aspose.words.internal;

import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQC<E> extends Stack<E> {

    public class zzZ implements Iterator<E> {
        private int zz3d;
        private Stack<E> zz3e;

        public zzZ(Stack<E> stack) {
            this.zz3e = stack;
            this.zz3d = stack.size();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.zz3d > 0;
        }

        @Override // java.util.Iterator
        public final E next() {
            Stack<E> stack = this.zz3e;
            int i = this.zz3d - 1;
            this.zz3d = i;
            return stack.elementAt(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.zz3e.remove(this.zz3d);
        }
    }

    public zzZQC() {
    }

    @Override // java.util.Vector, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return new zzZ(this);
    }

    public zzZQC(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            push(it.next());
        }
    }
}
