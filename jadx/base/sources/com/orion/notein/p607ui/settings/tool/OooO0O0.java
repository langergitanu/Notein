package com.orion.notein.p607ui.settings.tool;

import androidx.lifecycle.o0OoOo0;
import com.aspose.words.StyleIdentifier;
import com.orion.niui.components.listitems.SwitchListItemView;
import com.orion.notein.p607ui.settings.tool.ToolSettingsFragment;
import kotlin.coroutines.Continuation;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0O.C30644Oooo0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$setupPressureCard$1$1", m80623f = "ToolSettingsFragment.kt", m80624l = {StyleIdentifier.GRID_TABLE_3_ACCENT_1}, m80625m = "invokeSuspend")
public final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ToolSettingsFragment f79360OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f79361OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ boolean f79362OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ ToolSettingsFragment.OooO0O0 f79363OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(ToolSettingsFragment toolSettingsFragment, ToolSettingsFragment.OooO0O0 oooO0O0, boolean z, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f79360OooOo = toolSettingsFragment;
        this.f79363OooOoO0 = oooO0O0;
        this.f79362OooOoO = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0O0(this.f79360OooOo, this.f79363OooOoO0, this.f79362OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f79361OooOo0o;
        ToolSettingsFragment toolSettingsFragment = this.f79360OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f79361OooOo0o = 1;
            obj = ToolSettingsFragment.OooOoO(toolSettingsFragment, 45, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            boolean zBooleanValue = ((Boolean) toolSettingsFragment.OooOoo0().f109596OooOoo0.f121747OooOo0o.getValue()).booleanValue();
            ToolSettingsFragment.OooO0O0 oooO0O0 = this.f79363OooOoO0;
            SwitchListItemView switchListItemView = oooO0O0.f79391OooO0O0;
            if (switchListItemView.OooO() != zBooleanValue) {
                oooO0O0.f79394OooO0o0 = false;
                switchListItemView.setChecked(zBooleanValue);
                oooO0O0.f79394OooO0o0 = true;
            }
            oooO0O0.f79392OooO0OO.setEnabled(zBooleanValue);
        } else {
            C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
            C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30623OooOOOOOooOoo0), null, null, new C30644Oooo0O0(c30623OooOOOOOooOoo0, this.f79362OooOoO, null), 3);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
