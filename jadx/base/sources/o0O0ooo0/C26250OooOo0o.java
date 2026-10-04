package o0O0ooo0;

import OooOoo0.C20678Oooo0O0;
import Oooo0oO.InterfaceC21033OooOOOO;
import com.orion.niui.components.textinput.LabeledTextFieldView;
import o000oOoO.C24636OooO0O0;
import o0O0ooo.C26233OooOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0O0ooo0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26250OooOo0o implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ LabeledTextFieldView f89704OooOo0o;

    public C26250OooOo0o(LabeledTextFieldView labeledTextFieldView) {
        this.f89704OooOo0o = labeledTextFieldView;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 3) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            LabeledTextFieldView labeledTextFieldView = this.f89704OooOo0o;
            Boolean useDarkThemeState = labeledTextFieldView.getUseDarkThemeState();
            interfaceC21033OooOOOO2.OooOo00(913184584);
            boolean zOooO0O0 = useDarkThemeState == null ? C20678Oooo0O0.OooO0O0(interfaceC21033OooOOOO2) : useDarkThemeState.booleanValue();
            interfaceC21033OooOOOO2.OooOoo();
            C26233OooOO0.OooO00o(zOooO0O0, C24636OooO0O0.OooO0O0(interfaceC21033OooOOOO2, 2095579844, new C26249OooOo0O(labeledTextFieldView)), interfaceC21033OooOOOO2, 48);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
