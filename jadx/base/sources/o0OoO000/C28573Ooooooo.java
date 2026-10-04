package o0OoO000;

import com.google.firebase.FirebaseNetworkException;
import com.orion.notein.p607ui.login.firebase.FirebaseUserAuthFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO000.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseUserAuthFragment$signInWithMicrosoft$2$1", m80623f = "FirebaseUserAuthFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28573Ooooooo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FirebaseUserAuthFragment f101263OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Exception f101264OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28573Ooooooo(Exception exc, FirebaseUserAuthFragment firebaseUserAuthFragment, Continuation<? super C28573Ooooooo> continuation) {
        super(2, continuation);
        this.f101264OooOo0o = exc;
        this.f101263OooOo = firebaseUserAuthFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28573Ooooooo(this.f101264OooOo0o, this.f101263OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28573Ooooooo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        boolean z = this.f101264OooOo0o instanceof FirebaseNetworkException;
        FirebaseUserAuthFragment firebaseUserAuthFragment = this.f101263OooOo;
        if (z) {
            firebaseUserAuthFragment.Oooo0OO(1002);
        } else {
            firebaseUserAuthFragment.Oooo0OO(1003);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
