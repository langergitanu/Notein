package o0o0Oo0O;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0OoOo0;
import com.orion.niui.components.listitems.SwitchListItemView;
import com.orion.notein.p607ui.settings.GlobalFastTranslationSettingFragment;
import com.orion.notein.p607ui.settings.tool.ToolSettingsFragment;
import o0oOOoo.C30858OooO0O0;
import o0oOOoo.C30861OooO0o0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o0Oo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C30610OooO00o implements InterfaceC32510OooOOo0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f109546OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f109547OooOo0o;

    public /* synthetic */ C30610OooO00o(Fragment fragment, int i) {
        this.f109547OooOo0o = i;
        this.f109546OooOo = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Fragment fragment = this.f109546OooOo;
        int i = this.f109547OooOo0o;
        SwitchListItemView switchListItemView = (SwitchListItemView) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Boolean bool = (Boolean) obj3;
        switch (i) {
            case 0:
                bool.getClass();
                kotlin.jvm.internal.OooOOO0.OooO0oO(switchListItemView, "<unused var>");
                GlobalFastTranslationSettingFragment globalFastTranslationSettingFragment = (GlobalFastTranslationSettingFragment) fragment;
                if (((Boolean) globalFastTranslationSettingFragment.OooOoO().f110331OooOO0.f121747OooOo0o.getValue()).booleanValue() != zBooleanValue) {
                    C30861OooO0o0 c30861OooO0o0OooOoO = globalFastTranslationSettingFragment.OooOoO();
                    C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30861OooO0o0OooOoO), null, null, new C30858OooO0O0(c30861OooO0o0OooOoO, zBooleanValue, null), 3);
                }
                break;
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO(switchListItemView, "<unused var>");
                if (zBooleanValue2) {
                    ToolSettingsFragment toolSettingsFragment = (ToolSettingsFragment) fragment;
                    if (((Boolean) toolSettingsFragment.OooOoo0().f109590OooOo0O.f121747OooOo0o.getValue()).booleanValue() != zBooleanValue) {
                        C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
                        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30623OooOOOOOooOoo0);
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30625OooOOo(c30623OooOOOOOooOoo0, zBooleanValue, null), 2);
                    }
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
