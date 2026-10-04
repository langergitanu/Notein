package OoooO0O;

import java.util.Map;

/* JADX INFO: renamed from: OoooO0O.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21168OooOo0O<K, V> extends AbstractC21167OooOo0<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f61406OooOoO0;
        this.f61406OooOoO0 = i + 2;
        Object[] objArr = this.f61405OooOo0o;
        return new C21155OooO0O0(objArr[i], objArr[i + 1]);
    }
}
