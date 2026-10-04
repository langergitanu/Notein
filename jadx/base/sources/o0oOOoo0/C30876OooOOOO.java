package o0oOOoo0;

import androidx.lifecycle.o0OoOo0;
import com.orion.niui.components.listitems.SwitchListItemView;
import com.orion.notein.p607ui.settings.tool.ToolSettingsFragment;
import kotlin.coroutines.Continuation;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0O.C30640Oooo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0oOOoo0.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$initRows$7$1", m80623f = "ToolSettingsFragment.kt", m80624l = {151}, m80625m = "invokeSuspend")
public final class C30876OooOOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ToolSettingsFragment f110354OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110355OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f110356OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30876OooOOOO(ToolSettingsFragment toolSettingsFragment, boolean z, Continuation<? super C30876OooOOOO> continuation) {
        super(2, continuation);
        this.f110354OooOo = toolSettingsFragment;
        this.f110356OooOoO0 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30876OooOOOO(this.f110354OooOo, this.f110356OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30876OooOOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110355OooOo0o;
        ToolSettingsFragment toolSettingsFragment = this.f110354OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f110355OooOo0o = 1;
            obj = ToolSettingsFragment.OooOoO(toolSettingsFragment, 29, this);
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
            SwitchListItemView switchListItemView = toolSettingsFragment.f79381Oooo0OO;
            if (switchListItemView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("hyperlinkIconToggle");
                throw null;
            }
            switchListItemView.setChecked(false);
            C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
            C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30623OooOOOOOooOoo0), null, null, new C30640Oooo(c30623OooOOOOOooOoo0, false, null), 3);
        } else {
            C30623OooOOOO c30623OooOOOOOooOoo02 = toolSettingsFragment.OooOoo0();
            C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30623OooOOOOOooOoo02), null, null, new C30640Oooo(c30623OooOOOOOooOoo02, this.f110356OooOoO0, null), 3);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
