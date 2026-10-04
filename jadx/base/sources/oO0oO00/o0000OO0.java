package oO0oO00;

import oO00ooO.C32457OooOoOO;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000OO0 implements InterfaceC33911OooO0OO<C32457OooOoOO> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0000OO0 f122247OooO00o = new o0000OO0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33962Oooo f122248OooO0O0 = Oooo0.OooOo00.OooO0oo("kotlin.UShort", o00000O.f122227OooO00o);

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        return new C32457OooOoOO(oooO0OO.OooOo0O(f122248OooO0O0).OooO0o());
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f122248OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        short s = ((C32457OooOoOO) obj).f116663OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        encoder.OooO0oo(f122248OooO0O0).OooOO0O(s);
    }
}
