package o0o0Oo0O;

import Oooo0oO.C21030OooOO0o;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.settings.GlobalSettingsFragment;
import kotlin.coroutines.Continuation;
import o0Oo00o.C28026OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0Oo0O.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.GlobalSettingsFragment$setupAssistLineCard$1$2$1", m80623f = "GlobalSettingsFragment.kt", m80624l = {198}, m80625m = "invokeSuspend")
public final class C30617OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ GlobalSettingsFragment f109558OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109559OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30617OooO0oo(GlobalSettingsFragment globalSettingsFragment, Continuation<? super C30617OooO0oo> continuation) {
        super(2, continuation);
        this.f109558OooOo = globalSettingsFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30617OooO0oo(this.f109558OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30617OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109559OooOo0o;
        GlobalSettingsFragment globalSettingsFragment = this.f109558OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f109559OooOo0o = 1;
            obj = GlobalSettingsFragment.OooOoO(globalSettingsFragment, 45, this);
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
            C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(globalSettingsFragment), R.id.action_globalSettingsFragment_to_toolAssistLineAndShapesFragment, null);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
