package oO0oO00;

import oO00ooO.C32453OooOo0O;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: renamed from: oO0oO00.o0000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33997o0000oo implements InterfaceC33911OooO0OO<C32453OooOo0O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33997o0000oo f122255OooO00o = new C33997o0000oo();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33962Oooo f122256OooO0O0 = Oooo0.OooOo00.OooO0oo("kotlin.UInt", C33971OoooO.f122193OooO00o);

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        return new C32453OooOo0O(oooO0OO.OooOo0O(f122256OooO0O0).OooOOo());
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f122256OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        int i = ((C32453OooOo0O) obj).f116655OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        encoder.OooO0oo(f122256OooO0O0).OooOOOO(i);
    }
}
