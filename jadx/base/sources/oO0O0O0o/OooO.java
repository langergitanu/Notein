package oO0O0O0o;

import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0Oo0.C32692Oooo0o0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO implements InterfaceC32507OooOO0o<C33479OooO0o, InterfaceC32596OooO0o0> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f117096OooOo0o;

    public OooO(OooOO0 oooOO02) {
        this.f117096OooOo0o = oooOO02;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final InterfaceC32596OooO0o0 invoke(C33479OooO0o c33479OooO0o) {
        C33479OooO0o c33479OooO0o2 = c33479OooO0o;
        C32692Oooo0o0 c32692Oooo0o0OooOO0O = this.f117096OooOo0o.OooOO0O();
        C33477OooO0OO c33477OooO0OO = OooOOO.f117143OooOO0O;
        oO0Oo0o0.OooOO0 oooOO0OooOOO0 = c32692Oooo0o0OooOO0O.o00oO0o(c33477OooO0OO).OooOOO0();
        if (oooOO0OooOOO0 == null) {
            OooOO0.OooO00o(11);
            throw null;
        }
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0oO = ((oO0Oo0o0.OooO00o) oooOO0OooOOO0).OooO0oO(c33479OooO0o2, oOo0o0oO.OooO0O0.f123886OooOo0o);
        if (interfaceC32598OooO0ooOooO0oO == null) {
            throw new AssertionError("Built-in class " + c33477OooO0OO.OooO0OO(c33479OooO0o2) + " is not found");
        }
        if (interfaceC32598OooO0ooOooO0oO instanceof InterfaceC32596OooO0o0) {
            return (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0oO;
        }
        throw new AssertionError("Must be a class descriptor " + c33479OooO0o2 + ", but was " + interfaceC32598OooO0ooOooO0oO);
    }
}
