package oO00ooO;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C24017OooO0oO;

/* JADX INFO: renamed from: oO00ooO.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32451OooOo0 implements Collection<C32452OooOo00>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f116651OooOo0o;

    /* JADX INFO: renamed from: oO00ooO.OooOo0$OooO00o */
    public static final class OooO00o implements Iterator<C32452OooOo00>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f116652OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final byte[] f116653OooOo0o;

        public OooO00o(byte[] bArr) {
            this.f116653OooOo0o = bArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f116652OooOo < this.f116653OooOo0o.length;
        }

        @Override // java.util.Iterator
        public final C32452OooOo00 next() {
            int i = this.f116652OooOo;
            byte[] bArr = this.f116653OooOo0o;
            if (i >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f116652OooOo));
            }
            this.f116652OooOo = i + 1;
            return new C32452OooOo00(bArr[i]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(C32452OooOo00 c32452OooOo00) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends C32452OooOo00> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C32452OooOo00)) {
            return false;
        }
        byte b = ((C32452OooOo00) obj).f116654OooOo0o;
        byte[] bArr = this.f116651OooOo0o;
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (b == bArr[i]) {
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
                if (obj instanceof C32452OooOo00) {
                    byte b = ((C32452OooOo00) obj).f116654OooOo0o;
                    byte[] bArr = this.f116651OooOo0o;
                    int length = bArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        }
                        if (b == bArr[i]) {
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
        if (obj instanceof C32451OooOo0) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f116651OooOo0o, ((C32451OooOo0) obj).f116651OooOo0o);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f116651OooOo0o);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f116651OooOo0o.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<C32452OooOo00> iterator() {
        return new OooO00o(this.f116651OooOo0o);
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
        return this.f116651OooOo0o.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C24017OooO0oO.OooO00o(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f116651OooOo0o) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(array, "array");
        return (T[]) C24017OooO0oO.OooO0O0(this, array);
    }
}
