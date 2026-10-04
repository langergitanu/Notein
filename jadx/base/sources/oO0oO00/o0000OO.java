package oO0oO00;

import oO00ooO.C32460OooOooO;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000OO implements InterfaceC33911OooO0OO<C32460OooOooO> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0000OO f122245OooO0O0 = new o0000OO();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o00Ooo<C32460OooOooO> f122246OooO00o = new o00Ooo<>(C32460OooOooO.f116667OooO00o);

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final Object deserialize(oO0oO000.OooO0OO oooO0OO) {
        this.f122246OooO00o.deserialize(oooO0OO);
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return this.f122246OooO00o.getDescriptor();
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, Object obj) {
        C32460OooOooO value = (C32460OooOooO) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        this.f122246OooO00o.serialize(encoder, value);
    }
}
