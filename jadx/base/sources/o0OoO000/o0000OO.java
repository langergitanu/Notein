package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import com.orion.notein.p607ui.login.firebase.FirebaseUserModifyPasswordFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseUserModifyPasswordFragment$modifyPassword$1$1$1", m80623f = "FirebaseUserModifyPasswordFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o0000OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FirebaseUserModifyPasswordFragment f101309OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO(FirebaseUserModifyPasswordFragment firebaseUserModifyPasswordFragment, Continuation<? super o0000OO> continuation) {
        super(2, continuation);
        this.f101309OooOo0o = firebaseUserModifyPasswordFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0000OO(this.f101309OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o0000OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        FirebaseUserModifyPasswordFragment firebaseUserModifyPasswordFragment = this.f101309OooOo0o;
        firebaseUserModifyPasswordFragment.Oooo0();
        C21030OooOO0o.OooO0OO(firebaseUserModifyPasswordFragment).OooOOo0();
        return C32460OooOooO.f116667OooO00o;
    }
}
