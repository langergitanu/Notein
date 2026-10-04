package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.fragment.app.C21904OooOoo0;
import com.orion.notein.global.R;
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

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseUserLoginFragment$loginCompleteAndShowExitToast$1", m80623f = "FirebaseUserLoginFragment.kt", m80624l = {568}, m80625m = "invokeSuspend")
public final class o00000O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ String f101282OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101283OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ FirebaseUserLoginFragment f101284OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(FirebaseUserLoginFragment firebaseUserLoginFragment, String str, Continuation continuation) {
        super(2, continuation);
        this.f101282OooOo = str;
        this.f101284OooOoO0 = firebaseUserLoginFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o00000O(this.f101284OooOoO0, this.f101282OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o00000O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101283OooOo0o;
        FirebaseUserLoginFragment firebaseUserLoginFragment = this.f101284OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            String str = this.f101282OooOo;
            if (str != null) {
                Context context = firebaseUserLoginFragment.getContext();
                if (context != null) {
                    C25206OooO0Oo.OooO0OO((ContextWrapper) context, str);
                }
                this.f101283OooOo0o = 1;
                if (C33644OoooO0.OooO00o(1500L, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C21904OooOoo0.OooO0o(new Bundle(), firebaseUserLoginFragment, "key_firebase_login");
        C21030OooOO0o.OooO0OO(firebaseUserLoginFragment).OooOOo(R.id.firebaseUserAuthFragment, true);
        return C32460OooOooO.f116667OooO00o;
    }
}
