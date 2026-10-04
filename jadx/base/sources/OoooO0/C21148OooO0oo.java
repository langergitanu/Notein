package OoooO0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: OoooO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21148OooO0oo<T> extends AbstractC21142OooO00o<T> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f61363OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0o<T> f61364OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public OooOO0O<? extends T> f61365OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f61366OooOoo0;

    public C21148OooO0oo(OooO0o<T> oooO0o, int i) {
        super(i, oooO0o.f61355OooOooO);
        this.f61364OooOoO0 = oooO0o;
        this.f61363OooOoO = oooO0o.OooO0oO();
        this.f61366OooOoo0 = -1;
        OooO0O0();
    }

    public final void OooO00o() {
        if (this.f61363OooOoO != this.f61364OooOoO0.OooO0oO()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void OooO0O0() {
        OooO0o<T> oooO0o = this.f61364OooOoO0;
        Object[] objArr = oooO0o.f61354OooOoo0;
        if (objArr == null) {
            this.f61365OooOoOO = null;
            return;
        }
        int i = (oooO0o.f61355OooOooO - 1) & (-32);
        int i2 = this.f61344OooOo0o;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (oooO0o.f61350OooOoO / 5) + 1;
        OooOO0O<? extends T> oooOO0O = this.f61365OooOoOO;
        if (oooOO0O == null) {
            this.f61365OooOoOO = new OooOO0O<>(objArr, i2, i, i3);
            return;
        }
        oooOO0O.f61344OooOo0o = i2;
        oooOO0O.f61343OooOo = i;
        oooOO0O.f61370OooOoO0 = i3;
        if (oooOO0O.f61369OooOoO.length < i3) {
            oooOO0O.f61369OooOoO = new Object[i3];
        }
        oooOO0O.f61369OooOoO[0] = objArr;
        ?? r6 = i2 == i ? 1 : 0;
        oooOO0O.f61371OooOoOO = r6;
        oooOO0O.OooO0O0(i2 - r6, 1);
    }

    @Override // OoooO0.AbstractC21142OooO00o, java.util.ListIterator
    public final void add(T t) {
        OooO00o();
        int i = this.f61344OooOo0o;
        OooO0o<T> oooO0o = this.f61364OooOoO0;
        oooO0o.add(i, t);
        this.f61344OooOo0o++;
        this.f61343OooOo = oooO0o.OooO0O0();
        this.f61363OooOoO = oooO0o.OooO0oO();
        this.f61366OooOoo0 = -1;
        OooO0O0();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        OooO00o();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f61344OooOo0o;
        this.f61366OooOoo0 = i;
        OooOO0O<? extends T> oooOO0O = this.f61365OooOoOO;
        OooO0o<T> oooO0o = this.f61364OooOoO0;
        if (oooOO0O == null) {
            Object[] objArr = oooO0o.f61353OooOoo;
            this.f61344OooOo0o = i + 1;
            return (T) objArr[i];
        }
        if (oooOO0O.hasNext()) {
            this.f61344OooOo0o++;
            return oooOO0O.next();
        }
        Object[] objArr2 = oooO0o.f61353OooOoo;
        int i2 = this.f61344OooOo0o;
        this.f61344OooOo0o = i2 + 1;
        return (T) objArr2[i2 - oooOO0O.f61343OooOo];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        OooO00o();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f61344OooOo0o;
        this.f61366OooOoo0 = i - 1;
        OooOO0O<? extends T> oooOO0O = this.f61365OooOoOO;
        OooO0o<T> oooO0o = this.f61364OooOoO0;
        if (oooOO0O == null) {
            Object[] objArr = oooO0o.f61353OooOoo;
            int i2 = i - 1;
            this.f61344OooOo0o = i2;
            return (T) objArr[i2];
        }
        int i3 = oooOO0O.f61343OooOo;
        if (i <= i3) {
            this.f61344OooOo0o = i - 1;
            return oooOO0O.previous();
        }
        Object[] objArr2 = oooO0o.f61353OooOoo;
        int i4 = i - 1;
        this.f61344OooOo0o = i4;
        return (T) objArr2[i4 - i3];
    }

    @Override // OoooO0.AbstractC21142OooO00o, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        OooO00o();
        int i = this.f61366OooOoo0;
        if (i == -1) {
            throw new IllegalStateException();
        }
        OooO0o<T> oooO0o = this.f61364OooOoO0;
        oooO0o.OooO0Oo(i);
        int i2 = this.f61366OooOoo0;
        if (i2 < this.f61344OooOo0o) {
            this.f61344OooOo0o = i2;
        }
        this.f61343OooOo = oooO0o.OooO0O0();
        this.f61363OooOoO = oooO0o.OooO0oO();
        this.f61366OooOoo0 = -1;
        OooO0O0();
    }

    @Override // OoooO0.AbstractC21142OooO00o, java.util.ListIterator
    public final void set(T t) {
        OooO00o();
        int i = this.f61366OooOoo0;
        if (i == -1) {
            throw new IllegalStateException();
        }
        OooO0o<T> oooO0o = this.f61364OooOoO0;
        oooO0o.set(i, t);
        this.f61363OooOoO = oooO0o.OooO0oO();
        OooO0O0();
    }
}
