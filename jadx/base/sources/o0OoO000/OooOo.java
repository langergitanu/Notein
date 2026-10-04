package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserVerificationFragment;
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

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseCreateUserVerificationFragment$checkEmailVerificationState$1$1", m80623f = "FirebaseCreateUserVerificationFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FirebaseCreateUserVerificationFragment f101157OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(FirebaseCreateUserVerificationFragment firebaseCreateUserVerificationFragment, Continuation<? super OooOo> continuation) {
        super(2, continuation);
        this.f101157OooOo0o = firebaseCreateUserVerificationFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOo(this.f101157OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this.f101157OooOo0o), new C24564OooO00o(R.id.f57937x5975f988));
        return C32460OooOooO.f116667OooO00o;
    }
}
