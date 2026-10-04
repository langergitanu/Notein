package oOo000Oo;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: oOo000Oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34420OooO0OO<T> implements Iterator<T>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public T f123434OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f123435OooOo0o;

    public abstract void OooO00o();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f123435OooOo0o;
        if (i == 0) {
            this.f123435OooOo0o = 3;
            OooO00o();
            return this.f123435OooOo0o == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.f123435OooOo0o;
        if (i == 1) {
            this.f123435OooOo0o = 0;
            return this.f123434OooOo;
        }
        if (i != 2) {
            this.f123435OooOo0o = 3;
            OooO00o();
            if (this.f123435OooOo0o == 1) {
                this.f123435OooOo0o = 0;
                return this.f123434OooOo;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
