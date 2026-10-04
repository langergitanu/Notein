package oO0oO00;

import oO0o.AbstractC33526OooO0Oo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: oO0oO00.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33957OooOoOO implements InterfaceC33911OooO0OO<Double> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33957OooOoOO f122166OooO00o = new C33957OooOoOO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final oo0o0Oo f122167OooO0O0 = new oo0o0Oo("kotlin.Double", AbstractC33526OooO0Oo.C20320OooO0Oo.f121109OooO00o);

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        return Double.valueOf(oooO0OO.OooO0oO());
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f122167OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        encoder.OooOo00(dDoubleValue);
    }
}
