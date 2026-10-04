package o0oO0O00;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.password.reset.SetPasswordFragment;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0oO0O00.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.password.reset.SetPasswordFragment$handleEvent$1", m80623f = "SetPasswordFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30778OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ SetPasswordFragment f110050OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30778OooO0oo(SetPasswordFragment setPasswordFragment, Continuation<? super C30778OooO0oo> continuation) {
        super(2, continuation);
        this.f110050OooOo0o = setPasswordFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30778OooO0oo(this.f110050OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30778OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        SetPasswordFragment setPasswordFragment = this.f110050OooOo0o;
        Context context = setPasswordFragment.getContext();
        if (context != null) {
            String string = setPasswordFragment.getString(R.string.set_password_success);
            OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(context, string);
        }
        C21030OooOO0o.OooO0OO(setPasswordFragment).OooOOo(R.id.passwordLoginFragment, false);
        return C32460OooOooO.f116667OooO00o;
    }
}
