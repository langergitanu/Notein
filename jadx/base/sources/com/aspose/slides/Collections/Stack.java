package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14118yn;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class Stack implements ICollection, IEnumerable, InterfaceC14059g8 {

    /* JADX INFO: renamed from: du */
    private int f1916du;

    /* JADX INFO: renamed from: k4 */
    private Object[] f1917k4;

    /* JADX INFO: renamed from: kk */
    private int f1918kk;

    /* JADX INFO: renamed from: to */
    private int f1919to;

    /* JADX INFO: renamed from: x1 */
    private int f1920x1;

    public static class Enumerator implements IEnumerator, InterfaceC14059g8, Cloneable {

        /* JADX INFO: renamed from: k4 */
        private Stack f1921k4;

        /* JADX INFO: renamed from: kk */
        private int f1922kk;

        /* JADX INFO: renamed from: x1 */
        private int f1923x1;

        private Enumerator() {
        }

        public Object clone() throws CloneNotSupportedException {
            Enumerator enumerator = new Enumerator();
            enumerator.f1921k4 = this.f1921k4;
            enumerator.f1923x1 = this.f1923x1;
            enumerator.f1922kk = this.f1922kk;
            return enumerator;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
        public Object deepClone() {
            return m1056k4();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            if (this.f1923x1 != this.f1921k4.f1916du) {
                throw new InvalidOperationException();
            }
            int i = this.f1922kk;
            if (i == -2) {
                int i2 = this.f1921k4.f1920x1;
                this.f1922kk = i2;
                return i2 != -1;
            }
            if (i != -1) {
                int i3 = i - 1;
                this.f1922kk = i3;
                if (i3 != -1) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: k4 */
        public Object m1056k4() {
            try {
                return clone();
            } catch (CloneNotSupportedException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public Object next() {
            int i;
            if (this.f1923x1 != this.f1921k4.f1916du || (i = this.f1922kk) == -2 || i == -1 || i > this.f1921k4.f1918kk) {
                throw new InvalidOperationException();
            }
            return this.f1921k4.f1917k4[this.f1922kk];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            if (this.f1923x1 != this.f1921k4.f1916du) {
                throw new InvalidOperationException();
            }
            this.f1922kk = -2;
        }

        public Enumerator(Stack stack) {
            this.f1921k4 = stack;
            this.f1923x1 = stack.f1916du;
            this.f1922kk = -2;
        }
    }

    public static class SyncStack extends Stack {

        /* JADX INFO: renamed from: k4 */
        private final Stack f1924k4;

        public SyncStack(Stack stack) {
            this.f1924k4 = stack;
        }

        @Override // com.aspose.slides.Collections.Stack
        public void clear() {
            synchronized (this.f1924k4) {
                this.f1924k4.clear();
            }
        }

        @Override // com.aspose.slides.Collections.Stack
        public boolean contains(Object obj) {
            boolean zContains;
            synchronized (this.f1924k4) {
                zContains = this.f1924k4.contains(obj);
            }
            return zContains;
        }

        @Override // com.aspose.slides.Collections.Stack, com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            synchronized (this.f1924k4) {
                this.f1924k4.copyTo(abstractC14092to, i);
            }
        }

        @Override // com.aspose.slides.Collections.Stack, com.aspose.slides.p559ms.System.InterfaceC14059g8
        public Object deepClone() {
            Stack stackSync;
            synchronized (this.f1924k4) {
                stackSync = Stack.sync((Stack) this.f1924k4.deepClone());
            }
            return stackSync;
        }

        @Override // com.aspose.slides.Collections.Stack, com.aspose.slides.Collections.ICollection
        public Object getSyncRoot() {
            return this.f1924k4.getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.Stack, com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return true;
        }

        @Override // com.aspose.slides.Collections.Stack, java.lang.Iterable
        public IEnumerator iterator() {
            Enumerator enumerator;
            synchronized (this.f1924k4) {
                enumerator = new Enumerator(this.f1924k4);
            }
            return enumerator;
        }

        @Override // com.aspose.slides.Collections.Stack
        public Object peek() {
            Object objPeek;
            synchronized (this.f1924k4) {
                objPeek = this.f1924k4.peek();
            }
            return objPeek;
        }

        @Override // com.aspose.slides.Collections.Stack
        public Object pop() {
            Object objPop;
            synchronized (this.f1924k4) {
                objPop = this.f1924k4.pop();
            }
            return objPop;
        }

        @Override // com.aspose.slides.Collections.Stack
        public void push(Object obj) {
            synchronized (this.f1924k4) {
                this.f1924k4.push(obj);
            }
        }

        @Override // com.aspose.slides.Collections.Stack, com.aspose.slides.Collections.ICollection
        public int size() {
            int size;
            synchronized (this.f1924k4) {
                size = this.f1924k4.size();
            }
            return size;
        }

        @Override // com.aspose.slides.Collections.Stack
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f1924k4) {
                tArr2 = (T[]) this.f1924k4.toArray(tArr);
            }
            return tArr2;
        }
    }

    public Stack() {
        this.f1920x1 = -1;
        this.f1917k4 = new Object[16];
        this.f1919to = 16;
    }

    public static Stack sync(Stack stack) {
        if (stack != null) {
            return new SyncStack(stack);
        }
        throw new ArgumentNullException("stack");
    }

    public void clear() {
        this.f1916du++;
        for (int i = 0; i < this.f1918kk; i++) {
            this.f1917k4[i] = null;
        }
        this.f1918kk = 0;
        this.f1920x1 = -1;
    }

    public boolean contains(Object obj) {
        if (this.f1918kk == 0) {
            return false;
        }
        if (obj == null) {
            for (int i = 0; i < this.f1918kk; i++) {
                if (this.f1917k4[i] == null) {
                    return true;
                }
            }
        } else {
            for (int i2 = 0; i2 < this.f1918kk; i2++) {
                if (obj.equals(this.f1917k4[i2])) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        if (abstractC14092to.m67277to() > 1 || ((abstractC14092to.m67265du() > 0 && i >= abstractC14092to.m67265du()) || this.f1918kk > abstractC14092to.m67265du() - i)) {
            throw new ArgumentException();
        }
        for (int i2 = this.f1920x1; i2 != -1; i2--) {
            abstractC14092to.m67276kk(this.f1917k4[i2], (this.f1918kk - (i2 + 1)) + i);
        }
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        Stack stack = new Stack(AbstractC14092to.m67208k4((Object) this.f1917k4));
        stack.f1920x1 = this.f1920x1;
        stack.f1918kk = this.f1918kk;
        return stack;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public IEnumerator iterator() {
        return new Enumerator(this);
    }

    public Object peek() {
        int i = this.f1920x1;
        if (i != -1) {
            return this.f1917k4[i];
        }
        throw new InvalidOperationException();
    }

    public Object pop() {
        int i = this.f1920x1;
        if (i == -1) {
            throw new InvalidOperationException();
        }
        this.f1916du++;
        Object[] objArr = this.f1917k4;
        Object obj = objArr[i];
        objArr[i] = null;
        int i2 = this.f1918kk - 1;
        this.f1918kk = i2;
        this.f1920x1 = i - 1;
        int i3 = this.f1919to;
        if (i2 <= i3 / 4 && i2 > 16) {
            m1052k4(i3 / 2);
        }
        return obj;
    }

    public void push(Object obj) {
        this.f1916du++;
        int i = this.f1919to;
        if (i == this.f1918kk) {
            m1052k4(i * 2);
        }
        this.f1918kk++;
        int i2 = this.f1920x1 + 1;
        this.f1920x1 = i2;
        this.f1917k4[i2] = obj;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f1918kk;
    }

    public <T> T[] toArray(T[] tArr) {
        int length = tArr.length;
        int i = this.f1918kk;
        if (length < i) {
            T[] tArr2 = (T[]) Arrays.copyOf(this.f1917k4, i, tArr.getClass());
            C14118yn.m67558k4((Object[]) tArr2);
            return tArr2;
        }
        System.arraycopy(this.f1917k4, 0, tArr, 0, i);
        int length2 = tArr.length;
        int i2 = this.f1918kk;
        if (length2 > i2) {
            tArr[i2] = null;
        }
        C14118yn.m67558k4((Object[]) tArr);
        return tArr;
    }

    public Stack(int i) {
        this.f1920x1 = -1;
        if (i < 0) {
            throw new ArgumentOutOfRangeException("initialCapacity");
        }
        this.f1919to = i;
        this.f1917k4 = new Object[i];
    }

    /* JADX INFO: renamed from: k4 */
    private void m1052k4(int i) {
        int iMax = Math.max(i, 16);
        Object[] objArr = new Object[iMax];
        AbstractC14092to.m67234k4(this.f1917k4, 0, objArr, 0, this.f1918kk);
        this.f1919to = iMax;
        this.f1917k4 = objArr;
    }

    public Stack(ICollection iCollection) {
        this(iCollection == null ? 16 : iCollection.size());
        if (iCollection == null) {
            throw new ArgumentNullException("col");
        }
        Iterator it = iCollection.iterator();
        while (it.hasNext()) {
            push(it.next());
        }
    }
}
