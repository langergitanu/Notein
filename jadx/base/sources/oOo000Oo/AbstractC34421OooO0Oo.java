package oOo000Oo;

import OooO0Oo.C20398OooO0O0;
import Oooo0.C20855OooooOO;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: oOo000Oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34421OooO0Oo<E> extends AbstractC34419OooO0O0<E> implements List<E> {

    /* JADX INFO: renamed from: oOo000Oo.OooO0Oo$OooO00o */
    public static final class OooO00o {
        public static void OooO00o(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("startIndex: ", i, ", endIndex: ", ", size: ", i2);
                sbOooO0O0.append(i3);
                throw new IndexOutOfBoundsException(sbOooO0O0.toString());
            }
            if (i > i2) {
                throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, i2, "startIndex: ", " > endIndex: "));
            }
        }

        public static void OooO0O0(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("fromIndex: ", i, ", toIndex: ", ", size: ", i2);
                sbOooO0O0.append(i3);
                throw new IndexOutOfBoundsException(sbOooO0O0.toString());
            }
            if (i > i2) {
                throw new IllegalArgumentException(C20855OooooOO.OooO0OO(i, i2, "fromIndex: ", " > toIndex: "));
            }
        }
    }

    /* JADX INFO: renamed from: oOo000Oo.OooO0Oo$OooO0O0 */
    public class OooO0O0 implements Iterator<E>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f123437OooOo0o;

        public OooO0O0() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f123437OooOo0o < AbstractC34421OooO0Oo.this.OooO0O0();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f123437OooOo0o;
            this.f123437OooOo0o = i + 1;
            return AbstractC34421OooO0Oo.this.get(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: oOo000Oo.OooO0Oo$OooO0OO */
    public class OooO0OO extends AbstractC34421OooO0Oo<E>.OooO0O0 implements ListIterator<E> {
        public OooO0OO(int i) {
            super();
            int iOooO0O0 = AbstractC34421OooO0Oo.this.OooO0O0();
            if (i < 0 || i > iOooO0O0) {
                throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, iOooO0O0, "index: ", ", size: "));
            }
            this.f123437OooOo0o = i;
        }

        @Override // java.util.ListIterator
        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f123437OooOo0o > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f123437OooOo0o;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            int i = this.f123437OooOo0o - 1;
            this.f123437OooOo0o = i;
            return AbstractC34421OooO0Oo.this.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f123437OooOo0o - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: oOo000Oo.OooO0Oo$OooO0Oo, reason: collision with other inner class name */
    public static final class C20360OooO0Oo<E> extends AbstractC34421OooO0Oo<E> implements RandomAccess {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f123439OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final AbstractC34421OooO0Oo<E> f123440OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f123441OooOoO0;

        /* JADX WARN: Multi-variable type inference failed */
        public C20360OooO0Oo(AbstractC34421OooO0Oo<? extends E> abstractC34421OooO0Oo, int i, int i2) {
            this.f123440OooOo0o = abstractC34421OooO0Oo;
            this.f123439OooOo = i;
            OooO00o.OooO0O0(i, i2, abstractC34421OooO0Oo.OooO0O0());
            this.f123441OooOoO0 = i2 - i;
        }

        @Override // oOo000Oo.AbstractC34419OooO0O0
        public final int OooO0O0() {
            return this.f123441OooOoO0;
        }

        @Override // java.util.List
        public final E get(int i) {
            int i2 = this.f123441OooOoO0;
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(C20855OooooOO.OooO0OO(i, i2, "index: ", ", size: "));
            }
            return this.f123440OooOo0o.get(this.f123439OooOo + i);
        }
    }

    @Override // java.util.List
    public final void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection other = (Collection) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(other, "other");
        if (size() == other.size()) {
            Iterator<E> it = other.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(it.next(), obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new OooO0O0();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new OooO0OO(0);
    }

    @Override // java.util.List
    public final E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new C20360OooO0Oo(this, i, i2);
    }

    public ListIterator<E> listIterator(int i) {
        return new OooO0OO(i);
    }
}
