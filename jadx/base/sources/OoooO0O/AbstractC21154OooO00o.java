package OoooO0O;

import java.util.Map;
import java.util.Map.Entry;

/* JADX INFO: renamed from: OoooO0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21154OooO00o<E extends Map.Entry<? extends K, ? extends V>, K, V> extends oOo000Oo.OooO<E> {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if ((entry != null ? entry : null) != null) {
            Object key = entry.getKey();
            C21158OooO0o<K, V> c21158OooO0o = ((C21161OooO0oo) this).f61396OooOo0o;
            V v = c21158OooO0o.get((K) key);
            if (v != null) {
                return v.equals(entry.getValue());
            }
            if (entry.getValue() == null && c21158OooO0o.containsKey((K) entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return ((C21161OooO0oo) this).f61396OooOo0o.remove(entry.getKey(), entry.getValue());
    }
}
