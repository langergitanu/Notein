package oO0Oo0;

import kotlin.jvm.internal.OooOOO0;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0oO0.C32742OooOOo;
import oO0O0oo0.C32793OooOOO;
import oO0O0oo0.C32795OooOOO0;
import oO0O0ooO.InterfaceC32821OooO0oO;
import oO0Oo0o0.OooOO0;
import oO0OooO0.C33477OooO0OO;
import oOo000Oo.OooOo;
import oOo00OOo.C34497OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34497OooO0o f120107OooO00o;

    public OooO0O0(C34497OooO0o c34497OooO0o) {
        this.f120107OooO00o = c34497OooO0o;
    }

    public final InterfaceC32596OooO0o0 OooO00o(InterfaceC32821OooO0oO interfaceC32821OooO0oO) {
        C33477OooO0OO c33477OooO0OOOooO0OO = interfaceC32821OooO0oO.OooO0OO();
        C32742OooOOo c32742OooOOoOooOo00 = interfaceC32821OooO0oO.OooOo00();
        if (c32742OooOOoOooOo00 != null) {
            InterfaceC32596OooO0o0 interfaceC32596OooO0o0OooO00o = OooO00o(c32742OooOOoOooOo00);
            OooOO0 oooOO0OooOooo = interfaceC32596OooO0o0OooO00o != null ? interfaceC32596OooO0o0OooO00o.OooOooo() : null;
            InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0oO = oooOO0OooOooo != null ? oooOO0OooOooo.OooO0oO(interfaceC32821OooO0oO.getName(), oOo0o0oO.OooO0O0.f123892OooOooO) : null;
            if (interfaceC32598OooO0ooOooO0oO instanceof InterfaceC32596OooO0o0) {
                return (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0oO;
            }
        } else {
            C33477OooO0OO c33477OooO0OOOooO0o0 = c33477OooO0OOOooO0OO.OooO0o0();
            OooOOO0.OooO0o(c33477OooO0OOOooO0o0, "fqName.parent()");
            C32795OooOOO0 c32795OooOOO0 = (C32795OooOOO0) OooOo.Oooo(this.f120107OooO00o.OooO0O0(c33477OooO0OOOooO0o0));
            if (c32795OooOOO0 != null) {
                C32793OooOOO c32793OooOOO = c32795OooOOO0.f117839Oooo00O.f117761OooO0Oo;
                c32793OooOOO.getClass();
                return c32793OooOOO.OooOo0o(interfaceC32821OooO0oO.getName(), interfaceC32821OooO0oO);
            }
        }
        return null;
    }
}
