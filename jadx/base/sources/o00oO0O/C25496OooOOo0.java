package o00oO0O;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.C24017OooO0oO;
import o00OO0o0.C24998OooO0O0;
import o00OO0o0.C25000OooO0Oo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o00oO0O.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25496OooOOo0<T> implements List<T>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f86903OooOoO;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object[] f86902OooOo0o = new Object[16];

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long[] f86901OooOo = new long[16];

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f86904OooOoO0 = -1;

    /* JADX INFO: renamed from: o00oO0O.OooOOo0$OooO0O0 */
    public final class OooO0O0 implements List<T>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f86909OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f86910OooOo0o;

        public OooO0O0(int i, int i2) {
            this.f86910OooOo0o = i;
            this.f86909OooOo = i2;
        }

        @Override // java.util.List
        public final void add(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return indexOf(obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(Collection<? extends Object> elements) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i) {
            return (T) C25496OooOOo0.this.f86902OooOo0o[i + this.f86910OooOo0o];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i = this.f86910OooOo0o;
            int i2 = this.f86909OooOo;
            if (i > i2) {
                return -1;
            }
            int i3 = i;
            while (!kotlin.jvm.internal.OooOOO0.OooO0O0(C25496OooOOo0.this.f86902OooOo0o[i3], obj)) {
                if (i3 == i2) {
                    return -1;
                }
                i3++;
            }
            return i3 - i;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final Iterator<T> iterator() {
            int i = this.f86910OooOo0o;
            return C25496OooOOo0.this.new OooO00o(i, i, this.f86909OooOo);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i = this.f86909OooOo;
            int i2 = this.f86910OooOo0o;
            if (i2 > i) {
                return -1;
            }
            while (!kotlin.jvm.internal.OooOOO0.OooO0O0(C25496OooOOo0.this.f86902OooOo0o[i], obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - i2;
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator() {
            int i = this.f86910OooOo0o;
            return C25496OooOOo0.this.new OooO00o(i, i, this.f86909OooOo);
        }

        @Override // java.util.List
        public final T remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final T set(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f86909OooOo - this.f86910OooOo0o;
        }

        @Override // java.util.List
        public final void sort(Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final List<T> subList(int i, int i2) {
            int i3 = this.f86910OooOo0o;
            return C25496OooOOo0.this.new OooO0O0(i + i3, i3 + i2);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return C24017OooO0oO.OooO00o(this);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final ListIterator<T> listIterator(int i) {
            int i2 = this.f86910OooOo0o;
            int i3 = this.f86909OooOo;
            return C25496OooOOo0.this.new OooO00o(i + i2, i2, i3);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(array, "array");
            return (T[]) C24017OooO0oO.OooO0O0(this, array);
        }
    }

    public final long OooO0O0() {
        long jOooO0O0 = C25000OooO0Oo.OooO0O0(Float.POSITIVE_INFINITY, false);
        int i = this.f86904OooOoO0 + 1;
        int iOooOO0O = C34429OooOOo0.OooOO0O(this);
        if (i <= iOooOO0O) {
            while (true) {
                long j = this.f86901OooOo[i];
                if (C24998OooO0O0.OooO0Oo(j, jOooO0O0) < 0) {
                    jOooO0O0 = j;
                }
                if (Float.intBitsToFloat((int) (jOooO0O0 >> 32)) < 0.0f && ((int) (4294967295L & jOooO0O0)) != 0) {
                    return jOooO0O0;
                }
                if (i == iOooOO0O) {
                    break;
                }
                i++;
            }
        }
        return jOooO0O0;
    }

    public final void OooO0Oo(InterfaceC25492OooO0oo interfaceC25492OooO0oo, float f, boolean z, oO0O000o.OooO00o oooO00o) {
        int i = this.f86904OooOoO0;
        int i2 = i + 1;
        this.f86904OooOoO0 = i2;
        Object[] objArr = this.f86902OooOo0o;
        if (i2 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length);
            kotlin.jvm.internal.OooOOO0.OooO0o(objArrCopyOf, "copyOf(this, newSize)");
            this.f86902OooOo0o = objArrCopyOf;
            long[] jArrCopyOf = Arrays.copyOf(this.f86901OooOo, length);
            kotlin.jvm.internal.OooOOO0.OooO0o(jArrCopyOf, "copyOf(this, newSize)");
            this.f86901OooOo = jArrCopyOf;
        }
        Object[] objArr2 = this.f86902OooOo0o;
        int i3 = this.f86904OooOoO0;
        objArr2[i3] = interfaceC25492OooO0oo;
        this.f86901OooOo[i3] = C25000OooO0Oo.OooO0O0(f, z);
        OooO0o0();
        oooO00o.invoke();
        this.f86904OooOoO0 = i;
    }

    public final void OooO0o0() {
        int i = this.f86904OooOoO0 + 1;
        int iOooOO0O = C34429OooOOo0.OooOO0O(this);
        if (i <= iOooOO0O) {
            while (true) {
                this.f86902OooOo0o[i] = null;
                if (i == iOooOO0O) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f86903OooOoO = this.f86904OooOoO0 + 1;
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f86904OooOoO0 = -1;
        OooO0o0();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final T get(int i) {
        return (T) this.f86902OooOo0o[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iOooOO0O = C34429OooOOo0.OooOO0O(this);
        if (iOooOO0O < 0) {
            return -1;
        }
        int i = 0;
        while (!kotlin.jvm.internal.OooOOO0.OooO0O0(this.f86902OooOo0o[i], obj)) {
            if (i == iOooOO0O) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f86903OooOoO == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new OooO00o(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        for (int iOooOO0O = C34429OooOOo0.OooOO0O(this); -1 < iOooOO0O; iOooOO0O--) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f86902OooOo0o[iOooOO0O], obj)) {
                return iOooOO0O;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new OooO00o(this, 0, 7);
    }

    @Override // java.util.List
    public final T remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f86903OooOoO;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        return new OooO0O0(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C24017OooO0oO.OooO00o(this);
    }

    /* JADX INFO: renamed from: o00oO0O.OooOOo0$OooO00o */
    public final class OooO00o implements ListIterator<T>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f86905OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f86906OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f86908OooOoO0;

        public OooO00o(C25496OooOOo0 c25496OooOOo0, int i, int i2) {
            this((i2 & 1) != 0 ? 0 : i, 0, c25496OooOOo0.f86903OooOoO);
        }

        @Override // java.util.ListIterator
        public final void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f86906OooOo0o < this.f86908OooOoO0;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f86906OooOo0o > this.f86905OooOo;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            Object[] objArr = C25496OooOOo0.this.f86902OooOo0o;
            int i = this.f86906OooOo0o;
            this.f86906OooOo0o = i + 1;
            return (T) objArr[i];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f86906OooOo0o - this.f86905OooOo;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            Object[] objArr = C25496OooOOo0.this.f86902OooOo0o;
            int i = this.f86906OooOo0o - 1;
            this.f86906OooOo0o = i;
            return (T) objArr[i];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.f86906OooOo0o - this.f86905OooOo) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public OooO00o(int i, int i2, int i3) {
            this.f86906OooOo0o = i;
            this.f86905OooOo = i2;
            this.f86908OooOoO0 = i3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new OooO00o(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(array, "array");
        return (T[]) C24017OooO0oO.OooO0O0(this, array);
    }
}
