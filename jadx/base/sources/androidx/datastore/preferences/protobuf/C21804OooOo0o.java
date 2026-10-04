package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.OooOo;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21804OooOo0o implements InterfaceC21823OoooO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C21804OooOo0o f64481OooO00o = new C21804OooOo0o();

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21823OoooO00
    public final boolean isSupported(Class<?> cls) {
        return OooOo.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC21823OoooO00
    public final InterfaceC21812Oooo messageInfoFor(Class<?> cls) {
        if (!OooOo.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC21812Oooo) OooOo.OooO0oO(cls.asSubclass(OooOo.class)).OooO0o(OooOo.OooO0o.f64466OooOoO0);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}
