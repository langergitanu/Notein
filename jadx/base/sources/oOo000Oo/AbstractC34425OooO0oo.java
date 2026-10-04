package oOo000Oo;

import OoooO0O.C21158OooO0o;
import OoooO0O.C21161OooO0oo;
import OoooO0O.C21162OooOO0o;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import oO0O00.InterfaceC32497OooO0Oo;

/* JADX INFO: renamed from: oOo000Oo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34425OooO0oo<K, V> extends AbstractMap<K, V> implements Map<K, V>, InterfaceC32497OooO0Oo {
    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new C21161OooO0oo((C21158OooO0o) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        return new OoooO0O.OooOO0((C21158OooO0o) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return ((C21158OooO0o) this).f61388OooOoo0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        return new C21162OooOO0o((C21158OooO0o) this);
    }
}
