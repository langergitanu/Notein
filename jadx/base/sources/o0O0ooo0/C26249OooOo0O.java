package o0O0ooo0;

import Oooo0oO.InterfaceC21033OooOOOO;
import OoooOoO.InterfaceC21233OooO0o;
import com.orion.niui.components.textinput.LabeledTextFieldView;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oo0oO0.o00OOO00;

/* JADX INFO: renamed from: o0O0ooo0.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26249OooOo0O implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ LabeledTextFieldView f89703OooOo0o;

    public C26249OooOo0O(LabeledTextFieldView labeledTextFieldView) {
        this.f89703OooOo0o = labeledTextFieldView;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 3) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            InterfaceC21233OooO0o.OooO00o oooO00o = InterfaceC21233OooO0o.OooO00o.f61602OooOo0o;
            LabeledTextFieldView labeledTextFieldView = this.f89703OooOo0o;
            String labelState = labeledTextFieldView.getLabelState();
            String valueState = labeledTextFieldView.getValueState();
            String supportingTextState = labeledTextFieldView.getSupportingTextState();
            EnumC26248OooOo0 stateState = labeledTextFieldView.getStateState();
            OooOo00 modeState = labeledTextFieldView.getModeState();
            String countryCodeState = labeledTextFieldView.getModeState() == OooOo00.f89700OooOoO ? labeledTextFieldView.getCountryCodeState() : null;
            oO0O000o.OooO00o<C32460OooOooO> oooO00o2 = labeledTextFieldView.f69541Oooo00o;
            Integer maxLengthState = labeledTextFieldView.getMaxLengthState();
            String trailingTextState = labeledTextFieldView.getTrailingTextState();
            oO0O000o.OooO00o trailingTextClickListener = labeledTextFieldView.getTrailingTextClickListener();
            InterfaceC32507OooOO0o<? super Boolean, C32460OooOooO> interfaceC32507OooOO0o = labeledTextFieldView.f69538Oooo0;
            interfaceC21033OooOOOO2.OooOo00(1840575130);
            boolean zOooOo0o = interfaceC21033OooOOOO2.OooOo0o(labeledTextFieldView);
            Object objOooOo0 = interfaceC21033OooOOOO2.OooOo0();
            if (zOooOo0o || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
                objOooOo0 = new o00OOO00(labeledTextFieldView, 2);
                interfaceC21033OooOOOO2.OooOOo0(objOooOo0);
            }
            interfaceC21033OooOOOO2.OooOoo();
            C26247OooOOoo.OooO0O0(oooO00o, labelState, valueState, (InterfaceC32507OooOO0o) objOooOo0, supportingTextState, stateState, modeState, countryCodeState, oooO00o2, maxLengthState, trailingTextState, null, interfaceC32507OooOO0o, trailingTextClickListener, interfaceC21033OooOOOO2, 6);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
