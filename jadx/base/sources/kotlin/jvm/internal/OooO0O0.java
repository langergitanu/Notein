package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0<T> implements Iterator<T>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f80929OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final T[] f80930OooOo0o;

    public OooO0O0(T[] array) {
        OooOOO0.OooO0oO(array, "array");
        this.f80930OooOo0o = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f80929OooOo < this.f80930OooOo0o.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f80930OooOo0o;
            int i = this.f80929OooOo;
            this.f80929OooOo = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f80929OooOo--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
