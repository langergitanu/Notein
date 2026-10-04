package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.widget.TextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseUserResetPasswordFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseUserResetPasswordFragment$resetPassword$1$1", m80623f = "FirebaseUserResetPasswordFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o000 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FirebaseUserResetPasswordFragment f101265OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000(FirebaseUserResetPasswordFragment firebaseUserResetPasswordFragment, Continuation<? super o000> continuation) {
        super(2, continuation);
        this.f101265OooOo0o = firebaseUserResetPasswordFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o000(this.f101265OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((o000) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        FirebaseUserResetPasswordFragment firebaseUserResetPasswordFragment = this.f101265OooOo0o;
        C21030OooOO0o.OooO0OO(firebaseUserResetPasswordFragment).OooOOo0();
        TextView textView = firebaseUserResetPasswordFragment.f72409Oooo0;
        if (textView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        textView.setEnabled(true);
        TextView textView2 = firebaseUserResetPasswordFragment.f72409Oooo0;
        if (textView2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnContinue");
            throw null;
        }
        textView2.setText(firebaseUserResetPasswordFragment.getString(R.string._continue));
        CircularProgressIndicator circularProgressIndicator = firebaseUserResetPasswordFragment.f72413Oooo0O0;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.setVisibility(8);
            return C32460OooOooO.f116667OooO00o;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("cpiBtnContinue");
        throw null;
    }
}
