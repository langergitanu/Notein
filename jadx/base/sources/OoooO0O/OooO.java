package OoooO0O;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class OooO<K, V> implements Iterator<Map.Entry<K, V>>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21160OooO0oO<K, V, Map.Entry<K, V>> f61375OooOo0o;

    public OooO(C21158OooO0o<K, V> c21158OooO0o) {
        AbstractC21167OooOo0[] abstractC21167OooOo0Arr = new AbstractC21167OooOo0[8];
        for (int i = 0; i < 8; i++) {
            abstractC21167OooOo0Arr[i] = new C21171OooOoO0(this);
        }
        this.f61375OooOo0o = new C21160OooO0oO<>(c21158OooO0o, abstractC21167OooOo0Arr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f61375OooOo0o.f61391OooOoO0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f61375OooOo0o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f61375OooOo0o.remove();
    }
}
