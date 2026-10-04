package o0oOo0;

import android.content.Context;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.google.firebase.auth.FirebaseUser;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.user.DeleteAccountAgreementFragment;
import kotlin.coroutines.Continuation;
import o0000OO0.C24183Oooo;
import o0000OO0.C24192Oooo0oo;
import o00o00.C25206OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0oOo0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.DeleteAccountAgreementFragment$startReAuthByGoogle$1", m80623f = "DeleteAccountAgreementFragment.kt", m80624l = {193}, m80625m = "invokeSuspend")
public final class C30918OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountAgreementFragment f110489OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f110490OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ FirebaseUser f110491OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C24192Oooo0oo f110492OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30918OooO0oo(DeleteAccountAgreementFragment deleteAccountAgreementFragment, C24192Oooo0oo c24192Oooo0oo, FirebaseUser firebaseUser, Continuation<? super C30918OooO0oo> continuation) {
        super(2, continuation);
        this.f110489OooOo = deleteAccountAgreementFragment;
        this.f110492OooOoO0 = c24192Oooo0oo;
        this.f110491OooOoO = firebaseUser;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30918OooO0oo(this.f110489OooOo, this.f110492OooOoO0, this.f110491OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30918OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110490OooOo0o;
        DeleteAccountAgreementFragment deleteAccountAgreementFragment = this.f110489OooOo;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = deleteAccountAgreementFragment.requireActivity();
                kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
                o0000OO0.OooOOOO oooOOOO = new o0000OO0.OooOOOO(activityC21897OooOo0RequireActivity);
                C24192Oooo0oo c24192Oooo0oo = this.f110492OooOoO0;
                this.f110490OooOo0o = 1;
                obj = oooOOOO.OooO0O0(activityC21897OooOo0RequireActivity, c24192Oooo0oo, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            DeleteAccountAgreementFragment.OooOoOO(deleteAccountAgreementFragment, this.f110491OooOoO, (C24183Oooo) obj);
        } catch (o0000OO.OooOO0O e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("DeleteAccountAgreementFragment");
            c20358OooO00o.OooO0Oo(e, "Error getting credential", new Object[0]);
            Context context = deleteAccountAgreementFragment.getContext();
            if (context != null) {
                String string = deleteAccountAgreementFragment.getString(R.string.login_error_toast_no_google_credential);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                C25206OooO0Oo.OooO0oO(context, string);
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
