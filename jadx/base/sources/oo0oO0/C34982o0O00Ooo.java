package oo0oO0;

import o000ooo.InterfaceC24747OooO0O0;
import o000ooo.InterfaceC24749OooO0Oo;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: oo0oO0.o0O00Ooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C34982o0O00Ooo implements InterfaceC32507OooOO0o {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) throws Exception {
        InterfaceC24749OooO0Oo interfaceC24749OooO0OoO0ooOOo = ((InterfaceC24747OooO0O0) obj).o0ooOOo("DELETE FROM TextBoxEntity");
        try {
            interfaceC24749OooO0OoO0ooOOo.o00oO0o();
            interfaceC24749OooO0OoO0ooOOo.close();
            return null;
        } catch (Throwable th) {
            interfaceC24749OooO0OoO0ooOOo.close();
            throw th;
        }
    }
}
