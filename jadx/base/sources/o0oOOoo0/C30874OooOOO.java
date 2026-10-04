package o0oOOoo0;

import androidx.lifecycle.o0OoOo0;
import com.orion.niui.components.listitems.SwitchListItemView;
import com.orion.notein.p607ui.settings.tool.ToolSettingsFragment;
import kotlin.coroutines.Continuation;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0O.C30649Oooo0oo;
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

/* JADX INFO: renamed from: o0oOOoo0.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$initRows$6$1", m80623f = "ToolSettingsFragment.kt", m80624l = {137}, m80625m = "invokeSuspend")
public final class C30874OooOOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ToolSettingsFragment f110348OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110349OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f110350OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30874OooOOO(ToolSettingsFragment toolSettingsFragment, boolean z, Continuation<? super C30874OooOOO> continuation) {
        super(2, continuation);
        this.f110348OooOo = toolSettingsFragment;
        this.f110350OooOoO0 = z;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30874OooOOO(this.f110348OooOo, this.f110350OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30874OooOOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110349OooOo0o;
        ToolSettingsFragment toolSettingsFragment = this.f110348OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f110349OooOo0o = 1;
            obj = ToolSettingsFragment.OooOoO(toolSettingsFragment, 11, this);
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
            SwitchListItemView switchListItemView = toolSettingsFragment.f79380Oooo0O0;
            if (switchListItemView == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("dualLinkIconToggle");
                throw null;
            }
            switchListItemView.setChecked(false);
            C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30623OooOOOOOooOoo0);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30649Oooo0oo(c30623OooOOOOOooOoo0, false, null), 2);
        } else {
            C30623OooOOOO c30623OooOOOOOooOoo02 = toolSettingsFragment.OooOoo0();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o2 = o0OoOo0.OooO00o(c30623OooOOOOOooOoo02);
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30649Oooo0oo(c30623OooOOOOOooOoo02, this.f110350OooOoO0, null), 2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
