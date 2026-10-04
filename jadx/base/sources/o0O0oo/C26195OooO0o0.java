package o0O0oo;

import Oooo0oO.InterfaceC21033OooOOOO;
import Oooooo.AbstractC21396OooO0O0;
import com.orion.niui.components.listitems.SwitchListItemView;
import o0OOO0o.C27049OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOoo0.InterfaceC34598OooO0oO;

/* JADX INFO: renamed from: o0O0oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26195OooO0o0 implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ SwitchListItemView f89435OooOo0o;

    public C26195OooO0o0(SwitchListItemView switchListItemView) {
        this.f89435OooOo0o = switchListItemView;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        InterfaceC34598OooO0oO interfaceC34598OooO0oO;
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 3) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            SwitchListItemView switchListItemView = this.f89435OooOo0o;
            String titleState = switchListItemView.getTitleState();
            boolean checkedState = switchListItemView.getCheckedState();
            interfaceC21033OooOOOO2.OooOo00(284834836);
            if (switchListItemView.getToggleableState()) {
                interfaceC21033OooOOOO2.OooOo00(284835477);
                boolean zOooOo0o = interfaceC21033OooOOOO2.OooOo0o(switchListItemView);
                Object objOooOo0 = interfaceC21033OooOOOO2.OooOo0();
                if (zOooOo0o || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
                    C26194OooO0Oo c26194OooO0Oo = new C26194OooO0Oo(1, switchListItemView, SwitchListItemView.class, "handleUserToggle", "handleUserToggle(Z)V", 0);
                    interfaceC21033OooOOOO2.OooOOo0(c26194OooO0Oo);
                    objOooOo0 = c26194OooO0Oo;
                }
                interfaceC34598OooO0oO = (InterfaceC34598OooO0oO) objOooOo0;
                interfaceC21033OooOOOO2.OooOoo();
            } else {
                interfaceC34598OooO0oO = null;
            }
            interfaceC21033OooOOOO2.OooOoo();
            InterfaceC32507OooOO0o interfaceC32507OooOO0o = (InterfaceC32507OooOO0o) interfaceC34598OooO0oO;
            boolean enabledState = switchListItemView.getEnabledState();
            String descriptionState = switchListItemView.getDescriptionState();
            Integer iconResState = switchListItemView.getIconResState();
            interfaceC21033OooOOOO2.OooOo00(284840835);
            AbstractC21396OooO0O0 abstractC21396OooO0O0OooO00o = iconResState != null ? C27049OooO0Oo.OooO00o(iconResState.intValue(), interfaceC21033OooOOOO2) : null;
            interfaceC21033OooOOOO2.OooOoo();
            C26193OooO0OO.OooO00o(titleState, null, checkedState, interfaceC32507OooOO0o, enabledState, descriptionState, abstractC21396OooO0O0OooO00o, switchListItemView.getIconContentDescriptionState(), null, interfaceC21033OooOOOO2, 0);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
