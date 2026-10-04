package o0O0oOoo;

import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.o0OoOo0;
import com.orion.niui.components.button.SelectableSymbolButtonGroupView;
import com.orion.niui.components.button.SelectableSymbolButtonView;
import com.orion.niui.components.listitems.SwitchListItemView;
import com.orion.notein.p607ui.settings.GlobalSettingsFragment;
import o0O0ooO0.EnumC26220OooO00o;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0O.C30629OooOo0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0O0oOoo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C26157OooOO0o implements InterfaceC32510OooOOo0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89261OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89262OooOo0o = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4 = this.f89261OooOo;
        switch (this.f89262OooOo0o) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj3).getClass();
                int i = SelectableSymbolButtonGroupView.f69455OooOoo0;
                kotlin.jvm.internal.OooOOO0.OooO0oO((SelectableSymbolButtonView) obj, "<unused var>");
                SelectableSymbolButtonGroupView selectableSymbolButtonGroupView = (SelectableSymbolButtonGroupView) obj4;
                if (selectableSymbolButtonGroupView.f69458OooOoO) {
                    return C32460OooOooO.f116667OooO00o;
                }
                if (!(zBooleanValue && selectableSymbolButtonGroupView.f69457OooOo0o == EnumC26220OooO00o.f89587OooOo0o) && zBooleanValue) {
                    throw null;
                }
                throw null;
            default:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                kotlin.jvm.internal.OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                if (!zBooleanValue3) {
                    return C32460OooOooO.f116667OooO00o;
                }
                C22026ooOO c22026ooOO = ((GlobalSettingsFragment) obj4).f78855OooOoo0;
                if (((Boolean) ((C30623OooOOOO) c22026ooOO.getValue()).f109588OooOo0.f121747OooOo0o.getValue()).booleanValue() != zBooleanValue2) {
                    C30623OooOOOO c30623OooOOOO = (C30623OooOOOO) c22026ooOO.getValue();
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30623OooOOOO);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30629OooOo0(c30623OooOOOO, zBooleanValue2, null), 2);
                }
                return C32460OooOooO.f116667OooO00o;
        }
    }

    public /* synthetic */ C26157OooOO0o(GlobalSettingsFragment globalSettingsFragment) {
        this.f89261OooOo = globalSettingsFragment;
    }
}
