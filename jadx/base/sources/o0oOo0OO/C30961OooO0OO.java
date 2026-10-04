package o0oOo0OO;

import android.widget.TextView;
import com.orion.notein.p607ui.user.firebase.FirebaseUserInfoFragment;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o0o.ViewOnClickListenerC28224OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0oOo0OO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment$initAiQuotaUsage$1", m80623f = "FirebaseUserInfoFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C30961OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ FirebaseUserInfoFragment f110637OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30961OooO0OO(FirebaseUserInfoFragment firebaseUserInfoFragment, Continuation<? super C30961OooO0OO> continuation) {
        super(2, continuation);
        this.f110637OooOo0o = firebaseUserInfoFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30961OooO0OO(this.f110637OooOo0o, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30961OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        FirebaseUserInfoFragment firebaseUserInfoFragment = this.f110637OooOo0o;
        if (firebaseUserInfoFragment.OooOoo0().f90207OooO0o0.OooO0Oo().getUnlimitedQuota()) {
            TextView textView = firebaseUserInfoFragment.f79704Oooo0o;
            if (textView == null) {
                OooOOO0.OooOOOO("btnPurchaseAiQuota");
                throw null;
            }
            textView.setEnabled(false);
        } else {
            TextView textView2 = firebaseUserInfoFragment.f79704Oooo0o;
            if (textView2 == null) {
                OooOOO0.OooOOOO("btnPurchaseAiQuota");
                throw null;
            }
            textView2.setEnabled(true);
            TextView textView3 = firebaseUserInfoFragment.f79704Oooo0o;
            if (textView3 == null) {
                OooOOO0.OooOOOO("btnPurchaseAiQuota");
                throw null;
            }
            C28050OooO0OO.OooO00o(textView3, 500L, new ViewOnClickListenerC28224OooO00o(firebaseUserInfoFragment, 3));
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
