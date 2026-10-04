package oO00ooOO;

import Oooo0.C20855OooooOO;
import Oooo0O0.C20920OooOOo;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.AbstractC34421OooO0Oo;
import oOo000Oo.AbstractC34424OooO0oO;

/* JADX INFO: renamed from: oO00ooOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32465OooO0O0<E> extends AbstractC34424OooO0oO<E> implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final C32465OooO0O0 f116672OooOoO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f116673OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public E[] f116674OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f116675OooOoO0;

    /* JADX INFO: renamed from: oO00ooOO.OooO0O0$OooO00o */
    public static final class OooO00o<E> extends AbstractC34424OooO0oO<E> implements RandomAccess, Serializable {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f116676OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public E[] f116677OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final OooO00o<E> f116678OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f116679OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final C32465OooO0O0<E> f116680OooOoOO;

        /* JADX INFO: renamed from: oO00ooOO.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20231OooO00o<E> implements ListIterator<E>, oO0O00.OooO00o {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f116681OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final OooO00o<E> f116682OooOo0o;

            /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
            public int f116683OooOoO;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public int f116684OooOoO0 = -1;

            public C20231OooO00o(OooO00o<E> oooO00o, int i) {
                this.f116682OooOo0o = oooO00o;
                this.f116681OooOo = i;
                this.f116683OooOoO = ((AbstractList) oooO00o).modCount;
            }

            public final void OooO00o() {
                if (((AbstractList) this.f116682OooOo0o.f116680OooOoOO).modCount != this.f116683OooOoO) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public final void add(E e) {
                OooO00o();
                int i = this.f116681OooOo;
                this.f116681OooOo = i + 1;
                OooO00o<E> oooO00o = this.f116682OooOo0o;
                oooO00o.add(i, e);
                this.f116684OooOoO0 = -1;
                this.f116683OooOoO = ((AbstractList) oooO00o).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.f116681OooOo < this.f116682OooOo0o.f116679OooOoO0;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.f116681OooOo > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final E next() {
                OooO00o();
                int i = this.f116681OooOo;
                OooO00o<E> oooO00o = this.f116682OooOo0o;
                if (i >= oooO00o.f116679OooOoO0) {
                    throw new NoSuchElementException();
                }
                this.f116681OooOo = i + 1;
                this.f116684OooOoO0 = i;
                return oooO00o.f116677OooOo0o[oooO00o.f116676OooOo + i];
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.f116681OooOo;
            }

            @Override // java.util.ListIterator
            public final E previous() {
                OooO00o();
                int i = this.f116681OooOo;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.f116681OooOo = i2;
                this.f116684OooOoO0 = i2;
                OooO00o<E> oooO00o = this.f116682OooOo0o;
                return oooO00o.f116677OooOo0o[oooO00o.f116676OooOo + i2];
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.f116681OooOo - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                OooO00o();
                int i = this.f116684OooOoO0;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                OooO00o<E> oooO00o = this.f116682OooOo0o;
                oooO00o.OooO0Oo(i);
                this.f116681OooOo = this.f116684OooOoO0;
                this.f116684OooOoO0 = -1;
                this.f116683OooOoO = ((AbstractList) oooO00o).modCount;
            }

            @Override // java.util.ListIterator
            public final void set(E e) {
                OooO00o();
                int i = this.f116684OooOoO0;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f116682OooOo0o.set(i, e);
            }
        }

        public OooO00o(E[] backing, int i, int i2, OooO00o<E> oooO00o, C32465OooO0O0<E> root) {
            OooOOO0.OooO0oO(backing, "backing");
            OooOOO0.OooO0oO(root, "root");
            this.f116677OooOo0o = backing;
            this.f116676OooOo = i;
            this.f116679OooOoO0 = i2;
            this.f116678OooOoO = oooO00o;
            this.f116680OooOoOO = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final Object writeReplace() throws NotSerializableException {
            if (this.f116680OooOoOO.f116675OooOoO0) {
                return new C32471OooO0oO(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        public final void OooO() {
            if (this.f116680OooOoOO.f116675OooOoO0) {
                throw new UnsupportedOperationException();
            }
        }

        @Override // oOo000Oo.AbstractC34424OooO0oO
        public final int OooO0O0() {
            OooO0oo();
            return this.f116679OooOoO0;
        }

        @Override // oOo000Oo.AbstractC34424OooO0oO
        public final E OooO0Oo(int i) {
            OooO();
            OooO0oo();
            int i2 = this.f116679OooOoO0;
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
            }
            return OooOO0(this.f116676OooOo + i);
        }

        public final void OooO0o(int i, Collection<? extends E> collection, int i2) {
            ((AbstractList) this).modCount++;
            C32465OooO0O0<E> c32465OooO0O0 = this.f116680OooOoOO;
            OooO00o<E> oooO00o = this.f116678OooOoO;
            if (oooO00o != null) {
                oooO00o.OooO0o(i, collection, i2);
            } else {
                C32465OooO0O0 c32465OooO0O02 = C32465OooO0O0.f116672OooOoO;
                c32465OooO0O0.OooO0o(i, collection, i2);
            }
            this.f116677OooOo0o = c32465OooO0O0.f116674OooOo0o;
            this.f116679OooOoO0 += i2;
        }

        public final void OooO0oO(int i, E e) {
            ((AbstractList) this).modCount++;
            C32465OooO0O0<E> c32465OooO0O0 = this.f116680OooOoOO;
            OooO00o<E> oooO00o = this.f116678OooOoO;
            if (oooO00o != null) {
                oooO00o.OooO0oO(i, e);
            } else {
                C32465OooO0O0 c32465OooO0O02 = C32465OooO0O0.f116672OooOoO;
                c32465OooO0O0.OooO0oO(i, e);
            }
            this.f116677OooOo0o = c32465OooO0O0.f116674OooOo0o;
            this.f116679OooOoO0++;
        }

        public final void OooO0oo() {
            if (((AbstractList) this.f116680OooOoOO).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        public final E OooOO0(int i) {
            E eOooOO0;
            ((AbstractList) this).modCount++;
            OooO00o<E> oooO00o = this.f116678OooOoO;
            if (oooO00o != null) {
                eOooOO0 = oooO00o.OooOO0(i);
            } else {
                C32465OooO0O0 c32465OooO0O0 = C32465OooO0O0.f116672OooOoO;
                eOooOO0 = this.f116680OooOoOO.OooOO0(i);
            }
            this.f116679OooOoO0--;
            return eOooOO0;
        }

        public final void OooOO0O(int i, int i2) {
            if (i2 > 0) {
                ((AbstractList) this).modCount++;
            }
            OooO00o<E> oooO00o = this.f116678OooOoO;
            if (oooO00o != null) {
                oooO00o.OooOO0O(i, i2);
            } else {
                C32465OooO0O0 c32465OooO0O0 = C32465OooO0O0.f116672OooOoO;
                this.f116680OooOoOO.OooOO0O(i, i2);
            }
            this.f116679OooOoO0 -= i2;
        }

        public final int OooOO0o(int i, int i2, Collection<? extends E> collection, boolean z) {
            int iOooOO0o;
            OooO00o<E> oooO00o = this.f116678OooOoO;
            if (oooO00o != null) {
                iOooOO0o = oooO00o.OooOO0o(i, i2, collection, z);
            } else {
                C32465OooO0O0 c32465OooO0O0 = C32465OooO0O0.f116672OooOoO;
                iOooOO0o = this.f116680OooOoOO.OooOO0o(i, i2, collection, z);
            }
            if (iOooOO0o > 0) {
                ((AbstractList) this).modCount++;
            }
            this.f116679OooOoO0 -= iOooOO0o;
            return iOooOO0o;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E e) {
            OooO();
            OooO0oo();
            OooO0oO(this.f116676OooOo + this.f116679OooOoO0, e);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection<? extends E> elements) {
            OooOOO0.OooO0oO(elements, "elements");
            OooO();
            OooO0oo();
            int size = elements.size();
            OooO0o(this.f116676OooOo + this.f116679OooOoO0, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            OooO();
            OooO0oo();
            OooOO0O(this.f116676OooOo, this.f116679OooOoO0);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            OooO0oo();
            if (obj == this) {
                return true;
            }
            if (obj instanceof List) {
                return C20920OooOOo.OooO00o(this.f116677OooOo0o, this.f116676OooOo, this.f116679OooOoO0, (List) obj);
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int i) {
            OooO0oo();
            int i2 = this.f116679OooOoO0;
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
            }
            return this.f116677OooOo0o[this.f116676OooOo + i];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            OooO0oo();
            E[] eArr = this.f116677OooOo0o;
            int i = this.f116679OooOoO0;
            int iHashCode = 1;
            for (int i2 = 0; i2 < i; i2++) {
                E e = eArr[this.f116676OooOo + i2];
                iHashCode = (iHashCode * 31) + (e != null ? e.hashCode() : 0);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            OooO0oo();
            for (int i = 0; i < this.f116679OooOoO0; i++) {
                if (OooOOO0.OooO0O0(this.f116677OooOo0o[this.f116676OooOo + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            OooO0oo();
            return this.f116679OooOoO0 == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            OooO0oo();
            for (int i = this.f116679OooOoO0 - 1; i >= 0; i--) {
                if (OooOOO0.OooO0O0(this.f116677OooOo0o[this.f116676OooOo + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            OooO();
            OooO0oo();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                OooO0Oo(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection<?> elements) {
            OooOOO0.OooO0oO(elements, "elements");
            OooO();
            OooO0oo();
            return OooOO0o(this.f116676OooOo, this.f116679OooOoO0, elements, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection<?> elements) {
            OooOOO0.OooO0oO(elements, "elements");
            OooO();
            OooO0oo();
            return OooOO0o(this.f116676OooOo, this.f116679OooOoO0, elements, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E set(int i, E e) {
            OooO();
            OooO0oo();
            int i2 = this.f116679OooOoO0;
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
            }
            E[] eArr = this.f116677OooOo0o;
            int i3 = this.f116676OooOo;
            E e2 = eArr[i3 + i];
            eArr[i3 + i] = e;
            return e2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<E> subList(int i, int i2) {
            AbstractC34421OooO0Oo.OooO00o.OooO0O0(i, i2, this.f116679OooOoO0);
            return new OooO00o(this.f116677OooOo0o, this.f116676OooOo + i, i2 - i, this, this.f116680OooOoOO);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final <T> T[] toArray(T[] array) {
            OooOOO0.OooO0oO(array, "array");
            OooO0oo();
            int length = array.length;
            int i = this.f116679OooOoO0;
            int i2 = this.f116676OooOo;
            if (length < i) {
                T[] tArr = (T[]) Arrays.copyOfRange(this.f116677OooOo0o, i2, i + i2, array.getClass());
                OooOOO0.OooO0o(tArr, "copyOfRange(...)");
                return tArr;
            }
            Oooo.OooO0OO.OooO0oo(this.f116677OooOo0o, 0, array, i2, i + i2);
            int i3 = this.f116679OooOoO0;
            if (i3 < array.length) {
                array[i3] = null;
            }
            return array;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            OooO0oo();
            return C20920OooOOo.OooO0O0(this.f116677OooOo0o, this.f116676OooOo, this.f116679OooOoO0, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator<E> listIterator(int i) {
            OooO0oo();
            int i2 = this.f116679OooOoO0;
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
            }
            return new C20231OooO00o(this, i);
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, E e) {
            OooO();
            OooO0oo();
            int i2 = this.f116679OooOoO0;
            if (i >= 0 && i <= i2) {
                OooO0oO(this.f116676OooOo + i, e);
                return;
            }
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i, Collection<? extends E> elements) {
            OooOOO0.OooO0oO(elements, "elements");
            OooO();
            OooO0oo();
            int i2 = this.f116679OooOoO0;
            if (i >= 0 && i <= i2) {
                int size = elements.size();
                OooO0o(this.f116676OooOo + i, elements, size);
                return size > 0;
            }
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            OooO0oo();
            E[] eArr = this.f116677OooOo0o;
            int i = this.f116679OooOoO0;
            int i2 = this.f116676OooOo;
            return Oooo.OooO0OO.OooOOO0(eArr, i2, i + i2);
        }
    }

    /* JADX INFO: renamed from: oO00ooOO.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C20232OooO0O0<E> implements ListIterator<E>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f116685OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C32465OooO0O0<E> f116686OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f116687OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f116688OooOoO0 = -1;

        public C20232OooO0O0(C32465OooO0O0<E> c32465OooO0O0, int i) {
            this.f116686OooOo0o = c32465OooO0O0;
            this.f116685OooOo = i;
            this.f116687OooOoO = ((AbstractList) c32465OooO0O0).modCount;
        }

        public final void OooO00o() {
            if (((AbstractList) this.f116686OooOo0o).modCount != this.f116687OooOoO) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            OooO00o();
            int i = this.f116685OooOo;
            this.f116685OooOo = i + 1;
            C32465OooO0O0<E> c32465OooO0O0 = this.f116686OooOo0o;
            c32465OooO0O0.add(i, e);
            this.f116688OooOoO0 = -1;
            this.f116687OooOoO = ((AbstractList) c32465OooO0O0).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f116685OooOo < this.f116686OooOo0o.f116673OooOo;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f116685OooOo > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            OooO00o();
            int i = this.f116685OooOo;
            C32465OooO0O0<E> c32465OooO0O0 = this.f116686OooOo0o;
            if (i >= c32465OooO0O0.f116673OooOo) {
                throw new NoSuchElementException();
            }
            this.f116685OooOo = i + 1;
            this.f116688OooOoO0 = i;
            return c32465OooO0O0.f116674OooOo0o[i];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f116685OooOo;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            OooO00o();
            int i = this.f116685OooOo;
            if (i <= 0) {
                throw new NoSuchElementException();
            }
            int i2 = i - 1;
            this.f116685OooOo = i2;
            this.f116688OooOoO0 = i2;
            return this.f116686OooOo0o.f116674OooOo0o[i2];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f116685OooOo - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            OooO00o();
            int i = this.f116688OooOoO0;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            C32465OooO0O0<E> c32465OooO0O0 = this.f116686OooOo0o;
            c32465OooO0O0.OooO0Oo(i);
            this.f116685OooOo = this.f116688OooOoO0;
            this.f116688OooOoO0 = -1;
            this.f116687OooOoO = ((AbstractList) c32465OooO0O0).modCount;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            OooO00o();
            int i = this.f116688OooOoO0;
            if (i == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f116686OooOo0o.set(i, e);
        }
    }

    static {
        C32465OooO0O0 c32465OooO0O0 = new C32465OooO0O0(0);
        c32465OooO0O0.f116675OooOoO0 = true;
        f116672OooOoO = c32465OooO0O0;
    }

    public C32465OooO0O0() {
        this((Object) null);
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f116675OooOoO0) {
            return new C32471OooO0oO(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    public final void OooO(int i, int i2) {
        int i3 = this.f116673OooOo + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f116674OooOo0o;
        if (i3 > eArr.length) {
            int length = eArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            E[] eArr2 = (E[]) Arrays.copyOf(eArr, i4);
            OooOOO0.OooO0o(eArr2, "copyOf(...)");
            this.f116674OooOo0o = eArr2;
        }
        E[] eArr3 = this.f116674OooOo0o;
        Oooo.OooO0OO.OooO0oo(eArr3, i + i2, eArr3, i, this.f116673OooOo);
        this.f116673OooOo += i2;
    }

    @Override // oOo000Oo.AbstractC34424OooO0oO
    public final int OooO0O0() {
        return this.f116673OooOo;
    }

    @Override // oOo000Oo.AbstractC34424OooO0oO
    public final E OooO0Oo(int i) {
        OooO0oo();
        int i2 = this.f116673OooOo;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
        }
        return OooOO0(i);
    }

    public final void OooO0o(int i, Collection<? extends E> collection, int i2) {
        ((AbstractList) this).modCount++;
        OooO(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f116674OooOo0o[i + i3] = it.next();
        }
    }

    public final void OooO0oO(int i, E e) {
        ((AbstractList) this).modCount++;
        OooO(i, 1);
        this.f116674OooOo0o[i] = e;
    }

    public final void OooO0oo() {
        if (this.f116675OooOoO0) {
            throw new UnsupportedOperationException();
        }
    }

    public final E OooOO0(int i) {
        ((AbstractList) this).modCount++;
        E[] eArr = this.f116674OooOo0o;
        E e = eArr[i];
        Oooo.OooO0OO.OooO0oo(eArr, i, eArr, i + 1, this.f116673OooOo);
        E[] eArr2 = this.f116674OooOo0o;
        int i2 = this.f116673OooOo - 1;
        OooOOO0.OooO0oO(eArr2, "<this>");
        eArr2[i2] = null;
        this.f116673OooOo--;
        return e;
    }

    public final void OooOO0O(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        E[] eArr = this.f116674OooOo0o;
        Oooo.OooO0OO.OooO0oo(eArr, i, eArr, i + i2, this.f116673OooOo);
        E[] eArr2 = this.f116674OooOo0o;
        int i3 = this.f116673OooOo;
        C20920OooOOo.OooO0Oo(eArr2, i3 - i2, i3);
        this.f116673OooOo -= i2;
    }

    public final int OooOO0o(int i, int i2, Collection<? extends E> collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f116674OooOo0o[i5]) == z) {
                E[] eArr = this.f116674OooOo0o;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.f116674OooOo0o;
        Oooo.OooO0OO.OooO0oo(eArr2, i + i4, eArr2, i2 + i, this.f116673OooOo);
        E[] eArr3 = this.f116674OooOo0o;
        int i7 = this.f116673OooOo;
        C20920OooOOo.OooO0Oo(eArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f116673OooOo -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        OooO0oo();
        int i = this.f116673OooOo;
        ((AbstractList) this).modCount++;
        OooO(i, 1);
        this.f116674OooOo0o[i] = e;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> elements) {
        OooOOO0.OooO0oO(elements, "elements");
        OooO0oo();
        int size = elements.size();
        OooO0o(this.f116673OooOo, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        OooO0oo();
        OooOO0O(0, this.f116673OooOo);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (C20920OooOOo.OooO00o(this.f116674OooOo0o, 0, this.f116673OooOo, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        int i2 = this.f116673OooOo;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
        }
        return this.f116674OooOo0o[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.f116674OooOo0o;
        int i = this.f116673OooOo;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            E e = eArr[i2];
            iHashCode = (iHashCode * 31) + (e != null ? e.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f116673OooOo; i++) {
            if (OooOOO0.OooO0O0(this.f116674OooOo0o[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f116673OooOo == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f116673OooOo - 1; i >= 0; i--) {
            if (OooOOO0.OooO0O0(this.f116674OooOo0o[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        OooO0oo();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            OooO0Oo(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> elements) {
        OooOOO0.OooO0oO(elements, "elements");
        OooO0oo();
        return OooOO0o(0, this.f116673OooOo, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> elements) {
        OooOOO0.OooO0oO(elements, "elements");
        OooO0oo();
        return OooOO0o(0, this.f116673OooOo, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        OooO0oo();
        int i2 = this.f116673OooOo;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
        }
        E[] eArr = this.f116674OooOo0o;
        E e2 = eArr[i];
        eArr[i] = e;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List<E> subList(int i, int i2) {
        AbstractC34421OooO0Oo.OooO00o.OooO0O0(i, i2, this.f116673OooOo);
        return new OooO00o(this.f116674OooOo0o, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] array) {
        OooOOO0.OooO0oO(array, "array");
        int length = array.length;
        int i = this.f116673OooOo;
        if (length < i) {
            T[] tArr = (T[]) Arrays.copyOfRange(this.f116674OooOo0o, 0, i, array.getClass());
            OooOOO0.OooO0o(tArr, "copyOfRange(...)");
            return tArr;
        }
        Oooo.OooO0OO.OooO0oo(this.f116674OooOo0o, 0, array, 0, i);
        int i2 = this.f116673OooOo;
        if (i2 < array.length) {
            array[i2] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return C20920OooOOo.OooO0O0(this.f116674OooOo0o, 0, this.f116673OooOo, this);
    }

    public /* synthetic */ C32465OooO0O0(Object obj) {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<E> listIterator(int i) {
        int i2 = this.f116673OooOo;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
        }
        return new C20232OooO0O0(this, i);
    }

    public C32465OooO0O0(int i) {
        if (i >= 0) {
            this.f116674OooOo0o = (E[]) new Object[i];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> elements) {
        OooOOO0.OooO0oO(elements, "elements");
        OooO0oo();
        int i2 = this.f116673OooOo;
        if (i >= 0 && i <= i2) {
            int size = elements.size();
            OooO0o(i, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        OooO0oo();
        int i2 = this.f116673OooOo;
        if (i >= 0 && i <= i2) {
            ((AbstractList) this).modCount++;
            OooO(i, 1);
            this.f116674OooOo0o[i] = e;
            return;
        }
        throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return Oooo.OooO0OO.OooOOO0(this.f116674OooOo0o, 0, this.f116673OooOo);
    }
}
