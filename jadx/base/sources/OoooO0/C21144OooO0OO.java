package OoooO0;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: OoooO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21144OooO0OO<T> extends AbstractC21142OooO00o<T> {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final T[] f61346OooOoO0;

    public C21144OooO0OO(T[] tArr, int i, int i2) {
        super(i, i2);
        this.f61346OooOoO0 = tArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f61344OooOo0o;
        this.f61344OooOo0o = i + 1;
        return this.f61346OooOoO0[i];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f61344OooOo0o - 1;
        this.f61344OooOo0o = i;
        return this.f61346OooOoO0[i];
    }
}
