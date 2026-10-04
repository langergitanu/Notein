package o0O0oo;

import OooOoo0.C20678Oooo0O0;
import Oooo0oO.InterfaceC21033OooOOOO;
import com.orion.niui.components.listitems.SwitchListItemView;
import o000oOoO.C24636OooO0O0;
import o0O0ooo.C26233OooOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0o implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ SwitchListItemView f89434OooOo0o;

    public OooO0o(SwitchListItemView switchListItemView) {
        this.f89434OooOo0o = switchListItemView;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 3) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            SwitchListItemView switchListItemView = this.f89434OooOo0o;
            Boolean useDarkThemeState = switchListItemView.getUseDarkThemeState();
            interfaceC21033OooOOOO2.OooOo00(-693514482);
            boolean zOooO0O0 = useDarkThemeState == null ? C20678Oooo0O0.OooO0O0(interfaceC21033OooOOOO2) : useDarkThemeState.booleanValue();
            interfaceC21033OooOOOO2.OooOoo();
            C26233OooOO0.OooO00o(zOooO0O0, C24636OooO0O0.OooO0O0(interfaceC21033OooOOOO2, 14400041, new C26195OooO0o0(switchListItemView)), interfaceC21033OooOOOO2, 48);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
