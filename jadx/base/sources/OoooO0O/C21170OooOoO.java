package OoooO0O;

/* JADX INFO: renamed from: OoooO0O.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21170OooOoO<K, V> extends AbstractC21167OooOo0<K, V, V> {
    @Override // java.util.Iterator
    public final V next() {
        int i = this.f61406OooOoO0;
        this.f61406OooOoO0 = i + 2;
        return (V) this.f61405OooOo0o[i + 1];
    }
}
