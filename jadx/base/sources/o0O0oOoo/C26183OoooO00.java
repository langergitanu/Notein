package o0O0oOoo;

import OooOoo0.C20678Oooo0O0;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooooo.AbstractC21396OooO0O0;
import com.orion.niui.components.button.SymbolButtonView;
import o000oOoO.C24636OooO0O0;
import o0O0ooo.C26233OooOO0;
import o0OOO0o.C27049OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0O0oOoo.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26183OoooO00 implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ SymbolButtonView f89391OooOo0o;

    public C26183OoooO00(SymbolButtonView symbolButtonView) {
        this.f89391OooOo0o = symbolButtonView;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 3) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            SymbolButtonView symbolButtonView = this.f89391OooOo0o;
            AbstractC21396OooO0O0 abstractC21396OooO0O0OooO00o = C27049OooO0Oo.OooO00o(symbolButtonView.getIconResState(), interfaceC21033OooOOOO2);
            Boolean useDarkThemeState = symbolButtonView.getUseDarkThemeState();
            interfaceC21033OooOOOO2.OooOo00(2007426949);
            boolean zOooO0O0 = useDarkThemeState == null ? C20678Oooo0O0.OooO0O0(interfaceC21033OooOOOO2) : useDarkThemeState.booleanValue();
            interfaceC21033OooOOOO2.OooOoo();
            C26233OooOO0.OooO00o(zOooO0O0, C24636OooO0O0.OooO0O0(interfaceC21033OooOOOO2, -1123085831, new C26172Oooo(symbolButtonView, abstractC21396OooO0O0OooO00o)), interfaceC21033OooOOOO2, 48);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
