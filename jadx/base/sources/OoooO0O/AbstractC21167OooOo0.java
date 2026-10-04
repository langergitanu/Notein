package OoooO0O;

import java.util.Iterator;

/* JADX INFO: renamed from: OoooO0O.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21167OooOo0<K, V, T> implements Iterator<T>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f61404OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object[] f61405OooOo0o = OooOo00.f61407OooO0o0.f61411OooO0Oo;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f61406OooOoO0;

    public final void OooO00o(Object[] objArr, int i, int i2) {
        this.f61405OooOo0o = objArr;
        this.f61404OooOo = i;
        this.f61406OooOoO0 = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f61406OooOoO0 < this.f61404OooOo;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
