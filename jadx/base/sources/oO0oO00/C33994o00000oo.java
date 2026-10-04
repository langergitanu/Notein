package oO0oO00;

import oO00ooO.C32452OooOo00;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: oO0oO00.o00000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33994o00000oo implements InterfaceC33911OooO0OO<C32452OooOo00> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33994o00000oo f122238OooO00o = new C33994o00000oo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33962Oooo f122239OooO0O0 = Oooo0.OooOo00.OooO0oo("kotlin.UByte", C33942OooOO0O.f122147OooO00o);

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        return new C32452OooOo00(oooO0OO.OooOo0O(f122239OooO0O0).Oooo000());
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f122239OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        byte b = ((C32452OooOo00) obj).f116654OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        encoder.OooO0oo(f122239OooO0O0).OooO0o0(b);
    }
}
