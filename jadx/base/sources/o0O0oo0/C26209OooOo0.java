package o0O0oo0;

import OooOoo0.C20678Oooo0O0;
import Oooo0oO.C21051Oooo000;
import Oooo0oO.InterfaceC21033OooOOOO;
import Oooo0oO.o00000O0;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.p002ui.platform.C21608OooO0Oo;
import com.orion.niui.components.dropdown.SingleSelectDropdownView;
import o000oOoO.C24636OooO0O0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0O0oo0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26209OooOo0 implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ SingleSelectDropdownView f89531OooOo0o;

    public C26209OooOo0(SingleSelectDropdownView singleSelectDropdownView) {
        this.f89531OooOo0o = singleSelectDropdownView;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) {
        Object objOooO00o;
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 3) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            SingleSelectDropdownView singleSelectDropdownView = this.f89531OooOo0o;
            Boolean useDarkThemeState = singleSelectDropdownView.getUseDarkThemeState();
            interfaceC21033OooOOOO2.OooOo00(-1270762447);
            boolean zOooO0O0 = useDarkThemeState == null ? C20678Oooo0O0.OooO0O0(interfaceC21033OooOOOO2) : useDarkThemeState.booleanValue();
            interfaceC21033OooOOOO2.OooOoo();
            interfaceC21033OooOOOO2.OooOo00(509160522);
            Context context = (Context) interfaceC21033OooOOOO2.OooO0o0(C21608OooO0Oo.f63496OooO0O0);
            interfaceC21033OooOOOO2.OooOo00(321785065);
            boolean zOooO0oo = interfaceC21033OooOOOO2.OooO0oo(context) | interfaceC21033OooOOOO2.OooO(zOooO0O0);
            Object objOooOo0 = interfaceC21033OooOOOO2.OooOo0();
            if (zOooO0oo || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
                int i = zOooO0O0 ? 32 : 16;
                if ((context.getResources().getConfiguration().uiMode & 48) != i) {
                    Configuration configuration = new Configuration(context.getResources().getConfiguration());
                    configuration.uiMode = i | (configuration.uiMode & (-49));
                    try {
                        objOooO00o = context.createConfigurationContext(configuration);
                    } catch (Throwable th) {
                        objOooO00o = C32446OooOOOo.OooO00o(th);
                    }
                    if (objOooO00o instanceof C32445OooOOOO.OooO00o) {
                        objOooO00o = null;
                    }
                    Context context2 = (Context) objOooO00o;
                    if (context2 != null) {
                        context = context2;
                    }
                }
                interfaceC21033OooOOOO2.OooOOo0(context);
                objOooOo0 = context;
            }
            interfaceC21033OooOOOO2.OooOoo();
            interfaceC21033OooOOOO2.OooOoo();
            C21051Oooo000.OooO00o(new o00000O0[]{C21608OooO0Oo.f63496OooO0O0.OooO00o((Context) objOooOo0)}, C24636OooO0O0.OooO0O0(interfaceC21033OooOOOO2, 682379094, new OooOo00(singleSelectDropdownView, zOooO0O0)), interfaceC21033OooOOOO2, 48);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
