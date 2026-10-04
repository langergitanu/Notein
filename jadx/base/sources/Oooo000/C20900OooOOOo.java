package Oooo000;

import OooOoo.C20595OooO0o0;
import OooooO0.C21289OooO0o;
import OooooO0.C21291OooO0oO;
import o00oO0o.C25570OooO;
import o00oO0o.InterfaceC25577OooO0oO;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33633Oooo0;
import oo000o.InterfaceC34635OooOOOO;

/* JADX INFO: renamed from: Oooo000.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20900OooOOOo extends OooO0O0 implements InterfaceC25577OooO0oO<InterfaceC20895OooO0Oo>, InterfaceC20895OooO0Oo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C20595OooO0o0 f60289OooOoO;

    public static final C21291OooO0oO OooO0o0(C20900OooOOOo c20900OooOOOo, InterfaceC34635OooOOOO interfaceC34635OooOOOO, oO0O000o.OooO00o oooO00o) {
        C21291OooO0oO c21291OooO0oO;
        InterfaceC34635OooOOOO interfaceC34635OooOOOO2 = c20900OooOOOo.f60254OooOoO0;
        if (interfaceC34635OooOOOO2 == null || !interfaceC34635OooOOOO2.OooOo()) {
            interfaceC34635OooOOOO2 = null;
        }
        if (interfaceC34635OooOOOO2 != null) {
            if (!interfaceC34635OooOOOO.OooOo()) {
                interfaceC34635OooOOOO = null;
            }
            if (interfaceC34635OooOOOO != null && (c21291OooO0oO = (C21291OooO0oO) oooO00o.invoke()) != null) {
                C21291OooO0oO c21291OooO0oOOooO0o = interfaceC34635OooOOOO2.OooO0o(interfaceC34635OooOOOO, false);
                return c21291OooO0oO.OooO0o(C21289OooO0o.OooO00o(c21291OooO0oOOooO0o.f61724OooO00o, c21291OooO0oOOooO0o.f61725OooO0O0));
            }
        }
        return null;
    }

    @Override // Oooo000.InterfaceC20895OooO0Oo
    public final Object OooO00o(InterfaceC34635OooOOOO interfaceC34635OooOOOO, oO0O000o.OooO00o oooO00o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooO0o0 = C33633Oooo0.OooO0o0(new OooOOO(this, interfaceC34635OooOOOO, oooO00o, new OooOOOO(this, interfaceC34635OooOOOO, oooO00o), null), abstractC32479OooO0OO);
        return objOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // o00oO0o.InterfaceC25577OooO0oO
    public final C25570OooO<InterfaceC20895OooO0Oo> getKey() {
        return OooO0OO.f60255OooO00o;
    }

    @Override // o00oO0o.InterfaceC25577OooO0oO
    public final InterfaceC20895OooO0Oo getValue() {
        return this;
    }
}
