package com.orion.niui.components.button;

import OooOoo0.C20678Oooo0O0;
import Oooo0oO.InterfaceC21033OooOOOO;
import OooooOO.C21348Ooooo0o;
import com.orion.niui.components.button.SelectableTextButtonView;
import o0000Ooo.C24232OooO0o0;
import o0000Ooo.InterfaceC24229OooO0OO;
import o000oOoO.C24636OooO0O0;
import o0O0oOoo.C26166OooOoO0;
import o0O0oOoo.C26174Oooo00o;
import o0O0oOoo.OooOo;
import o0O0ooo.C26233OooOO0;
import o0ooOO0.C31552Oooooo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO00o implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ SelectableTextButtonView f69454OooOo0o;

    public OooO00o(SelectableTextButtonView selectableTextButtonView) {
        this.f69454OooOo0o = selectableTextButtonView;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        OooOo oooOoOooO00o;
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 3) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            SelectableTextButtonView selectableTextButtonView = this.f69454OooOo0o;
            Boolean useDarkThemeState = selectableTextButtonView.getUseDarkThemeState();
            interfaceC21033OooOOOO2.OooOo00(696654608);
            boolean zOooO0O0 = useDarkThemeState == null ? C20678Oooo0O0.OooO0O0(interfaceC21033OooOOOO2) : useDarkThemeState.booleanValue();
            interfaceC21033OooOOOO2.OooOoo();
            InterfaceC24229OooO0OO interfaceC24229OooO0OO = (InterfaceC24229OooO0OO) interfaceC21033OooOOOO2.OooO0o0(C31552Oooooo.f112773OooO0o0);
            Float minWidthPxState = selectableTextButtonView.getMinWidthPxState();
            C24232OooO0o0 c24232OooO0o0 = minWidthPxState != null ? new C24232OooO0o0(minWidthPxState.floatValue() / interfaceC24229OooO0OO.getDensity()) : null;
            Float maxWidthPxState = selectableTextButtonView.getMaxWidthPxState();
            C24232OooO0o0 c24232OooO0o02 = maxWidthPxState != null ? new C24232OooO0o0(maxWidthPxState.floatValue() / interfaceC24229OooO0OO.getDensity()) : null;
            C21348Ooooo0o c21348Ooooo0oM80723getAccentColorStateQN2ZGVo = selectableTextButtonView.m80723getAccentColorStateQN2ZGVo();
            interfaceC21033OooOOOO2.OooOo00(696663933);
            if (c21348Ooooo0oM80723getAccentColorStateQN2ZGVo == null) {
                oooOoOooO00o = null;
            } else {
                float f = C26166OooOoO0.f89306OooO00o;
                oooOoOooO00o = C26166OooOoO0.OooO00o(new SelectableTextButtonView.OooO00o(c21348Ooooo0oM80723getAccentColorStateQN2ZGVo.f61768OooO00o), interfaceC21033OooOOOO2, 14);
            }
            interfaceC21033OooOOOO2.OooOoo();
            interfaceC21033OooOOOO2.OooOo00(696663416);
            if (oooOoOooO00o == null) {
                oooOoOooO00o = C26166OooOoO0.OooO00o(null, interfaceC21033OooOOOO2, 15);
            }
            interfaceC21033OooOOOO2.OooOoo();
            C26233OooOO0.OooO00o(zOooO0O0, C24636OooO0O0.OooO0O0(interfaceC21033OooOOOO2, -1803089959, new C26174Oooo00o(selectableTextButtonView, c24232OooO0o0, c24232OooO0o02, oooOoOooO00o)), interfaceC21033OooOOOO2, 48);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
