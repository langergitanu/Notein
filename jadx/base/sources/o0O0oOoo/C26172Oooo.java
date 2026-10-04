package o0O0oOoo;

import Oooo0oO.InterfaceC21033OooOOOO;
import Oooooo.AbstractC21396OooO0O0;
import com.orion.niui.components.button.SymbolButtonView;
import o00oo0Oo.C25717Oooo0OO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0O0oOoo.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26172Oooo implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC21396OooO0O0 f89329OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ SymbolButtonView f89330OooOo0o;

    public C26172Oooo(SymbolButtonView symbolButtonView, AbstractC21396OooO0O0 abstractC21396OooO0O0) {
        this.f89330OooOo0o = symbolButtonView;
        this.f89329OooOo = abstractC21396OooO0O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 3) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            SymbolButtonView symbolButtonView = this.f89330OooOo0o;
            String contentDescriptionState = symbolButtonView.getContentDescriptionState();
            boolean enabledState = symbolButtonView.getEnabledState();
            EnumC26180Oooo0oo variantState = symbolButtonView.getVariantState();
            interfaceC21033OooOOOO2.OooOo00(-203242004);
            boolean zOooOo0o = interfaceC21033OooOOOO2.OooOo0o(symbolButtonView);
            Object objOooOo0 = interfaceC21033OooOOOO2.OooOo0();
            if (zOooOo0o || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
                objOooOo0 = new C25717Oooo0OO(symbolButtonView, 1);
                interfaceC21033OooOOOO2.OooOOo0(objOooOo0);
            }
            interfaceC21033OooOOOO2.OooOoo();
            C26177Oooo0o.OooO00o(this.f89329OooOo, contentDescriptionState, null, variantState, enabledState, null, null, 0.0f, (oO0O000o.OooO00o) objOooOo0, interfaceC21033OooOOOO2, 0, 228);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
