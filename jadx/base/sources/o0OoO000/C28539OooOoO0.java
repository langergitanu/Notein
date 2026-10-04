package o0OoO000;

import android.content.Context;
import android.content.ContextWrapper;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserVerificationFragment;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0OoO000.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseCreateUserVerificationFragment$showToast$1", m80623f = "FirebaseCreateUserVerificationFragment.kt", m80624l = {192}, m80625m = "invokeSuspend")
public final class C28539OooOoO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f101165OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101166OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f101167OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ FirebaseCreateUserVerificationFragment f101168OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28539OooOoO0(long j, FirebaseCreateUserVerificationFragment firebaseCreateUserVerificationFragment, String str, Continuation<? super C28539OooOoO0> continuation) {
        super(2, continuation);
        this.f101165OooOo = j;
        this.f101168OooOoO0 = firebaseCreateUserVerificationFragment;
        this.f101167OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28539OooOoO0(this.f101165OooOo, this.f101168OooOoO0, this.f101167OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28539OooOoO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101166OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f101166OooOo0o = 1;
            if (C33644OoooO0.OooO00o(this.f101165OooOo, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Context context = this.f101168OooOoO0.getContext();
        if (context != null) {
            C25206OooO0Oo.OooO0OO((ContextWrapper) context, this.f101167OooOoO);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
