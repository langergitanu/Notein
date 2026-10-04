package OoooOOo;

import OoooO00.InterfaceC21150OooO0O0;
import OoooO00.InterfaceC21152OooO0Oo;
import OoooOOo.C21210OooOo0o;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: OoooOOo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21204OooOOo0<K, V> extends AbstractC21203OooOOo<K, V, K> {
    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        C21206OooOo.OooO00o();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        C21206OooOo.OooO00o();
        throw null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f61510OooOo0o.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f61510OooOo0o.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C21210OooOo0o<K, V> c21210OooOo0o = this.f61510OooOo0o;
        return new C21221Oooo00o(c21210OooOo0o, ((InterfaceC21150OooO0O0) c21210OooOo0o.OooO00o().f61524OooO0OO.entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f61510OooOo0o.remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (this.f61510OooOo0o.remove(it.next()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        InterfaceC21152OooO0Oo<K, ? extends V> interfaceC21152OooO0Oo;
        int i;
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        boolean z;
        Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(collection);
        C21210OooOo0o<K, V> c21210OooOo0o = this.f61510OooOo0o;
        boolean z2 = false;
        do {
            synchronized (C21206OooOo.f61511OooO00o) {
                C21210OooOo0o.OooO00o oooO00o = c21210OooOo0o.f61521OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C21210OooOo0o.OooO00o oooO00o2 = (C21210OooOo0o.OooO00o) C21200OooOOO0.OooO(oooO00o);
                interfaceC21152OooO0Oo = oooO00o2.f61524OooO0OO;
                i = oooO00o2.f61525OooO0Oo;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC21152OooO0Oo);
            InterfaceC21152OooO0Oo.OooO00o<K, ? extends V> oooO00oBuilder = interfaceC21152OooO0Oo.builder();
            Object it = c21210OooOo0o.f61520OooOo.iterator();
            while (((AbstractC21220Oooo00O) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C21219Oooo000) it).next();
                if (!setO0OO00O.contains(entry.getKey())) {
                    oooO00oBuilder.remove(entry.getKey());
                    z2 = true;
                }
            }
            C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
            InterfaceC21152OooO0Oo<K, ? extends V> interfaceC21152OooO0OoBuild = oooO00oBuilder.build();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC21152OooO0OoBuild, interfaceC21152OooO0Oo)) {
                break;
            }
            C21210OooOo0o.OooO00o oooO00o3 = c21210OooOo0o.f61521OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
                C21210OooOo0o.OooO00o oooO00o4 = (C21210OooOo0o.OooO00o) C21200OooOOO0.OooOo0o(oooO00o3, c21210OooOo0o, abstractC21194OooO0oOOooOO0O);
                synchronized (C21206OooOo.f61511OooO00o) {
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
            C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, c21210OooOo0o);
        } while (!z);
        return z2;
    }
}
