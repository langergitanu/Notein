package OoooOOo;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: OoooOOo.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21220Oooo00O<K, V> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Iterator<Map.Entry<K, V>> f61562OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21210OooOo0o<K, V> f61563OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Map.Entry<? extends K, ? extends V> f61564OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f61565OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Map.Entry<? extends K, ? extends V> f61566OooOoOO;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC21220Oooo00O(C21210OooOo0o<K, V> c21210OooOo0o, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.f61563OooOo0o = c21210OooOo0o;
        this.f61562OooOo = it;
        this.f61565OooOoO0 = c21210OooOo0o.OooO00o().f61525OooO0Oo;
        OooO00o();
    }

    public final void OooO00o() {
        this.f61564OooOoO = this.f61566OooOoOO;
        Iterator<Map.Entry<K, V>> it = this.f61562OooOo;
        this.f61566OooOoOO = it.hasNext() ? it.next() : null;
    }

    public final boolean hasNext() {
        return this.f61566OooOoOO != null;
    }

    public final void remove() {
        C21210OooOo0o<K, V> c21210OooOo0o = this.f61563OooOo0o;
        if (c21210OooOo0o.OooO00o().f61525OooO0Oo != this.f61565OooOoO0) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.f61564OooOoO;
        if (entry == null) {
            throw new IllegalStateException();
        }
        c21210OooOo0o.remove(entry.getKey());
        this.f61564OooOoO = null;
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        this.f61565OooOoO0 = c21210OooOo0o.OooO00o().f61525OooO0Oo;
    }
}
