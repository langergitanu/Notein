package oO0oO00;

import oO00ooO.C32450OooOo;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000O0O implements InterfaceC33911OooO0OO<C32450OooOo> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o0000O0O f122243OooO00o = new o0000O0O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33962Oooo f122244OooO0O0 = Oooo0.OooOo00.OooO0oo("kotlin.ULong", C33983OooooO0.f122206OooO00o);

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        return new C32450OooOo(oooO0OO.OooOo0O(f122244OooO0O0).OooO0o0());
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return f122244OooO0O0;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        long j = ((C32450OooOo) obj).f116650OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        encoder.OooO0oo(f122244OooO0O0).OooOo0o(j);
    }
}
