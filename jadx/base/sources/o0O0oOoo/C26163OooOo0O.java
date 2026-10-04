package o0O0oOoo;

import Oooo0oO.InterfaceC21033OooOOOO;
import Oooooo.AbstractC21396OooO0O0;
import com.orion.niui.components.button.SelectableSymbolButtonView;
import o00oo0Oo.C25707OooOoO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0O0oOoo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26163OooOo0O implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC21396OooO0O0 f89302OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ SelectableSymbolButtonView f89303OooOo0o;

    public C26163OooOo0O(SelectableSymbolButtonView selectableSymbolButtonView, AbstractC21396OooO0O0 abstractC21396OooO0O0) {
        this.f89303OooOo0o = selectableSymbolButtonView;
        this.f89302OooOo = abstractC21396OooO0O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 3) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            SelectableSymbolButtonView selectableSymbolButtonView = this.f89303OooOo0o;
            String contentDescriptionState = selectableSymbolButtonView.getContentDescriptionState();
            boolean selectedState = selectableSymbolButtonView.getSelectedState();
            boolean enabledState = selectableSymbolButtonView.getEnabledState();
            C26162OooOo0 c26162OooOo0 = new C26162OooOo0(selectableSymbolButtonView.getBaseStyleState(), selectableSymbolButtonView.getSelectionStyleState());
            interfaceC21033OooOOOO2.OooOo00(-987592760);
            boolean zOooOo0o = interfaceC21033OooOOOO2.OooOo0o(selectableSymbolButtonView);
            Object objOooOo0 = interfaceC21033OooOOOO2.OooOo0();
            if (zOooOo0o || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
                objOooOo0 = new C25707OooOoO0(selectableSymbolButtonView, 1);
                interfaceC21033OooOOOO2.OooOOo0(objOooOo0);
            }
            interfaceC21033OooOOOO2.OooOoo();
            C26159OooOOo.OooO00o(this.f89302OooOo, contentDescriptionState, selectedState, (oO0O000o.OooO00o) objOooOo0, null, enabledState, c26162OooOo0, null, 0, null, 0.0f, interfaceC21033OooOOOO2, 0);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
