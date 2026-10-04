package OooOOO;

import OooOOO.OooO0O0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o<K, V> extends OooO0O0<K, V> {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final HashMap<K, OooO0O0.OooO0OO<K, V>> f58390OooOoOO = new HashMap<>();

    @Override // OooOOO.OooO0O0
    public final OooO0O0.OooO0OO<K, V> OooO0O0(K k) {
        return this.f58390OooOoOO.get(k);
    }

    @Override // OooOOO.OooO0O0
    public final V OooO0OO(K k) {
        V v = (V) super.OooO0OO(k);
        this.f58390OooOoOO.remove(k);
        return v;
    }
}
