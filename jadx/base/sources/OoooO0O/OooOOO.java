package OoooO0O;

import OoooO00.InterfaceC21150OooO0O0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO<K, V> extends oOo000Oo.OooOO0<Map.Entry<? extends K, ? extends V>> implements InterfaceC21150OooO0O0<Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C21157OooO0Oo<K, V> f61399OooOo0o;

    public OooOOO(C21157OooO0Oo<K, V> c21157OooO0Oo) {
        this.f61399OooOo0o = c21157OooO0Oo;
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0
    public final int OooO0O0() {
        C21157OooO0Oo<K, V> c21157OooO0Oo = this.f61399OooOo0o;
        c21157OooO0Oo.getClass();
        return c21157OooO0Oo.f61381OooOo;
    }

    @Override // oOo000Oo.AbstractC34419OooO0O0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        if ((obj instanceof Map.Entry) && (entry = (Map.Entry) obj) != null) {
            Object key = entry.getKey();
            C21157OooO0Oo<K, V> c21157OooO0Oo = this.f61399OooOo0o;
            V v = c21157OooO0Oo.get((K) key);
            if (v != null) {
                return v.equals(entry.getValue());
            }
            if (entry.getValue() == null && c21157OooO0Oo.containsKey((K) entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        C21157OooO0Oo<K, V> c21157OooO0Oo = this.f61399OooOo0o;
        AbstractC21167OooOo0[] abstractC21167OooOo0Arr = new AbstractC21167OooOo0[8];
        for (int i = 0; i < 8; i++) {
            abstractC21167OooOo0Arr[i] = new C21168OooOo0O();
        }
        return new OooOOOO(c21157OooO0Oo.f61382OooOo0o, abstractC21167OooOo0Arr);
    }
}
