package oO0oO00;

import oO0o.AbstractC33526OooO0Oo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: oO0oO00.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33940OooO0oo implements InterfaceC33911OooO0OO<Boolean> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33940OooO0oo f122144OooO00o = new C33940OooO0oo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final oo0o0Oo f122145OooO0O0 = new oo0o0Oo("kotlin.Boolean", AbstractC33526OooO0Oo.OooO00o.f121106OooO00o);

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        return Boolean.valueOf(oooO0OO.OooOoO());
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f122145OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        encoder.OooOOO0(zBooleanValue);
    }
}
