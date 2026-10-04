package o0O0oo0;

import Oooo0oO.InterfaceC21033OooOOOO;
import com.orion.niui.components.dropdown.SingleSelectDropdownView;
import java.util.List;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0O0oo0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26208OooOOoo implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ SingleSelectDropdownView f89530OooOo0o;

    public C26208OooOOoo(SingleSelectDropdownView singleSelectDropdownView) {
        this.f89530OooOo0o = singleSelectDropdownView;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 3) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            SingleSelectDropdownView singleSelectDropdownView = this.f89530OooOo0o;
            List optionsState = singleSelectDropdownView.getOptionsState();
            String selectedIdState = singleSelectDropdownView.getSelectedIdState();
            String placeholderState = singleSelectDropdownView.getPlaceholderState();
            boolean expandedState = singleSelectDropdownView.getExpandedState();
            boolean enabledState = singleSelectDropdownView.getEnabledState();
            interfaceC21033OooOOOO2.OooOo00(2049908249);
            boolean zOooOo0o = interfaceC21033OooOOOO2.OooOo0o(singleSelectDropdownView);
            Object objOooOo0 = interfaceC21033OooOOOO2.OooOo0();
            InterfaceC21033OooOOOO.OooO00o.C18979OooO00o c18979OooO00o = InterfaceC21033OooOOOO.OooO00o.f60894OooO00o;
            if (zOooOo0o || objOooOo0 == c18979OooO00o) {
                objOooOo0 = new C26207OooOOo0(singleSelectDropdownView, 0);
                interfaceC21033OooOOOO2.OooOOo0(objOooOo0);
            }
            InterfaceC32507OooOO0o interfaceC32507OooOO0o = (InterfaceC32507OooOO0o) objOooOo0;
            interfaceC21033OooOOOO2.OooOoo();
            interfaceC21033OooOOOO2.OooOo00(2049905233);
            boolean zOooOo0o2 = interfaceC21033OooOOOO2.OooOo0o(singleSelectDropdownView);
            Object objOooOo02 = interfaceC21033OooOOOO2.OooOo0();
            if (zOooOo0o2 || objOooOo02 == c18979OooO00o) {
                objOooOo02 = new C26206OooOOo(singleSelectDropdownView, 0);
                interfaceC21033OooOOOO2.OooOOo0(objOooOo02);
            }
            interfaceC21033OooOOOO2.OooOoo();
            OooOOO.OooO0OO(optionsState, selectedIdState, interfaceC32507OooOO0o, expandedState, (InterfaceC32507OooOO0o) objOooOo02, null, enabledState, placeholderState, null, null, interfaceC21033OooOOOO2, 0);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
