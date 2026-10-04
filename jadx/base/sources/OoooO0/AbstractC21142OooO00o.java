package OoooO0;

import java.util.ListIterator;

/* JADX INFO: renamed from: OoooO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21142OooO00o<E> implements ListIterator<E>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f61343OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f61344OooOo0o;

    public AbstractC21142OooO00o(int i, int i2) {
        this.f61344OooOo0o = i;
        this.f61343OooOo = i2;
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f61344OooOo0o < this.f61343OooOo;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f61344OooOo0o > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f61344OooOo0o;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f61344OooOo0o - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
