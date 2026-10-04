package oO0oO00;

import oO0o.AbstractC33526OooO0Oo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: oO0oO00.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33942OooOO0O implements InterfaceC33911OooO0OO<Byte> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33942OooOO0O f122147OooO00o = new C33942OooOO0O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final oo0o0Oo f122148OooO0O0 = new oo0o0Oo("kotlin.Byte", AbstractC33526OooO0Oo.OooO0O0.f121107OooO00o);

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        return Byte.valueOf(oooO0OO.Oooo000());
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f122148OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        byte bByteValue = ((Number) obj).byteValue();
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        encoder.OooO0o0(bByteValue);
    }
}
