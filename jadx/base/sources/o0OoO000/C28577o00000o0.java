package o0OoO000;

import android.content.Context;
import android.content.ContextWrapper;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
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

/* JADX INFO: renamed from: o0OoO000.o00000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseUserLoginFragment$showToast$1", m80623f = "FirebaseUserLoginFragment.kt", m80624l = {579}, m80625m = "invokeSuspend")
public final class C28577o00000o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FirebaseUserLoginFragment f101297OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101298OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f101299OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28577o00000o0(FirebaseUserLoginFragment firebaseUserLoginFragment, String str, Continuation continuation) {
        super(2, continuation);
        this.f101297OooOo = firebaseUserLoginFragment;
        this.f101299OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28577o00000o0(this.f101297OooOo, this.f101299OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28577o00000o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101298OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f101298OooOo0o = 1;
            if (C33644OoooO0.OooO00o(1000L, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        Context context = this.f101297OooOo.getContext();
        if (context != null) {
            C25206OooO0Oo.OooO0OO((ContextWrapper) context, this.f101299OooOoO0);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
