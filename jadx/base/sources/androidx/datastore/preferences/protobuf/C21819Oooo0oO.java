package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C21816Oooo0OO;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21819Oooo0oO implements InterfaceC21817Oooo0o {
    @Override // androidx.datastore.preferences.protobuf.InterfaceC21817Oooo0o
    public final C21818Oooo0o0 OooO00o() {
        return C21818Oooo0o0.f64514OooOo.OooO0Oo();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21817Oooo0o
    public final C21818Oooo0o0 forMapData(Object obj) {
        return (C21818Oooo0o0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21817Oooo0o
    public final C21816Oooo0OO.OooO00o<?, ?> forMapMetadata(Object obj) {
        return ((C21816Oooo0OO) obj).f64510OooO00o;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21817Oooo0o
    public final C21818Oooo0o0 forMutableMapData(Object obj) {
        return (C21818Oooo0o0) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21817Oooo0o
    public final int getSerializedSize(int i, Object obj, Object obj2) {
        C21818Oooo0o0 c21818Oooo0o0 = (C21818Oooo0o0) obj;
        C21816Oooo0OO c21816Oooo0OO = (C21816Oooo0OO) obj2;
        int iOooO = 0;
        if (c21818Oooo0o0.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : c21818Oooo0o0.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            c21816Oooo0OO.getClass();
            int iOooO0oo = AbstractC21794OooOO0o.OooO0oo(i);
            int iOooO00o = C21816Oooo0OO.OooO00o(c21816Oooo0OO.f64510OooO00o, key, value);
            iOooO += AbstractC21794OooOO0o.OooO(iOooO00o) + iOooO00o + iOooO0oo;
        }
        return iOooO;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21817Oooo0o
    public final boolean isImmutable(Object obj) {
        return !((C21818Oooo0o0) obj).f64515OooOo0o;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21817Oooo0o
    public final C21818Oooo0o0 mergeFrom(Object obj, Object obj2) {
        C21818Oooo0o0 c21818Oooo0o0OooO0Oo = (C21818Oooo0o0) obj;
        C21818Oooo0o0 c21818Oooo0o0 = (C21818Oooo0o0) obj2;
        if (!c21818Oooo0o0.isEmpty()) {
            if (!c21818Oooo0o0OooO0Oo.f64515OooOo0o) {
                c21818Oooo0o0OooO0Oo = c21818Oooo0o0OooO0Oo.OooO0Oo();
            }
            c21818Oooo0o0OooO0Oo.OooO0O0();
            if (!c21818Oooo0o0.isEmpty()) {
                c21818Oooo0o0OooO0Oo.putAll(c21818Oooo0o0);
            }
        }
        return c21818Oooo0o0OooO0Oo;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21817Oooo0o
    public final Object toImmutable(Object obj) {
        ((C21818Oooo0o0) obj).f64515OooOo0o = false;
        return obj;
    }
}
