package OoooOOo;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: OoooOOo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21221Oooo00o<K, V> extends AbstractC21220Oooo00O<K, V> implements Iterator<K>, oO0O00.OooO00o {
    @Override // java.util.Iterator
    public final K next() {
        Map.Entry<? extends K, ? extends V> entry = this.f61566OooOoOO;
        if (entry == null) {
            throw new IllegalStateException();
        }
        OooO00o();
        return entry.getKey();
    }
}
