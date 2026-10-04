package oO0oO00;

import oO0o.AbstractC33526OooO0Oo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class o00000OO implements InterfaceC33911OooO0OO<String> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00000OO f122230OooO00o = new o00000OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final oo0o0Oo f122231OooO0O0 = new oo0o0Oo("kotlin.String", AbstractC33526OooO0Oo.OooO.f121105OooO00o);

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        return oooO0OO.OooOO0();
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f122231OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        String value = (String) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        encoder.OooOOoo(value);
    }
}
