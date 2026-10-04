package OooOo;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: OooOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC20474OooO0o0<T> implements Iterator<T>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f58475OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f58476OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f58477OooOoO0;

    public AbstractC20474OooO0o0(int i) {
        this.f58476OooOo0o = i;
    }

    public abstract T OooO00o(int i);

    public abstract void OooO0O0(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f58475OooOo < this.f58476OooOo0o;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tOooO00o = OooO00o(this.f58475OooOo);
        this.f58475OooOo++;
        this.f58477OooOoO0 = true;
        return tOooO00o;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f58477OooOoO0) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.f58475OooOo - 1;
        this.f58475OooOo = i;
        OooO0O0(i);
        this.f58476OooOo0o--;
        this.f58477OooOoO0 = false;
    }
}
