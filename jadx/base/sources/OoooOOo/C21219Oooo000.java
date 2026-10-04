package OoooOOo;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: OoooOOo.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21219Oooo000<K, V> extends AbstractC21220Oooo00O<K, V> implements Iterator<Map.Entry<K, V>>, oO0O00.OooO00o {
    @Override // java.util.Iterator
    public final Object next() {
        OooO00o();
        if (this.f61564OooOoO != null) {
            return new C21217OooOooo(this);
        }
        throw new IllegalStateException();
    }
}
