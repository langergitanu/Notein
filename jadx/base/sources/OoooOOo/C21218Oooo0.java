package OoooOOo;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: OoooOOo.Oooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21218Oooo0<K, V> extends AbstractC21220Oooo00O<K, V> implements Iterator<V>, oO0O00.OooO00o {
    @Override // java.util.Iterator
    public final V next() {
        Map.Entry<? extends K, ? extends V> entry = this.f61566OooOoOO;
        if (entry == null) {
            throw new IllegalStateException();
        }
        OooO00o();
        return entry.getValue();
    }
}
