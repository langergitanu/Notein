package oO0oO00;

import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33917OooOO0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class o00O0O implements InterfaceC33911OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00O0O f122263OooO00o = new o00O0O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C34003ooOO f122264OooO0O0 = C34003ooOO.f122294OooO00o;

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        throw new C33917OooOO0("'kotlin.Nothing' does not have instances");
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f122264OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        Void value = (Void) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        throw new C33917OooOO0("'kotlin.Nothing' cannot be serialized");
    }
}
