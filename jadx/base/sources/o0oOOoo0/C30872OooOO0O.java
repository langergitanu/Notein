package o0oOOoo0;

import Oooo0oO.C21030OooOO0o;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.settings.tool.ToolSettingsFragment;
import kotlin.coroutines.Continuation;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0oOOoo0.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$initRows$10$1", m80623f = "ToolSettingsFragment.kt", m80624l = {184}, m80625m = "invokeSuspend")
public final class C30872OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ToolSettingsFragment f110343OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110344OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30872OooOO0O(ToolSettingsFragment toolSettingsFragment, Continuation<? super C30872OooOO0O> continuation) {
        super(2, continuation);
        this.f110343OooOo = toolSettingsFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30872OooOO0O(this.f110343OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30872OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110344OooOo0o;
        ToolSettingsFragment toolSettingsFragment = this.f110343OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f110344OooOo0o = 1;
            obj = ToolSettingsFragment.OooOoO(toolSettingsFragment, 0, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(toolSettingsFragment), new C24564OooO00o(R.id.action_toolSettingsFragment_to_fastTranslationSettingFragment));
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
