package OoooO0O;

import OoooO00.InterfaceC21152OooO0Oo;
import OoooOO0.C21172OooO00o;
import OoooOO0.C21175OooO0Oo;
import java.util.Map;
import oOo000Oo.AbstractC34425OooO0oo;

/* JADX INFO: renamed from: OoooO0O.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C21158OooO0o<K, V> extends AbstractC34425OooO0oo<K, V> implements InterfaceC21152OooO0Oo.OooO00o<K, V> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C21175OooO0Oo f61383OooOo = new C21175OooO0Oo();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C21157OooO0Oo<K, V> f61384OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public V f61385OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public OooOo00<K, V> f61386OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f61387OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f61388OooOoo0;

    public C21158OooO0o(C21157OooO0Oo<K, V> c21157OooO0Oo) {
        this.f61384OooOo0o = c21157OooO0Oo;
        this.f61386OooOoO0 = c21157OooO0Oo.f61382OooOo0o;
        c21157OooO0Oo.getClass();
        this.f61388OooOoo0 = c21157OooO0Oo.f61381OooOo;
    }

    @Override // OoooO00.InterfaceC21152OooO0Oo.OooO00o
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public C21157OooO0Oo<K, V> build() {
        OooOo00<K, V> oooOo00 = this.f61386OooOoO0;
        C21157OooO0Oo<K, V> c21157OooO0Oo = this.f61384OooOo0o;
        if (oooOo00 != c21157OooO0Oo.f61382OooOo0o) {
            this.f61383OooOo = new C21175OooO0Oo();
            c21157OooO0Oo = new C21157OooO0Oo<>(this.f61386OooOoO0, this.f61388OooOoo0);
        }
        this.f61384OooOo0o = c21157OooO0Oo;
        return c21157OooO0Oo;
    }

    public final void OooO0O0(int i) {
        this.f61388OooOoo0 = i;
        this.f61387OooOoOO++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f61386OooOoO0 = OooOo00.f61407OooO0o0;
        OooO0O0(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K k) {
        return this.f61386OooOoO0.OooO0Oo(k != null ? k.hashCode() : 0, 0, k);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(K k) {
        return (V) this.f61386OooOoO0.OooO0oO(k != null ? k.hashCode() : 0, 0, k);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        this.f61385OooOoO = null;
        this.f61386OooOoO0 = this.f61386OooOoO0.OooOO0o(k != null ? k.hashCode() : 0, k, v, 0, this);
        return this.f61385OooOoO;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        C21157OooO0Oo<K, V> c21157OooO0OoBuild = null;
        C21157OooO0Oo<K, V> c21157OooO0Oo = map instanceof C21157OooO0Oo ? (C21157OooO0Oo) map : null;
        if (c21157OooO0Oo == null) {
            C21158OooO0o c21158OooO0o = map instanceof C21158OooO0o ? (C21158OooO0o) map : null;
            if (c21158OooO0o != null) {
                c21157OooO0OoBuild = c21158OooO0o.build();
            }
        } else {
            c21157OooO0OoBuild = c21157OooO0Oo;
        }
        if (c21157OooO0OoBuild == null) {
            super.putAll(map);
            return;
        }
        C21172OooO00o c21172OooO00o = new C21172OooO00o(0);
        int i = this.f61388OooOoo0;
        OooOo00<K, V> oooOo00 = this.f61386OooOoO0;
        OooOo00<K, V> oooOo002 = c21157OooO0OoBuild.f61382OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooOo002, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.f61386OooOoO0 = oooOo00.OooOOO0(oooOo002, 0, c21172OooO00o, this);
        int i2 = (c21157OooO0OoBuild.f61381OooOo + i) - c21172OooO00o.f61415OooO00o;
        if (i != i2) {
            OooO0O0(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f61388OooOoo0;
        OooOo00<K, V> oooOo00OooOOOO = this.f61386OooOoO0.OooOOOO(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (oooOo00OooOOOO == null) {
            oooOo00OooOOOO = OooOo00.f61407OooO0o0;
        }
        this.f61386OooOoO0 = oooOo00OooOOOO;
        return i != this.f61388OooOoo0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(K k) {
        this.f61385OooOoO = null;
        OooOo00<K, V> oooOo00OooOOO = this.f61386OooOoO0.OooOOO(k != null ? k.hashCode() : 0, k, 0, this);
        if (oooOo00OooOOO == null) {
            oooOo00OooOOO = OooOo00.f61407OooO0o0;
        }
        this.f61386OooOoO0 = oooOo00OooOOO;
        return this.f61385OooOoO;
    }
}
