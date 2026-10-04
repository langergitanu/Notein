package o0O0oOoo;

import OooOooo.C20803Ooooo0o;
import Oooo0oO.InterfaceC21033OooOOOO;
import OoooOoO.InterfaceC21233OooO0o;
import com.orion.niui.components.button.SelectableTextButtonView;
import o0000Ooo.C24232OooO0o0;
import o00oo0Oo.C25715Oooo00o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0O0oOoo.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26174Oooo00o implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24232OooO0o0 f89337OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ SelectableTextButtonView f89338OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ OooOo f89339OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24232OooO0o0 f89340OooOoO0;

    public C26174Oooo00o(SelectableTextButtonView selectableTextButtonView, C24232OooO0o0 c24232OooO0o0, C24232OooO0o0 c24232OooO0o02, OooOo oooOo) {
        this.f89338OooOo0o = selectableTextButtonView;
        this.f89337OooOo = c24232OooO0o0;
        this.f89340OooOoO0 = c24232OooO0o02;
        this.f89339OooOoO = oooOo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 3) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            SelectableTextButtonView selectableTextButtonView = this.f89338OooOo0o;
            String textState = selectableTextButtonView.getTextState();
            boolean selectedState = selectableTextButtonView.getSelectedState();
            interfaceC21033OooOOOO2.OooOo00(1128327069);
            boolean zOooOo0o = interfaceC21033OooOOOO2.OooOo0o(selectableTextButtonView);
            Object objOooOo0 = interfaceC21033OooOOOO2.OooOo0();
            if (zOooOo0o || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
                objOooOo0 = new C25715Oooo00o(selectableTextButtonView, 1);
                interfaceC21033OooOOOO2.OooOOo0(objOooOo0);
            }
            oO0O000o.OooO00o oooO00o = (oO0O000o.OooO00o) objOooOo0;
            interfaceC21033OooOOOO2.OooOoo();
            boolean shouldFillMaxWidthState = selectableTextButtonView.getShouldFillMaxWidthState();
            InterfaceC21233OooO0o interfaceC21233OooO0oOooO0OO = InterfaceC21233OooO0o.OooO00o.f61602OooOo0o;
            if (shouldFillMaxWidthState) {
                interfaceC21233OooO0oOooO0OO = C20803Ooooo0o.OooO0OO(interfaceC21233OooO0oOooO0OO);
            }
            Oooo000.OooO00o(textState, selectedState, oooO00o, interfaceC21233OooO0oOooO0OO, selectableTextButtonView.getEnabledState(), this.f89337OooOo, this.f89340OooOoO0, null, 0, this.f89339OooOoO, interfaceC21033OooOOOO2, 0);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
