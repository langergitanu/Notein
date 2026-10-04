package OoooO0;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: OoooO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21147OooO0oO<T> extends AbstractC21142OooO00o<T> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooOO0O<T> f61361OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final T[] f61362OooOoO0;

    /* JADX WARN: Multi-variable type inference failed */
    public C21147OooO0oO(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        super(i, i2);
        this.f61362OooOoO0 = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.f61361OooOoO = new OooOO0O<>(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        OooOO0O<T> oooOO0O = this.f61361OooOoO;
        if (oooOO0O.hasNext()) {
            this.f61344OooOo0o++;
            return oooOO0O.next();
        }
        int i = this.f61344OooOo0o;
        this.f61344OooOo0o = i + 1;
        return this.f61362OooOoO0[i - oooOO0O.f61343OooOo];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f61344OooOo0o;
        OooOO0O<T> oooOO0O = this.f61361OooOoO;
        int i2 = oooOO0O.f61343OooOo;
        if (i <= i2) {
            this.f61344OooOo0o = i - 1;
            return oooOO0O.previous();
        }
        int i3 = i - 1;
        this.f61344OooOo0o = i3;
        return this.f61362OooOoO0[i3 - i2];
    }
}
