package o0oOOoo0;

import androidx.lifecycle.o0OoOo0;
import com.orion.niui.components.listitems.SwitchListItemView;
import com.orion.notein.p607ui.settings.tool.ToolSettingsFragment;
import kotlin.coroutines.Continuation;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0O.C30631OooOo0O;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0oOOoo0.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$initRows$4$1", m80623f = "ToolSettingsFragment.kt", m80624l = {115}, m80625m = "invokeSuspend")
public final class C30875OooOOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ToolSettingsFragment f110351OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110352OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f110353OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30875OooOOO0(ToolSettingsFragment toolSettingsFragment, boolean z, Continuation<? super C30875OooOOO0> continuation) {
        super(2, continuation);
        this.f110351OooOo = toolSettingsFragment;
        this.f110353OooOoO0 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30875OooOOO0(this.f110351OooOo, this.f110353OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30875OooOOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110352OooOo0o;
        ToolSettingsFragment toolSettingsFragment = this.f110351OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f110352OooOo0o = 1;
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
            boolean zBooleanValue = ((Boolean) toolSettingsFragment.OooOoo0().f109592OooOoO.f121747OooOo0o.getValue()).booleanValue();
            SwitchListItemView switchListItemView = toolSettingsFragment.f79379Oooo00o;
            if (switchListItemView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("globalToolboxToggle");
                throw null;
            }
            switchListItemView.setChecked(zBooleanValue);
        } else {
            C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30623OooOOOOOooOoo0);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30631OooOo0O(c30623OooOOOOOooOoo0, this.f110353OooOoO0, null), 2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
