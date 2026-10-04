package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C21796OooOOOo;
import androidx.datastore.preferences.protobuf.OooOo;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21797OooOOo extends AbstractC21798OooOOo0<OooOo.C21800OooO0Oo> {
    @Override // androidx.datastore.preferences.protobuf.AbstractC21798OooOOo0
    public final void OooO(Object obj) throws IOException {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC21798OooOOo0
    public final void OooO00o(Map.Entry entry) {
        ((OooOo.C21800OooO0Oo) entry.getKey()).getClass();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC21798OooOOo0
    public final OooOo.C21801OooO0o0 OooO0O0(C21796OooOOOo c21796OooOOOo, InterfaceC21822OoooO0 interfaceC21822OoooO0, int i) {
        c21796OooOOOo.getClass();
        return c21796OooOOOo.f64456OooO00o.get(new C21796OooOOOo.OooO00o(i, interfaceC21822OoooO0));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC21798OooOOo0
    public final OooOo00<OooOo.C21800OooO0Oo> OooO0OO(Object obj) {
        return ((OooOo.OooO0OO) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC21798OooOOo0
    public final OooOo00<OooOo.C21800OooO0Oo> OooO0Oo(Object obj) {
        OooOo.OooO0OO oooO0OO = (OooOo.OooO0OO) obj;
        OooOo00<OooOo.C21800OooO0Oo> oooOo00 = oooO0OO.extensions;
        if (oooOo00.f64477OooO0O0) {
            oooO0OO.extensions = oooOo00.clone();
        }
        return oooO0OO.extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC21798OooOOo0
    public final void OooO0o(Object obj) {
        ((OooOo.OooO0OO) obj).extensions.OooO0oo();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC21798OooOOo0
    public final boolean OooO0o0(InterfaceC21822OoooO0 interfaceC21822OoooO0) {
        return interfaceC21822OoooO0 instanceof OooOo.OooO0OO;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC21798OooOOo0
    public final Object OooO0oO(Object obj) throws IOException {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC21798OooOOo0
    public final void OooO0oo(Object obj) throws IOException {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC21798OooOOo0
    public final void OooOO0(Map.Entry entry) throws IOException {
        ((OooOo.C21800OooO0Oo) entry.getKey()).getClass();
        throw null;
    }
}
