package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.ArrayTypeMismatchException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class Queue<T> implements IGenericEnumerable<T>, ICollection<T> {

    /* JADX INFO: renamed from: du */
    private int f1677du;

    /* JADX INFO: renamed from: h4 */
    private final Object f1678h4;

    /* JADX INFO: renamed from: k4 */
    private Object[] f1679k4;

    /* JADX INFO: renamed from: kk */
    private int f1680kk;

    /* JADX INFO: renamed from: to */
    private int f1681to;

    /* JADX INFO: renamed from: x1 */
    private int f1682x1;

    public static class Enumerator<T> extends AbstractC7020m9<Enumerator> implements IGenericEnumerator<T>, IDisposable {

        /* JADX INFO: renamed from: k4 */
        static final /* synthetic */ boolean f1683k4 = true;

        /* JADX INFO: renamed from: kk */
        private int f1684kk;

        /* JADX INFO: renamed from: to */
        private int f1685to;

        /* JADX INFO: renamed from: x1 */
        private Queue<T> f1686x1;

        public Enumerator() {
        }

        public static boolean equals(Enumerator enumerator, Enumerator enumerator2) {
            return enumerator.equals(enumerator2);
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m876k4(Enumerator enumerator) {
            return C14067j2.m66728k4(enumerator.f1686x1, this.f1686x1) && enumerator.f1684kk == this.f1684kk && enumerator.f1685to == this.f1685to;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public Enumerator Clone() {
            Enumerator enumerator = new Enumerator();
            CloneTo(enumerator);
            return enumerator;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public void CloneTo(Enumerator enumerator) {
            enumerator.f1686x1 = this.f1686x1;
            enumerator.f1684kk = this.f1684kk;
            enumerator.f1685to = this.f1685to;
        }

        public Object clone() {
            return Clone();
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public void dispose() {
            this.f1684kk = -2;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            if (this.f1685to != ((Queue) this.f1686x1).f1677du) {
                throw new InvalidOperationException();
            }
            if (this.f1684kk == -2) {
                this.f1684kk = ((Queue) this.f1686x1).f1681to;
            }
            int i = this.f1684kk;
            if (i == -1) {
                return false;
            }
            int i2 = i - 1;
            this.f1684kk = i2;
            return i2 != -1;
        }

        public int hashCode() {
            Queue<T> queue = this.f1686x1;
            return ((((queue != null ? queue.hashCode() : 0) * 31) + this.f1684kk) * 31) + this.f1685to;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public T next() {
            if (this.f1684kk < 0) {
                throw new InvalidOperationException();
            }
            return (T) ((Queue) this.f1686x1).f1679k4[(((Queue) this.f1686x1).f1682x1 + ((((Queue) this.f1686x1).f1681to - 1) - this.f1684kk)) % ((Queue) this.f1686x1).f1679k4.length];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            if (this.f1685to != ((Queue) this.f1686x1).f1677du) {
                throw new InvalidOperationException();
            }
            this.f1684kk = -2;
        }

        public Enumerator(Queue<T> queue) {
            this.f1686x1 = queue;
            this.f1684kk = -2;
            this.f1685to = ((Queue) queue).f1677du;
        }

        public boolean equals(Object obj) {
            if (!f1683k4 && obj == null) {
                throw new AssertionError();
            }
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof Enumerator) {
                return m876k4((Enumerator) obj);
            }
            return false;
        }
    }

    public Queue() {
        this.f1679k4 = new Object[0];
        this.f1678h4 = this;
    }

    public void clear() {
        Object[] objArr = this.f1679k4;
        AbstractC14092to.m67232k4(objArr, 0, objArr.length);
        this.f1681to = 0;
        this.f1680kk = 0;
        this.f1682x1 = 0;
        this.f1677du++;
    }

    public boolean contains(T t) {
        if (t == null) {
            Iterator<T> it = iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        Iterator<T> it2 = iterator();
        while (it2.hasNext()) {
            if (t.equals(it2.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException();
        }
        if ((((long) i) & 4294967295L) > (4294967295L & ((long) abstractC14092to.m67265du()))) {
            throw new ArgumentOutOfRangeException();
        }
        int iM67265du = abstractC14092to.m67265du() - i;
        int i2 = this.f1681to;
        if (iM67265du < i2) {
            throw new ArgumentException();
        }
        if (i2 == 0) {
            return;
        }
        try {
            Object[] objArr = this.f1679k4;
            int length = objArr.length - this.f1682x1;
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) objArr), this.f1682x1, abstractC14092to, i, C14116yg.m67507x1(this.f1681to, length));
            if (this.f1681to > length) {
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f1679k4), 0, abstractC14092to, i + length, this.f1681to - length);
            }
        } catch (ArrayTypeMismatchException unused) {
            throw new ArgumentException();
        }
    }

    public T dequeue() {
        T tPeek = peek();
        Object[] objArr = this.f1679k4;
        int i = this.f1682x1;
        objArr[i] = null;
        int i2 = i + 1;
        this.f1682x1 = i2;
        if (i2 == objArr.length) {
            this.f1682x1 = 0;
        }
        this.f1681to--;
        this.f1677du++;
        return tPeek;
    }

    public void enqueue(T t) {
        int i = this.f1681to;
        Object[] objArr = this.f1679k4;
        if (i == objArr.length || this.f1680kk == objArr.length) {
            m872k4(C14116yg.m67483k4(C14116yg.m67483k4(i, this.f1680kk) * 2, 4));
        }
        Object[] objArr2 = this.f1679k4;
        int i2 = this.f1680kk;
        objArr2[i2] = t;
        int i3 = i2 + 1;
        this.f1680kk = i3;
        if (i3 == objArr2.length) {
            this.f1680kk = 0;
        }
        this.f1681to++;
        this.f1677du++;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this.f1678h4;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return false;
    }

    public T peek() {
        if (this.f1681to != 0) {
            return (T) this.f1679k4[this.f1682x1];
        }
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f1681to;
    }

    public T[] toArray(T[] tArr) {
        int length = tArr.length;
        int i = this.f1681to;
        if (length < i) {
            return (T[]) Arrays.copyOf(this.f1679k4, i, tArr.getClass());
        }
        System.arraycopy(this.f1679k4, 0, tArr, 0, i);
        int length2 = tArr.length;
        int i2 = this.f1681to;
        if (length2 > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public void trimExcess() {
        int i = this.f1681to;
        if (i < ((double) this.f1679k4.length) * 0.9d) {
            m872k4(i);
        }
    }

    public Queue(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("capacity");
        }
        this.f1679k4 = new Object[i];
        this.f1678h4 = this;
    }

    /* JADX INFO: renamed from: k4 */
    private void m872k4(int i) {
        if (i == this.f1679k4.length) {
            return;
        }
        int i2 = this.f1681to;
        if (i < i2) {
            throw new InvalidOperationException("shouldnt happen");
        }
        Object[] objArr = new Object[i];
        if (i2 > 0) {
            copyTo(AbstractC14092to.m67208k4((Object) objArr), 0);
        }
        this.f1679k4 = objArr;
        this.f1680kk = this.f1681to;
        this.f1682x1 = 0;
        this.f1677du++;
    }

    @Override // java.lang.Iterable
    public Enumerator iterator() {
        return new Enumerator(this);
    }

    public Queue(IGenericEnumerable<T> iGenericEnumerable) {
        if (iGenericEnumerable == null) {
            throw new ArgumentNullException("collection");
        }
        IGenericCollection iGenericCollection = iGenericEnumerable instanceof IGenericCollection ? (IGenericCollection) iGenericEnumerable : null;
        this.f1679k4 = new Object[iGenericCollection != null ? iGenericCollection.size() : 0];
        Iterator<T> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            enqueue(it.next());
        }
        this.f1678h4 = this;
    }
}
