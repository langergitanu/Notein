package o0O0oOoo;

import OooOoo0.C20678Oooo0O0;
import Oooo0oO.InterfaceC21033OooOOOO;
import com.orion.niui.components.button.TextButtonView;
import o0000Ooo.C24232OooO0o0;
import o0000Ooo.InterfaceC24229OooO0OO;
import o000oOoO.C24636OooO0O0;
import o0O0ooo.C26233OooOO0;
import o0ooOO0.C31552Oooooo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0o0Oo.C34698OooOo00;

/* JADX INFO: renamed from: o0O0oOoo.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26190OoooOoo implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ TextButtonView f89419OooOo0o;

    public C26190OoooOoo(TextButtonView textButtonView) {
        this.f89419OooOo0o = textButtonView;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 3) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            TextButtonView textButtonView = this.f89419OooOo0o;
            Boolean useDarkThemeState = textButtonView.getUseDarkThemeState();
            interfaceC21033OooOOOO2.OooOo00(87866330);
            boolean zOooO0O0 = useDarkThemeState == null ? C20678Oooo0O0.OooO0O0(interfaceC21033OooOOOO2) : useDarkThemeState.booleanValue();
            interfaceC21033OooOOOO2.OooOoo();
            InterfaceC24229OooO0OO interfaceC24229OooO0OO = (InterfaceC24229OooO0OO) interfaceC21033OooOOOO2.OooO0o0(C31552Oooooo.f112773OooO0o0);
            Float minWidthPxState = textButtonView.getMinWidthPxState();
            C24232OooO0o0 c24232OooO0o0 = minWidthPxState != null ? new C24232OooO0o0(minWidthPxState.floatValue() / interfaceC24229OooO0OO.getDensity()) : null;
            Float maxWidthPxState = textButtonView.getMaxWidthPxState();
            C24232OooO0o0 c24232OooO0o02 = maxWidthPxState != null ? new C24232OooO0o0(maxWidthPxState.floatValue() / interfaceC24229OooO0OO.getDensity()) : null;
            Float heightPxState = textButtonView.getHeightPxState();
            float fFloatValue = heightPxState != null ? heightPxState.floatValue() / interfaceC24229OooO0OO.getDensity() : C26184OoooO0O.f89392OooO00o;
            C34698OooOo00 c34698OooOo00OooO00o = C26184OoooO0O.OooO00o(interfaceC21033OooOOOO2);
            C34698OooOo00 textStyleState = textButtonView.getTextStyleState();
            if (textStyleState != null) {
                c34698OooOo00OooO00o = c34698OooOo00OooO00o.OooO0O0(textStyleState);
            }
            C26233OooOO0.OooO00o(zOooO0O0, C24636OooO0O0.OooO0O0(interfaceC21033OooOOOO2, -274464295, new C26189OoooOoO(textButtonView, c24232OooO0o0, c24232OooO0o02, fFloatValue, c34698OooOo00OooO00o)), interfaceC21033OooOOOO2, 48);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
