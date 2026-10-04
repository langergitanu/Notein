package o0O0oo0;

import Oooo0oO.InterfaceC21033OooOOOO;
import com.orion.niui.components.dropdown.SingleSelectDropdownView;
import o000oOoO.C24636OooO0O0;
import o0O0ooo.C26233OooOO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOo00 implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ SingleSelectDropdownView f89532OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f89533OooOo0o;

    public OooOo00(SingleSelectDropdownView singleSelectDropdownView, boolean z) {
        this.f89533OooOo0o = z;
        this.f89532OooOo = singleSelectDropdownView;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 3) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            C26233OooOO0.OooO00o(this.f89533OooOo0o, C24636OooO0O0.OooO0O0(interfaceC21033OooOOOO2, -375402214, new C26208OooOOoo(this.f89532OooOo)), interfaceC21033OooOOOO2, 48);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
