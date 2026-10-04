package o0O0oOoo;

import OooOoo0.C20678Oooo0O0;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooooo.AbstractC21396OooO0O0;
import com.orion.niui.components.button.SelectableSymbolButtonView;
import o000oOoO.C24636OooO0O0;
import o0O0ooo.C26233OooOO0;
import o0OOO0o.C27049OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0O0oOoo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26164OooOo0o implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ SelectableSymbolButtonView f89304OooOo0o;

    public C26164OooOo0o(SelectableSymbolButtonView selectableSymbolButtonView) {
        this.f89304OooOo0o = selectableSymbolButtonView;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 3) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            SelectableSymbolButtonView selectableSymbolButtonView = this.f89304OooOo0o;
            AbstractC21396OooO0O0 abstractC21396OooO0O0OooO00o = C27049OooO0Oo.OooO00o(selectableSymbolButtonView.getIconResState(), interfaceC21033OooOOOO2);
            Boolean useDarkThemeState = selectableSymbolButtonView.getUseDarkThemeState();
            interfaceC21033OooOOOO2.OooOo00(-1357546341);
            boolean zOooO0O0 = useDarkThemeState == null ? C20678Oooo0O0.OooO0O0(interfaceC21033OooOOOO2) : useDarkThemeState.booleanValue();
            interfaceC21033OooOOOO2.OooOoo();
            C26233OooOO0.OooO00o(zOooO0O0, C24636OooO0O0.OooO0O0(interfaceC21033OooOOOO2, 1649346745, new C26163OooOo0O(selectableSymbolButtonView, abstractC21396OooO0O0OooO00o)), interfaceC21033OooOOOO2, 48);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
