package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class Queue implements ICollection, IEnumerable, InterfaceC14059g8 {

    /* JADX INFO: renamed from: du */
    private int f1823du;

    /* JADX INFO: renamed from: h4 */
    private int f1824h4;

    /* JADX INFO: renamed from: k4 */
    private Object[] f1825k4;

    /* JADX INFO: renamed from: kk */
    private int f1826kk;

    /* JADX INFO: renamed from: to */
    private int f1827to;

    /* JADX INFO: renamed from: x1 */
    private int f1828x1;

    public static class QueueEnumerator implements IEnumerator, InterfaceC14059g8 {

        /* JADX INFO: renamed from: k4 */
        private Queue f1829k4;

        /* JADX INFO: renamed from: kk */
        private int f1830kk = -1;

        /* JADX INFO: renamed from: x1 */
        private int f1831x1;

        public QueueEnumerator(Queue queue) {
            this.f1829k4 = queue;
            this.f1831x1 = queue.f1824h4;
        }

        @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
        public Object deepClone() {
            QueueEnumerator queueEnumerator = new QueueEnumerator(this.f1829k4);
            queueEnumerator.f1831x1 = this.f1831x1;
            queueEnumerator.f1830kk = this.f1830kk;
            return queueEnumerator;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            if (this.f1831x1 != this.f1829k4.f1824h4) {
                throw new InvalidOperationException();
            }
            if (this.f1830kk >= this.f1829k4.f1826kk - 1) {
                this.f1830kk = Integer.MAX_VALUE;
                return false;
            }
            this.f1830kk++;
            return true;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public Object next() {
            int i;
            if (this.f1831x1 != this.f1829k4.f1824h4 || (i = this.f1830kk) < 0 || i >= this.f1829k4.f1826kk) {
                throw new InvalidOperationException();
            }
            return this.f1829k4.f1825k4[(this.f1829k4.f1828x1 + this.f1830kk) % this.f1829k4.f1825k4.length];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotImplementedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            if (this.f1831x1 != this.f1829k4.f1824h4) {
                throw new InvalidOperationException();
            }
            this.f1830kk = -1;
        }
    }

    public static class SyncQueue extends Queue {

        /* JADX INFO: renamed from: k4 */
        private final Queue f1832k4;

        public SyncQueue(Queue queue) {
            this.f1832k4 = queue;
        }

        @Override // com.aspose.slides.Collections.Queue
        public void clear() {
            synchronized (this.f1832k4) {
                this.f1832k4.clear();
            }
        }

        @Override // com.aspose.slides.Collections.Queue
        public boolean contains(Object obj) {
            boolean zContains;
            synchronized (this.f1832k4) {
                zContains = this.f1832k4.contains(obj);
            }
            return zContains;
        }

        @Override // com.aspose.slides.Collections.Queue, com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            synchronized (this.f1832k4) {
                this.f1832k4.copyTo(abstractC14092to, i);
            }
        }

        @Override // com.aspose.slides.Collections.Queue, com.aspose.slides.p559ms.System.InterfaceC14059g8
        public Object deepClone() {
            SyncQueue syncQueue;
            synchronized (this.f1832k4) {
                syncQueue = new SyncQueue((Queue) this.f1832k4.deepClone());
            }
            return syncQueue;
        }

        @Override // com.aspose.slides.Collections.Queue
        public Object dequeue() {
            Object objDequeue;
            synchronized (this.f1832k4) {
                objDequeue = this.f1832k4.dequeue();
            }
            return objDequeue;
        }

        @Override // com.aspose.slides.Collections.Queue
        public void enqueue(Object obj) {
            synchronized (this.f1832k4) {
                this.f1832k4.enqueue(obj);
            }
        }

        @Override // com.aspose.slides.Collections.Queue, com.aspose.slides.Collections.ICollection
        public Object getSyncRoot() {
            return this.f1832k4.getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.Queue, com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return true;
        }

        @Override // com.aspose.slides.Collections.Queue, java.lang.Iterable
        public IEnumerator iterator() {
            IEnumerator it;
            synchronized (this.f1832k4) {
                it = this.f1832k4.iterator();
            }
            return it;
        }

        @Override // com.aspose.slides.Collections.Queue
        public Object peek() {
            Object objPeek;
            synchronized (this.f1832k4) {
                objPeek = this.f1832k4.peek();
            }
            return objPeek;
        }

        @Override // com.aspose.slides.Collections.Queue, com.aspose.slides.Collections.ICollection
        public int size() {
            int size;
            synchronized (this.f1832k4) {
                size = this.f1832k4.size();
            }
            return size;
        }

        @Override // com.aspose.slides.Collections.Queue
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f1832k4) {
                tArr2 = (T[]) this.f1832k4.toArray(tArr);
            }
            return tArr2;
        }

        @Override // com.aspose.slides.Collections.Queue
        public void trimToSize() {
            synchronized (this.f1832k4) {
                this.f1832k4.trimToSize();
            }
        }
    }

    public Queue() {
        this(32, 2.0f);
    }

    public static Queue sync(Queue queue) {
        if (queue != null) {
            return new SyncQueue(queue);
        }
        throw new ArgumentNullException("queue");
    }

    public void clear() {
        this.f1824h4++;
        this.f1828x1 = 0;
        this.f1826kk = 0;
        this.f1827to = 0;
        for (int length = this.f1825k4.length - 1; length >= 0; length--) {
            this.f1825k4[length] = null;
        }
    }

    public boolean contains(Object obj) {
        int i = this.f1828x1;
        int i2 = this.f1826kk + i;
        if (obj == null) {
            while (i < i2) {
                Object[] objArr = this.f1825k4;
                if (objArr[i % objArr.length] == null) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i < i2) {
            Object[] objArr2 = this.f1825k4;
            if (obj.equals(objArr2[i % objArr2.length])) {
                return true;
            }
            i++;
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
        if (abstractC14092to.m67277to() > 1 || ((i != 0 && i >= abstractC14092to.m67265du()) || this.f1826kk > abstractC14092to.m67265du() - i)) {
            throw new ArgumentException();
        }
        Object[] objArr = this.f1825k4;
        int length = objArr.length - this.f1828x1;
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) objArr), this.f1828x1, abstractC14092to, i, Math.min(this.f1826kk, length));
        if (this.f1826kk > length) {
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) this.f1825k4), 0, abstractC14092to, i + length, this.f1826kk - length);
        }
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        Queue queue = new Queue(this.f1825k4.length);
        queue.f1823du = this.f1823du;
        Object[] objArr = this.f1825k4;
        AbstractC14092to.m67234k4(objArr, 0, queue.f1825k4, 0, objArr.length);
        queue.f1828x1 = this.f1828x1;
        queue.f1826kk = this.f1826kk;
        queue.f1827to = this.f1827to;
        return queue;
    }

    public Object dequeue() {
        this.f1824h4++;
        int i = this.f1826kk;
        if (i < 1) {
            throw new InvalidOperationException();
        }
        Object[] objArr = this.f1825k4;
        int i2 = this.f1828x1;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f1828x1 = (i2 + 1) % objArr.length;
        this.f1826kk = i - 1;
        return obj;
    }

    public void enqueue(Object obj) {
        this.f1824h4++;
        if (this.f1826kk == this.f1825k4.length) {
            m1007k4();
        }
        Object[] objArr = this.f1825k4;
        int i = this.f1827to;
        objArr[i] = obj;
        this.f1827to = (i + 1) % objArr.length;
        this.f1826kk++;
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
        return new QueueEnumerator(this);
    }

    public Object peek() {
        if (this.f1826kk >= 1) {
            return this.f1825k4[this.f1828x1];
        }
        throw new InvalidOperationException();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f1826kk;
    }

    public <T> T[] toArray(T[] tArr) {
        int length = tArr.length;
        int i = this.f1826kk;
        if (length < i) {
            return (T[]) Arrays.copyOf(this.f1825k4, i, tArr.getClass());
        }
        System.arraycopy(this.f1825k4, 0, tArr, 0, i);
        int length2 = tArr.length;
        int i2 = this.f1826kk;
        if (length2 > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public void trimToSize() {
        this.f1824h4++;
        Object[] objArr = new Object[this.f1826kk];
        copyTo(AbstractC14092to.m67208k4((Object) objArr), 0);
        this.f1825k4 = objArr;
        this.f1828x1 = 0;
        this.f1827to = 0;
    }

    public Queue(int i) {
        this(i, 2.0f);
    }

    /* JADX INFO: renamed from: k4 */
    private void m1007k4() {
        Object[] objArr = this.f1825k4;
        int length = (objArr.length * this.f1823du) / 100;
        if (length < objArr.length + 1) {
            length = objArr.length + 1;
        }
        Object[] objArr2 = new Object[length];
        copyTo(AbstractC14092to.m67208k4((Object) objArr2), 0);
        this.f1825k4 = objArr2;
        this.f1828x1 = 0;
        this.f1827to = this.f1826kk;
    }

    public Queue(int i, float f) {
        this.f1828x1 = 0;
        this.f1826kk = 0;
        this.f1827to = 0;
        this.f1824h4 = 0;
        if (i < 0) {
            throw new ArgumentOutOfRangeException("capacity", "Needs a non-negative number");
        }
        if (f < 1.0f || f > 10.0f) {
            throw new ArgumentOutOfRangeException("growFactor", "Queue growth factor must be between 1.0 and 10.0, inclusive");
        }
        this.f1825k4 = new Object[i];
        this.f1823du = (int) (f * 100.0f);
    }

    public Queue(ICollection iCollection) {
        this(iCollection == null ? 32 : iCollection.size());
        if (iCollection == null) {
            throw new ArgumentNullException("col");
        }
        Iterator it = iCollection.iterator();
        while (it.hasNext()) {
            enqueue(it.next());
        }
    }
}
