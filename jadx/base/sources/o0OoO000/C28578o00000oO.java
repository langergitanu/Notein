package o0OoO000;

import androidx.lifecycle.C21989OooOooO;
import com.google.firebase.auth.AuthResult;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO000.o00000oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseUserLoginFragment$signInWithMicrosoft$1$1", m80623f = "FirebaseUserLoginFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28578o00000oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AuthResult f101300OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FirebaseUserLoginFragment f101301OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28578o00000oO(AuthResult authResult, FirebaseUserLoginFragment firebaseUserLoginFragment, Continuation continuation) {
        super(2, continuation);
        this.f101301OooOo0o = firebaseUserLoginFragment;
        this.f101300OooOo = authResult;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28578o00000oO(this.f101300OooOo, this.f101301OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28578o00000oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        AuthResult authResult = this.f101300OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(authResult);
        FirebaseUserLoginFragment firebaseUserLoginFragment = this.f101301OooOo0o;
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(firebaseUserLoginFragment), null, null, new o00000(authResult, firebaseUserLoginFragment, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
