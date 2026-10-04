package oO00ooO;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C24017OooO0oO;

/* JADX INFO: renamed from: oO00ooO.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32454OooOo0o implements Collection<C32453OooOo0O>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int[] f116656OooOo0o;

    /* JADX INFO: renamed from: oO00ooO.OooOo0o$OooO00o */
    public static final class OooO00o implements Iterator<C32453OooOo0O>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f116657OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int[] f116658OooOo0o;

        public OooO00o(int[] iArr) {
            this.f116658OooOo0o = iArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f116657OooOo < this.f116658OooOo0o.length;
        }

        @Override // java.util.Iterator
        public final C32453OooOo0O next() {
            int i = this.f116657OooOo;
            int[] iArr = this.f116658OooOo0o;
            if (i >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f116657OooOo));
            }
            this.f116657OooOo = i + 1;
            return new C32453OooOo0O(iArr[i]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C32453OooOo0O c32453OooOo0O) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C32453OooOo0O> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C32453OooOo0O)) {
            return false;
        }
        int i = ((C32453OooOo0O) obj).f116655OooOo0o;
        int[] iArr = this.f116656OooOo0o;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (i == iArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<?> elements) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(elements, "elements");
        Collection<?> collection = elements;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof C32453OooOo0O) {
                    int i = ((C32453OooOo0O) obj).f116655OooOo0o;
                    int[] iArr = this.f116656OooOo0o;
                    int length = iArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            i2 = -1;
                            break;
                        }
                        if (i == iArr[i2]) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C32454OooOo0o) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f116656OooOo0o, ((C32454OooOo0o) obj).f116656OooOo0o);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f116656OooOo0o);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f116656OooOo0o.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<C32453OooOo0O> iterator() {
        return new OooO00o(this.f116656OooOo0o);
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
        return this.f116656OooOo0o.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C24017OooO0oO.OooO00o(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f116656OooOo0o) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(array, "array");
        return (T[]) C24017OooO0oO.OooO0O0(this, array);
    }
}
