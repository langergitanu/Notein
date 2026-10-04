package oO00O;

import javax.crypto.spec.SecretKeySpec;
import oOO00o0.C34370OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<byte[]> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32161Oooo0O0 f115303OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(C32161Oooo0O0 c32161Oooo0O0) {
        super(0);
        this.f115303OooOo0o = c32161Oooo0O0;
    }

    @Override // oO0O000o.OooO00o
    public final byte[] invoke() {
        C32161Oooo0O0 c32161Oooo0O0 = this.f115303OooOo0o;
        C32167OoooO c32167OoooO = c32161Oooo0O0.serverHello;
        if (c32167OoooO == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("serverHello");
            throw null;
        }
        SecretKeySpec secretKeySpec = c32161Oooo0O0.masterSecret;
        if (secretKeySpec == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("masterSecret");
            throw null;
        }
        C32167OoooO c32167OoooO2 = c32161Oooo0O0.serverHello;
        if (c32167OoooO2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("serverHello");
            throw null;
        }
        byte[] bArrOooOOoo = Oooo.OooO0OO.OooOOoo(c32167OoooO2.f115392OooO00o, c32161Oooo0O0.f115369OooOoO);
        C32139OooO0Oo c32139OooO0Oo = c32167OoooO.f115394OooO0OO;
        int i = c32139OooO0Oo.f115259OooOOOO;
        byte[] bArr = C32142OooO0oo.f115268OooO00o;
        return C34370OooO0o0.OooO00o(secretKeySpec, C32142OooO0oo.f115269OooO0O0, bArrOooOOoo, (c32139OooO0Oo.f115252OooO0oO * 2) + (i * 2) + (c32139OooO0Oo.f115260OooOOOo * 2));
    }
}
