package oO0o0o0O;

import oO00oO0.C32396OooO00o;
import oO00oO0.EnumC32397OooO0O0;
import oO00oO0o.C32409OooO00o;
import oO0OO0oO.InterfaceC32925OooO0O0;
import oO0o0OO.C33628OooOoo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.EnumC33637Oooo0O0;
import oO0o0o0o.C33874OooO0OO;
import oOo0000O.InterfaceC34412OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0o0O.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C33868OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC34415OooO0oo f122008OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C33862OooO0o f122009OooO0O0;

    public /* synthetic */ C33868OooOO0o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, C33862OooO0o c33862OooO0o) {
        this.f122008OooO00o = interfaceC34415OooO0oo;
        this.f122009OooO0O0 = c33862OooO0o;
    }

    public final void OooO00o(C32409OooO00o.C20227OooO00o c20227OooO00o) {
        InterfaceC34415OooO0oo interfaceC34415OooO0ooOooO00o = C33628OooOoo.OooO00o(oOo0000O.OooO.f123416OooOo0o, this.f122008OooO00o, true);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        if (interfaceC34415OooO0ooOooO00o != c33874OooO0OO && interfaceC34415OooO0ooOooO00o.get(InterfaceC34412OooO0o.OooO00o.f123422OooOo0o) == null) {
            interfaceC34415OooO0ooOooO00o = interfaceC34415OooO0ooOooO00o.plus(c33874OooO0OO);
        }
        C33867OooOO0O c33867OooOO0O = new C33867OooOO0O(interfaceC34415OooO0ooOooO00o, c20227OooO00o);
        C32396OooO00o c32396OooO00o = new C32396OooO00o(new C33863OooO0o0(c33867OooOO0O));
        while (true) {
            InterfaceC32925OooO0O0 interfaceC32925OooO0O0 = c20227OooO00o.get();
            if (interfaceC32925OooO0O0 == EnumC32397OooO0O0.f116501OooOo0o) {
                c32396OooO00o.dispose();
                break;
            }
            while (!c20227OooO00o.compareAndSet(interfaceC32925OooO0O0, c32396OooO00o)) {
                if (c20227OooO00o.get() != interfaceC32925OooO0O0) {
                    break;
                }
            }
            if (interfaceC32925OooO0O0 != null) {
                interfaceC32925OooO0O0.dispose();
            }
        }
        c33867OooOO0O.Ooooooo(EnumC33637Oooo0O0.f121317OooOo0o, c33867OooOO0O, this.f122009OooO0O0);
    }
}
