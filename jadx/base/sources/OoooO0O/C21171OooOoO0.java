package OoooO0O;

import java.util.Map;

/* JADX INFO: renamed from: OoooO0O.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21171OooOoO0<K, V> extends AbstractC21167OooOo0<K, V, Map.Entry<K, V>> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooO<K, V> f61414OooOoO;

    public C21171OooOoO0(OooO<K, V> oooO) {
        this.f61414OooOoO = oooO;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f61406OooOoO0;
        this.f61406OooOoO0 = i + 2;
        Object[] objArr = this.f61405OooOo0o;
        return new C21156OooO0OO(this.f61414OooOoO, objArr[i], objArr[i + 1]);
    }
}
