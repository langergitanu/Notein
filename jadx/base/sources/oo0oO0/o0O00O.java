package oo0oO0;

import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o0O00O implements InterfaceC32507OooOO0o {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM StrokeEntity");
        try {
            interfaceC24749OooO0OoO0ooOOo.o00oO0o();
            return C32460OooOooO.f116667OooO00o;
        } finally {
            interfaceC24749OooO0OoO0ooOOo.close();
        }
    }
}
