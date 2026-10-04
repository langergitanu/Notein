package com.aspose.slides.Collections.Generic;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p342pq.C9478du;
import com.aspose.slides.internal.p342pq.C9480kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class LinkedList<T> implements IGenericCollection<T> {

    /* JADX INFO: renamed from: k4 */
    LinkedListNode<T> f1640k4;

    /* JADX INFO: renamed from: kk */
    private long f1641kk;

    /* JADX INFO: renamed from: to */
    private final Object f1642to = new Object();

    /* JADX INFO: renamed from: x1 */
    private long f1643x1;

    public static class Enumerator<T> extends AbstractC7020m9<Enumerator> implements IGenericEnumerator<T>, IDisposable {

        /* JADX INFO: renamed from: k4 */
        static final /* synthetic */ boolean f1644k4 = true;

        /* JADX INFO: renamed from: du */
        private long f1645du;

        /* JADX INFO: renamed from: h4 */
        private C9480kk f1646h4;

        /* JADX INFO: renamed from: kk */
        private LinkedListNode<T> f1647kk;

        /* JADX INFO: renamed from: to */
        private int f1648to;

        /* JADX INFO: renamed from: x1 */
        private LinkedList<T> f1649x1;

        public Enumerator() {
        }

        public static boolean equals(Enumerator enumerator, Enumerator enumerator2) {
            return enumerator.equals(enumerator2);
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m842k4(Enumerator enumerator) {
            return C14067j2.m66728k4(enumerator.f1649x1, this.f1649x1) && C14067j2.m66728k4(enumerator.f1647kk, this.f1647kk) && enumerator.f1648to == this.f1648to && enumerator.f1645du == this.f1645du && C14067j2.m66728k4(enumerator.f1646h4, this.f1646h4);
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public Enumerator Clone() {
            Enumerator enumerator = new Enumerator();
            CloneTo(enumerator);
            return enumerator;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public void CloneTo(Enumerator enumerator) {
            enumerator.f1649x1 = this.f1649x1;
            enumerator.f1647kk = this.f1647kk;
            enumerator.f1648to = this.f1648to;
            enumerator.f1645du = this.f1645du;
            enumerator.f1646h4 = this.f1646h4;
        }

        public Object clone() {
            return Clone();
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public void dispose() {
            if (this.f1649x1 == null) {
                throw new ObjectDisposedException(null);
            }
            this.f1647kk = null;
            this.f1649x1 = null;
        }

        public void getObjectData(C9480kk c9480kk, C9478du c9478du) {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            if (this.f1649x1 == null) {
                throw new ObjectDisposedException(null);
            }
            if (C7019kk.m27435du(Long.valueOf(this.f1645du), 10) != C7019kk.m27435du(Long.valueOf(((LinkedList) this.f1649x1).f1641kk), 10)) {
                throw new InvalidOperationException("list modified");
            }
            LinkedListNode<T> linkedListNode = this.f1647kk;
            if (linkedListNode == null) {
                this.f1647kk = this.f1649x1.f1640k4;
            } else {
                LinkedListNode<T> linkedListNode2 = linkedListNode.f1650k4;
                this.f1647kk = linkedListNode2;
                if (linkedListNode2 == this.f1649x1.f1640k4) {
                    this.f1647kk = null;
                }
            }
            if (this.f1647kk == null) {
                this.f1648to = -1;
                return false;
            }
            this.f1648to++;
            return true;
        }

        public int hashCode() {
            LinkedList<T> linkedList = this.f1649x1;
            int iHashCode = (linkedList != null ? linkedList.hashCode() : 0) * 31;
            LinkedListNode<T> linkedListNode = this.f1647kk;
            int iHashCode2 = (((iHashCode + (linkedListNode != null ? linkedListNode.hashCode() : 0)) * 31) + this.f1648to) * 31;
            long j = this.f1645du;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            C9480kk c9480kk = this.f1646h4;
            return i + (c9480kk != null ? c9480kk.hashCode() : 0);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public T next() {
            if (this.f1649x1 == null) {
                throw new ObjectDisposedException(null);
            }
            LinkedListNode<T> linkedListNode = this.f1647kk;
            if (linkedListNode == null) {
                return null;
            }
            return linkedListNode.getValue();
        }

        public void onDeserialization(Object obj) {
            throw new NotSupportedException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            if (this.f1649x1 == null) {
                throw new ObjectDisposedException(null);
            }
            if (C7019kk.m27435du(Long.valueOf(this.f1645du), 10) != C7019kk.m27435du(Long.valueOf(((LinkedList) this.f1649x1).f1641kk), 10)) {
                throw new InvalidOperationException("list modified");
            }
            this.f1647kk = null;
            this.f1648to = -1;
        }

        public Enumerator(LinkedList<T> linkedList) {
            this.f1646h4 = null;
            this.f1649x1 = linkedList;
            this.f1647kk = null;
            this.f1648to = -1;
            this.f1645du = ((LinkedList) linkedList).f1641kk;
        }

        public boolean equals(Object obj) {
            if (!f1644k4 && obj == null) {
                throw new AssertionError();
            }
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof Enumerator) {
                return m842k4((Enumerator) obj);
            }
            return false;
        }
    }

    public LinkedList() {
    }

    /* JADX INFO: renamed from: x1 */
    private void m841x1(LinkedListNode<T> linkedListNode) {
        if (linkedListNode == null) {
            throw new ArgumentNullException("node");
        }
        if (linkedListNode.getList() != this) {
            throw new InvalidOperationException();
        }
    }

    public LinkedListNode<T> addAfter(LinkedListNode<T> linkedListNode, T t) {
        m841x1(linkedListNode);
        LinkedListNode<T> linkedListNode2 = new LinkedListNode<>(this, t, linkedListNode, linkedListNode.f1650k4);
        this.f1643x1++;
        this.f1641kk++;
        return linkedListNode2;
    }

    public LinkedListNode<T> addBefore(LinkedListNode<T> linkedListNode, T t) {
        m841x1(linkedListNode);
        LinkedListNode<T> linkedListNode2 = new LinkedListNode<>(this, t, linkedListNode.f1653x1, linkedListNode);
        this.f1643x1++;
        this.f1641kk++;
        if (linkedListNode == this.f1640k4) {
            this.f1640k4 = linkedListNode2;
        }
        return linkedListNode2;
    }

    public LinkedListNode<T> addFirst(T t) {
        LinkedListNode<T> linkedListNode = this.f1640k4;
        LinkedListNode<T> linkedListNode2 = linkedListNode == null ? new LinkedListNode<>(this, t) : new LinkedListNode<>(this, t, linkedListNode.f1653x1, linkedListNode);
        this.f1643x1++;
        this.f1641kk++;
        this.f1640k4 = linkedListNode2;
        return linkedListNode2;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void addItem(T t) {
        addLast(t);
    }

    public LinkedListNode<T> addLast(T t) {
        LinkedListNode<T> linkedListNode;
        LinkedListNode<T> linkedListNode2 = this.f1640k4;
        if (linkedListNode2 == null) {
            linkedListNode = new LinkedListNode<>(this, t);
            this.f1640k4 = linkedListNode;
        } else {
            linkedListNode = new LinkedListNode<>(this, t, linkedListNode2.f1653x1, linkedListNode2);
        }
        this.f1643x1++;
        this.f1641kk++;
        return linkedListNode;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void clear() {
        this.f1643x1 = C7019kk.m27435du((Object) 0, 9);
        this.f1640k4 = null;
        this.f1641kk++;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean containsItem(T t) {
        LinkedListNode<T> linkedListNode = this.f1640k4;
        if (linkedListNode == null) {
            return false;
        }
        while (!t.equals(C7019kk.m27451k4(linkedListNode.getValue()))) {
            linkedListNode = linkedListNode.f1650k4;
            if (linkedListNode == this.f1640k4) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        Object[] objArr = (Object[]) C7019kk.m27452k4(AbstractC14092to.m67212k4(abstractC14092to), Object[].class);
        if (objArr == null) {
            throw new ArgumentException("array");
        }
        copyToTArray(objArr, i);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void copyToTArray(T[] tArr, int i) {
        if (tArr == null) {
            throw new ArgumentNullException("array");
        }
        if (C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Integer.valueOf(i), 9)), 10) < C7019kk.m27435du(Long.valueOf(C7019kk.m27435du(Integer.valueOf(AbstractC14092to.m67208k4((Object) tArr).m67279x1(0)), 9)), 10)) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        if (AbstractC14092to.m67208k4((Object) tArr).m67277to() != 1) {
            throw new ArgumentException("array", "Array is multidimensional");
        }
        if (AbstractC14092to.m67208k4((Object) tArr).m67265du() < C7019kk.m27435du(Long.valueOf(this.f1643x1), 10)) {
            throw new ArgumentException("number of items exceeds capacity");
        }
        if (AbstractC14092to.m67208k4((Object) tArr).m67279x1(0) + (AbstractC14092to.m67208k4((Object) tArr).m67265du() - i) < C7019kk.m27435du(Long.valueOf(this.f1643x1), 10)) {
            throw new ArgumentOutOfRangeException("number of items exceeds capacity");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException();
        }
        LinkedListNode<T> linkedListNode = this.f1640k4;
        if (linkedListNode == null) {
            return;
        }
        do {
            tArr[i] = linkedListNode.getValue();
            i++;
            linkedListNode = linkedListNode.f1650k4;
        } while (linkedListNode != this.f1640k4);
    }

    public LinkedListNode<T> find(T t) {
        LinkedListNode<T> linkedListNode = this.f1640k4;
        if (linkedListNode == null) {
            return null;
        }
        do {
            if ((t == null && linkedListNode.getValue() == null) || (t != null && t.equals(C7019kk.m27451k4(linkedListNode.getValue())))) {
                return linkedListNode;
            }
            linkedListNode = linkedListNode.f1650k4;
        } while (linkedListNode != this.f1640k4);
        return null;
    }

    public LinkedListNode<T> findLast(T t) {
        LinkedListNode<T> linkedListNode = this.f1640k4;
        if (linkedListNode == null) {
            return null;
        }
        do {
            linkedListNode = linkedListNode.f1653x1;
            if (t.equals(C7019kk.m27451k4(linkedListNode.getValue()))) {
                return linkedListNode;
            }
        } while (linkedListNode != this.f1640k4);
        return null;
    }

    public LinkedListNode<T> getFirst() {
        return this.f1640k4;
    }

    public LinkedListNode<T> getLast() {
        LinkedListNode<T> linkedListNode = this.f1640k4;
        if (linkedListNode != null) {
            return linkedListNode.f1653x1;
        }
        return null;
    }

    public void getObjectData(C9480kk c9480kk, C9478du c9478du) {
        throw new NotSupportedException();
    }

    public Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean isReadOnly() {
        return false;
    }

    public boolean isSynchronized() {
        return false;
    }

    public void onDeserialization(Object obj) {
        throw new NotSupportedException();
    }

    public void remove(LinkedListNode<T> linkedListNode) {
        m841x1(linkedListNode);
        long j = this.f1643x1 - 1;
        this.f1643x1 = j;
        if (C7019kk.m27435du(Long.valueOf(j), 10) == 0) {
            this.f1640k4 = null;
        }
        LinkedListNode<T> linkedListNode2 = this.f1640k4;
        if (linkedListNode == linkedListNode2) {
            this.f1640k4 = linkedListNode2.f1650k4;
        }
        this.f1641kk++;
        linkedListNode.m843k4();
    }

    public void removeFirst() {
        LinkedListNode<T> linkedListNode = this.f1640k4;
        if (linkedListNode != null) {
            remove(linkedListNode);
        }
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean removeItem(T t) {
        LinkedListNode<T> linkedListNodeFind = find(t);
        if (linkedListNodeFind == null) {
            return false;
        }
        remove(linkedListNodeFind);
        return true;
    }

    public void removeLast() {
        LinkedListNode<T> linkedListNode = this.f1640k4;
        if (linkedListNode != null) {
            remove(linkedListNode.f1653x1);
        }
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public int size() {
        return C7019kk.m27462to(Long.valueOf(this.f1643x1), 10);
    }

    public LinkedList(IGenericEnumerable<T> iGenericEnumerable) {
        Iterator<T> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            addLast(it.next());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m840k4(LinkedListNode linkedListNode) {
        if (linkedListNode == null) {
            throw new ArgumentNullException("newNode");
        }
        if (linkedListNode.getList() != null) {
            throw new InvalidOperationException();
        }
    }

    public void addAfter(LinkedListNode<T> linkedListNode, LinkedListNode<T> linkedListNode2) {
        m841x1(linkedListNode);
        m840k4(linkedListNode2);
        linkedListNode2.m845k4(linkedListNode, linkedListNode.f1650k4, this);
        this.f1643x1++;
        this.f1641kk++;
    }

    public void addBefore(LinkedListNode<T> linkedListNode, LinkedListNode<T> linkedListNode2) {
        m841x1(linkedListNode);
        m840k4(linkedListNode2);
        linkedListNode2.m845k4(linkedListNode.f1653x1, linkedListNode, this);
        this.f1643x1++;
        this.f1641kk++;
        if (linkedListNode == this.f1640k4) {
            this.f1640k4 = linkedListNode2;
        }
    }

    public void addFirst(LinkedListNode<T> linkedListNode) {
        m840k4(linkedListNode);
        LinkedListNode<T> linkedListNode2 = this.f1640k4;
        if (linkedListNode2 == null) {
            linkedListNode.m844k4(this);
        } else {
            linkedListNode.m845k4(linkedListNode2.f1653x1, linkedListNode2, this);
        }
        this.f1643x1++;
        this.f1641kk++;
        this.f1640k4 = linkedListNode;
    }

    public void addLast(LinkedListNode<T> linkedListNode) {
        m840k4(linkedListNode);
        LinkedListNode<T> linkedListNode2 = this.f1640k4;
        if (linkedListNode2 == null) {
            linkedListNode.m844k4(this);
            this.f1640k4 = linkedListNode;
        } else {
            linkedListNode.m845k4(linkedListNode2.f1653x1, linkedListNode2, this);
        }
        this.f1643x1++;
        this.f1641kk++;
    }

    @Override // java.lang.Iterable
    public Enumerator iterator() {
        return new Enumerator(this);
    }

    public LinkedList(C9480kk c9480kk, C9478du c9478du) {
        throw new NotSupportedException();
    }
}
