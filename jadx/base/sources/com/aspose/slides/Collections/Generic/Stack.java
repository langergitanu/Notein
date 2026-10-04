package com.aspose.slides.Collections.Generic;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.ArrayTypeMismatchException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14118yn;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class Stack<T> implements IGenericEnumerable<T>, ICollection<T> {

    /* JADX INFO: renamed from: k4 */
    private Object[] f1774k4;

    /* JADX INFO: renamed from: kk */
    private int f1775kk;

    /* JADX INFO: renamed from: x1 */
    private int f1776x1;

    public static class Enumerator<T> extends AbstractC7020m9<Enumerator> implements IGenericEnumerator<T>, IDisposable {

        /* JADX INFO: renamed from: k4 */
        static final /* synthetic */ boolean f1777k4 = true;

        /* JADX INFO: renamed from: kk */
        private int f1778kk;

        /* JADX INFO: renamed from: to */
        private int f1779to;

        /* JADX INFO: renamed from: x1 */
        private Stack<T> f1780x1;

        public Enumerator() {
        }

        public static boolean equals(Enumerator enumerator, Enumerator enumerator2) {
            return enumerator.equals(enumerator2);
        }

        /* JADX INFO: renamed from: k4 */
        private boolean m979k4(Enumerator enumerator) {
            return C14067j2.m66728k4(enumerator.f1780x1, this.f1780x1) && enumerator.f1778kk == this.f1778kk && enumerator.f1779to == this.f1779to;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public Enumerator Clone() {
            Enumerator enumerator = new Enumerator();
            CloneTo(enumerator);
            return enumerator;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        public void CloneTo(Enumerator enumerator) {
            enumerator.f1780x1 = this.f1780x1;
            enumerator.f1778kk = this.f1778kk;
            enumerator.f1779to = this.f1779to;
        }

        public Object clone() {
            return Clone();
        }

        @Override // com.aspose.slides.p559ms.System.IDisposable
        public void dispose() {
            this.f1778kk = -1;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            if (this.f1779to != ((Stack) this.f1780x1).f1775kk) {
                throw new IllegalStateException();
            }
            if (this.f1778kk == -2) {
                this.f1778kk = ((Stack) this.f1780x1).f1776x1;
            }
            int i = this.f1778kk;
            if (i == -1) {
                return false;
            }
            int i2 = i - 1;
            this.f1778kk = i2;
            return i2 != -1;
        }

        public int hashCode() {
            Stack<T> stack = this.f1780x1;
            return ((((stack != null ? stack.hashCode() : 0) * 31) + this.f1778kk) * 31) + this.f1779to;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public T next() {
            if (this.f1778kk >= 0) {
                return (T) ((Stack) this.f1780x1).f1774k4[this.f1778kk];
            }
            throw new InvalidOperationException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            if (this.f1779to != ((Stack) this.f1780x1).f1775kk) {
                throw new IllegalStateException();
            }
            this.f1778kk = -2;
        }

        public Enumerator(Stack<T> stack) {
            this.f1780x1 = stack;
            this.f1778kk = -2;
            this.f1779to = ((Stack) stack).f1775kk;
        }

        public boolean equals(Object obj) {
            if (!f1777k4 && obj == null) {
                throw new AssertionError();
            }
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof Enumerator) {
                return m979k4((Enumerator) obj);
            }
            return false;
        }
    }

    public Stack() {
    }

    public void clear() {
        Object[] objArr = this.f1774k4;
        if (objArr != null) {
            AbstractC14092to.m67232k4(objArr, 0, objArr.length);
        }
        this.f1776x1 = 0;
        this.f1775kk++;
    }

    public boolean contains(T t) {
        Object[] objArr = this.f1774k4;
        return (objArr == null || AbstractC14092to.m67202k4(objArr, t, 0, this.f1776x1) == -1) ? false : true;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        try {
            if (abstractC14092to == null) {
                throw new ArgumentNullException();
            }
            if (this.f1774k4 != null) {
                if (i < 0) {
                    throw new ArgumentOutOfRangeException("idx");
                }
                int i2 = this.f1776x1;
                if (i >= i2) {
                    throw new ArgumentOutOfRangeException("idx");
                }
                if (i2 - i > abstractC14092to.m67265du()) {
                    throw new ArgumentException("idx");
                }
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f1774k4), 0, abstractC14092to, i, this.f1776x1);
                AbstractC14092to.m67259x1(abstractC14092to, i, this.f1776x1);
            }
        } catch (ArrayTypeMismatchException unused) {
            throw new ArgumentException();
        }
    }

    public void copyToTArray(T[] tArr, int i) {
        if (tArr == null) {
            throw new ArgumentNullException("array");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("idx");
        }
        if (i >= tArr.length) {
            throw new ArgumentOutOfRangeException("idx");
        }
        int i2 = this.f1776x1;
        if (i2 - i > tArr.length) {
            throw new ArgumentException("idx");
        }
        Object[] objArr = this.f1774k4;
        if (objArr != null) {
            AbstractC14092to.m67234k4(objArr, 0, tArr, i, i2);
            C14118yn.m67559k4(tArr, i, this.f1776x1);
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return false;
    }

    public T peek() {
        int i = this.f1776x1;
        if (i != 0) {
            return (T) this.f1774k4[i - 1];
        }
        throw new InvalidOperationException();
    }

    public T pop() {
        int i = this.f1776x1;
        if (i == 0) {
            throw new InvalidOperationException();
        }
        this.f1775kk++;
        Object[] objArr = this.f1774k4;
        int i2 = i - 1;
        this.f1776x1 = i2;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        return t;
    }

    public void push(T t) {
        Object[] objArr = this.f1774k4;
        if (objArr == null || this.f1776x1 == objArr.length) {
            if (objArr == null) {
                this.f1774k4 = new Object[16];
            }
            Object[] objArr2 = this.f1774k4;
            int i = this.f1776x1;
            this.f1774k4 = Arrays.copyOf(objArr2, i != 0 ? i * 2 : 16);
        }
        this.f1775kk++;
        Object[] objArr3 = this.f1774k4;
        int i2 = this.f1776x1;
        this.f1776x1 = i2 + 1;
        objArr3[i2] = t;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f1776x1;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length >= this.f1776x1) {
            copyTo(AbstractC14092to.m67208k4((Object) tArr), 0);
            return tArr;
        }
        AbstractC14092to abstractC14092toM67205k4 = AbstractC14092to.m67205k4(C7019kk.m27443k4(tArr.getClass().getComponentType()), this.f1776x1);
        copyTo(abstractC14092toM67205k4, 0);
        return (T[]) ((Object[]) AbstractC14092to.m67212k4(abstractC14092toM67205k4));
    }

    public void trimExcess() {
        Object[] objArr = this.f1774k4;
        if (objArr != null) {
            int i = this.f1776x1;
            if (i < ((double) objArr.length) * 0.9d) {
                this.f1774k4 = Arrays.copyOf(objArr, i);
            }
        }
        this.f1775kk++;
    }

    public Stack(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("capacity");
        }
        this.f1774k4 = new Object[i];
    }

    @Override // java.lang.Iterable
    public Enumerator<T> iterator() {
        return new Enumerator<>(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Stack(IGenericCollection<T> iGenericCollection) {
        if (iGenericCollection == 0) {
            throw new ArgumentNullException("collection");
        }
        int size = iGenericCollection.size();
        this.f1776x1 = size;
        Object[] objArr = new Object[size];
        this.f1774k4 = objArr;
        iGenericCollection.copyToTArray(objArr, 0);
    }

    public Stack(IGenericEnumerable<T> iGenericEnumerable) {
        if (iGenericEnumerable == null) {
            throw new ArgumentNullException("collection");
        }
        Iterator<T> it = iGenericEnumerable.iterator();
        while (it.hasNext()) {
            push(it.next());
        }
    }
}
