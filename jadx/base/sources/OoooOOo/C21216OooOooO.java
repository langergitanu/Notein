package OoooOOo;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: renamed from: OoooOOo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21216OooOooO<T> implements ListIterator<T>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f61555OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21207OooOo0<T> f61556OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f61557OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f61558OooOoO0 = -1;

    public C21216OooOooO(C21207OooOo0<T> c21207OooOo0, int i) {
        this.f61556OooOo0o = c21207OooOo0;
        this.f61555OooOo = i - 1;
        this.f61557OooOoO = c21207OooOo0.OooO0oO();
    }

    public final void OooO00o() {
        if (this.f61556OooOo0o.OooO0oO() != this.f61557OooOoO) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        OooO00o();
        int i = this.f61555OooOo + 1;
        C21207OooOo0<T> c21207OooOo0 = this.f61556OooOo0o;
        c21207OooOo0.add(i, t);
        this.f61558OooOoO0 = -1;
        this.f61555OooOo++;
        this.f61557OooOoO = c21207OooOo0.OooO0oO();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f61555OooOo < this.f61556OooOo0o.size() - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f61555OooOo >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        OooO00o();
        int i = this.f61555OooOo + 1;
        this.f61558OooOoO0 = i;
        C21207OooOo0<T> c21207OooOo0 = this.f61556OooOo0o;
        C21209OooOo0O.OooO00o(i, c21207OooOo0.size());
        T t = c21207OooOo0.get(i);
        this.f61555OooOo = i;
        return t;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f61555OooOo + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        OooO00o();
        int i = this.f61555OooOo;
        C21207OooOo0<T> c21207OooOo0 = this.f61556OooOo0o;
        C21209OooOo0O.OooO00o(i, c21207OooOo0.size());
        int i2 = this.f61555OooOo;
        this.f61558OooOoO0 = i2;
        this.f61555OooOo--;
        return c21207OooOo0.get(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f61555OooOo;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        OooO00o();
        int i = this.f61555OooOo;
        C21207OooOo0<T> c21207OooOo0 = this.f61556OooOo0o;
        c21207OooOo0.remove(i);
        this.f61555OooOo--;
        this.f61558OooOoO0 = -1;
        this.f61557OooOoO = c21207OooOo0.OooO0oO();
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        OooO00o();
        int i = this.f61558OooOoO0;
        if (i < 0) {
            throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        }
        C21207OooOo0<T> c21207OooOo0 = this.f61556OooOo0o;
        c21207OooOo0.set(i, t);
        this.f61557OooOoO = c21207OooOo0.OooO0oO();
    }
}
