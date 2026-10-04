package oO00ooO;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C24017OooO0oO;

/* JADX INFO: renamed from: oO00ooO.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32459OooOoo0 implements Collection<C32457OooOoOO>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final short[] f116664OooOo0o;

    /* JADX INFO: renamed from: oO00ooO.OooOoo0$OooO00o */
    public static final class OooO00o implements Iterator<C32457OooOoOO>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f116665OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final short[] f116666OooOo0o;

        public OooO00o(short[] sArr) {
            this.f116666OooOo0o = sArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f116665OooOo < this.f116666OooOo0o.length;
        }

        @Override // java.util.Iterator
        public final C32457OooOoOO next() {
            int i = this.f116665OooOo;
            short[] sArr = this.f116666OooOo0o;
            if (i >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f116665OooOo));
            }
            this.f116665OooOo = i + 1;
            return new C32457OooOoOO(sArr[i]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C32457OooOoOO c32457OooOoOO) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C32457OooOoOO> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C32457OooOoOO)) {
            return false;
        }
        short s = ((C32457OooOoOO) obj).f116663OooOo0o;
        short[] sArr = this.f116664OooOo0o;
        int length = sArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (s == sArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        Collection<?> collection = elements;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof C32457OooOoOO) {
                    short s = ((C32457OooOoOO) obj).f116663OooOo0o;
                    short[] sArr = this.f116664OooOo0o;
                    int length = sArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        }
                        if (s == sArr[i]) {
                            break;
                        }
                        i++;
                    }
                    if (i >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C32459OooOoo0) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f116664OooOo0o, ((C32459OooOoo0) obj).f116664OooOo0o);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f116664OooOo0o);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f116664OooOo0o.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<C32457OooOoOO> iterator() {
        return new OooO00o(this.f116664OooOo0o);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f116664OooOo0o.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C24017OooO0oO.OooO00o(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f116664OooOo0o) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(array, "array");
        return (T[]) C24017OooO0oO.OooO0O0(this, array);
    }
}
