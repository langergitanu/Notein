package OoooO0;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class OooO<E> extends AbstractC21142OooO00o<E> {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final E f61342OooOoO0;

    public OooO(E e, int i) {
        super(i, 1);
        this.f61342OooOoO0 = e;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f61344OooOo0o++;
        return this.f61342OooOoO0;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f61344OooOo0o--;
        return this.f61342OooOoO0;
    }
}
