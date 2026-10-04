package o0OoO000;

import androidx.lifecycle.C21989OooOooO;
import com.google.firebase.auth.AuthResult;
import com.orion.notein.p607ui.login.firebase.FirebaseUserAuthFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO000.OoooooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseUserAuthFragment$signInWithMicrosoft$1$1", m80623f = "FirebaseUserAuthFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28572OoooooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AuthResult f101261OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FirebaseUserAuthFragment f101262OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28572OoooooO(AuthResult authResult, FirebaseUserAuthFragment firebaseUserAuthFragment, Continuation continuation) {
        super(2, continuation);
        this.f101262OooOo0o = firebaseUserAuthFragment;
        this.f101261OooOo = authResult;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28572OoooooO(this.f101261OooOo, this.f101262OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28572OoooooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        AuthResult authResult = this.f101261OooOo;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(authResult);
        FirebaseUserAuthFragment firebaseUserAuthFragment = this.f101262OooOo0o;
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(firebaseUserAuthFragment), null, null, new C28571Oooooo0(authResult, firebaseUserAuthFragment, null), 3);
        return C32460OooOooO.f116667OooO00o;
    }
}
