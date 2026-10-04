package OoooOOo;

import OoooO00.InterfaceC21152OooO0Oo;
import OoooO0O.C21157OooO0Oo;
import OoooO0O.C21158OooO0o;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import oO00ooO.C32460OooOooO;
import oO0O00.InterfaceC32497OooO0Oo;

/* JADX INFO: renamed from: OoooOOo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21210OooOo0o<K, V> implements InterfaceC21222Oooo0O0, Map<K, V>, InterfaceC32497OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C21202OooOOOo f61520OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO00o f61521OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C21205OooOOoo f61522OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C21204OooOOo0 f61523OooOoO0;

    /* JADX INFO: renamed from: OoooOOo.OooOo0o$OooO00o */
    public static final class OooO00o<K, V> extends AbstractC21225Oooo0o0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public InterfaceC21152OooO0Oo<K, ? extends V> f61524OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f61525OooO0Oo;

        public OooO00o(InterfaceC21152OooO0Oo<K, ? extends V> interfaceC21152OooO0Oo) {
            this.f61524OooO0OO = interfaceC21152OooO0Oo;
        }

        @Override // OoooOOo.AbstractC21225Oooo0o0
        public final void OooO00o(AbstractC21225Oooo0o0 abstractC21225Oooo0o0) {
            kotlin.jvm.internal.OooOOO0.OooO0o0(abstractC21225Oooo0o0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            OooO00o oooO00o = (OooO00o) abstractC21225Oooo0o0;
            synchronized (C21206OooOo.f61511OooO00o) {
                this.f61524OooO0OO = oooO00o.f61524OooO0OO;
                this.f61525OooO0Oo = oooO00o.f61525OooO0Oo;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
        }

        @Override // OoooOOo.AbstractC21225Oooo0o0
        public final AbstractC21225Oooo0o0 OooO0O0() {
            return new OooO00o(this.f61524OooO0OO);
        }
    }

    public C21210OooOo0o() {
        C21157OooO0Oo c21157OooO0Oo = C21157OooO0Oo.f61380OooOoO0;
        OooO00o oooO00o = new OooO00o(c21157OooO0Oo);
        if (C21200OooOOO0.f61495OooO0O0.OooO0o0() != null) {
            OooO00o oooO00o2 = new OooO00o(c21157OooO0Oo);
            oooO00o2.f61574OooO00o = 1;
            oooO00o.f61575OooO0O0 = oooO00o2;
        }
        this.f61521OooOo0o = oooO00o;
        this.f61520OooOo = new C21202OooOOOo(this);
        this.f61523OooOoO0 = new C21204OooOOo0(this);
        this.f61522OooOoO = new C21205OooOOoo(this);
    }

    public final OooO00o<K, V> OooO00o() {
        OooO00o oooO00o = this.f61521OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (OooO00o) C21200OooOOO0.OooOo00(oooO00o, this);
    }

    @Override // OoooOOo.InterfaceC21222Oooo0O0
    public final void OooO0Oo(AbstractC21225Oooo0o0 abstractC21225Oooo0o0) {
        kotlin.jvm.internal.OooOOO0.OooO0o0(abstractC21225Oooo0o0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f61521OooOo0o = (OooO00o) abstractC21225Oooo0o0;
    }

    @Override // OoooOOo.InterfaceC21222Oooo0O0
    public final AbstractC21225Oooo0o0 OooO0o0() {
        return this.f61521OooOo0o;
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        OooO00o oooO00o = this.f61521OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        OooO00o oooO00o2 = (OooO00o) C21200OooOOO0.OooO(oooO00o);
        C21157OooO0Oo c21157OooO0Oo = C21157OooO0Oo.f61380OooOoO0;
        if (c21157OooO0Oo != oooO00o2.f61524OooO0OO) {
            OooO00o oooO00o3 = this.f61521OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
                OooO00o oooO00o4 = (OooO00o) C21200OooOOO0.OooOo0o(oooO00o3, this, abstractC21194OooO0oOOooOO0O);
                synchronized (C21206OooOo.f61511OooO00o) {
                    oooO00o4.f61524OooO0OO = c21157OooO0Oo;
                    oooO00o4.f61525OooO0Oo++;
                }
            }
            C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return OooO00o().f61524OooO0OO.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return OooO00o().f61524OooO0OO.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return this.f61520OooOo;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return OooO00o().f61524OooO0OO.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return OooO00o().f61524OooO0OO.isEmpty();
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.f61523OooOoO0;
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        InterfaceC21152OooO0Oo<K, ? extends V> interfaceC21152OooO0Oo;
        int i;
        V v2;
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        boolean z;
        do {
            Object obj = C21206OooOo.f61511OooO00o;
            synchronized (obj) {
                OooO00o oooO00o = this.f61521OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                OooO00o oooO00o2 = (OooO00o) C21200OooOOO0.OooO(oooO00o);
                interfaceC21152OooO0Oo = oooO00o2.f61524OooO0OO;
                i = oooO00o2.f61525OooO0Oo;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC21152OooO0Oo);
            C21158OooO0o c21158OooO0o = (C21158OooO0o) interfaceC21152OooO0Oo.builder();
            v2 = (V) c21158OooO0o.put(k, v);
            InterfaceC21152OooO0Oo<K, V> interfaceC21152OooO0OoBuild = c21158OooO0o.build();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC21152OooO0OoBuild, interfaceC21152OooO0Oo)) {
                break;
            }
            OooO00o oooO00o3 = this.f61521OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
                OooO00o oooO00o4 = (OooO00o) C21200OooOOO0.OooOo0o(oooO00o3, this, abstractC21194OooO0oOOooOO0O);
                synchronized (obj) {
                    int i2 = oooO00o4.f61525OooO0Oo;
                    if (i2 == i) {
                        oooO00o4.f61524OooO0OO = interfaceC21152OooO0OoBuild;
                        oooO00o4.f61525OooO0Oo = i2 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, this);
        } while (!z);
        return v2;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        InterfaceC21152OooO0Oo<K, ? extends V> interfaceC21152OooO0Oo;
        int i;
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        boolean z;
        do {
            Object obj = C21206OooOo.f61511OooO00o;
            synchronized (obj) {
                OooO00o oooO00o = this.f61521OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                OooO00o oooO00o2 = (OooO00o) C21200OooOOO0.OooO(oooO00o);
                interfaceC21152OooO0Oo = oooO00o2.f61524OooO0OO;
                i = oooO00o2.f61525OooO0Oo;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC21152OooO0Oo);
            C21158OooO0o c21158OooO0o = (C21158OooO0o) interfaceC21152OooO0Oo.builder();
            c21158OooO0o.putAll(map);
            InterfaceC21152OooO0Oo<K, V> interfaceC21152OooO0OoBuild = c21158OooO0o.build();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC21152OooO0OoBuild, interfaceC21152OooO0Oo)) {
                return;
            }
            OooO00o oooO00o3 = this.f61521OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
                OooO00o oooO00o4 = (OooO00o) C21200OooOOO0.OooOo0o(oooO00o3, this, abstractC21194OooO0oOOooOO0O);
                synchronized (obj) {
                    int i2 = oooO00o4.f61525OooO0Oo;
                    if (i2 == i) {
                        oooO00o4.f61524OooO0OO = interfaceC21152OooO0OoBuild;
                        oooO00o4.f61525OooO0Oo = i2 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, this);
        } while (!z);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        InterfaceC21152OooO0Oo<K, ? extends V> interfaceC21152OooO0Oo;
        int i;
        V vRemove;
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        boolean z;
        do {
            Object obj2 = C21206OooOo.f61511OooO00o;
            synchronized (obj2) {
                OooO00o oooO00o = this.f61521OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                OooO00o oooO00o2 = (OooO00o) C21200OooOOO0.OooO(oooO00o);
                interfaceC21152OooO0Oo = oooO00o2.f61524OooO0OO;
                i = oooO00o2.f61525OooO0Oo;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC21152OooO0Oo);
            InterfaceC21152OooO0Oo.OooO00o<K, ? extends V> oooO00oBuilder = interfaceC21152OooO0Oo.builder();
            vRemove = oooO00oBuilder.remove(obj);
            InterfaceC21152OooO0Oo<K, ? extends V> interfaceC21152OooO0OoBuild = oooO00oBuilder.build();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC21152OooO0OoBuild, interfaceC21152OooO0Oo)) {
                break;
            }
            OooO00o oooO00o3 = this.f61521OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
                OooO00o oooO00o4 = (OooO00o) C21200OooOOO0.OooOo0o(oooO00o3, this, abstractC21194OooO0oOOooOO0O);
                synchronized (obj2) {
                    int i2 = oooO00o4.f61525OooO0Oo;
                    if (i2 == i) {
                        oooO00o4.f61524OooO0OO = interfaceC21152OooO0OoBuild;
                        oooO00o4.f61525OooO0Oo = i2 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, this);
        } while (!z);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return OooO00o().f61524OooO0OO.size();
    }

    public final String toString() {
        OooO00o oooO00o = this.f61521OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((OooO00o) C21200OooOOO0.OooO(oooO00o)).f61524OooO0OO + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f61522OooOoO;
    }
}
