package o0OoO000;

import OooooOO.C21335Oooo0oO;
import android.content.Context;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseLoginConfirmFragment;
import kotlin.coroutines.Continuation;
import o0O0oooO.C26320o0000OoO;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO000.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseLoginConfirmFragment$restorePurchases$1", m80623f = "FirebaseLoginConfirmFragment.kt", m80624l = {StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2}, m80625m = "invokeSuspend")
public final class C28550Oooo0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FirebaseLoginConfirmFragment f101195OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101196OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28550Oooo0OO(FirebaseLoginConfirmFragment firebaseLoginConfirmFragment, Continuation<? super C28550Oooo0OO> continuation) {
        super(2, continuation);
        this.f101195OooOo = firebaseLoginConfirmFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28550Oooo0OO(this.f101195OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28550Oooo0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101196OooOo0o;
        FirebaseLoginConfirmFragment firebaseLoginConfirmFragment = this.f101195OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) firebaseLoginConfirmFragment.f72301Oooo00o.getValue();
            this.f101196OooOo0o = 1;
            obj = c26320o0000OoO.OooOO0o(this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) obj;
        if (kotlin.jvm.internal.OooOOO0.OooO0O0(c27174OooO0O0.getErrorCode(), "0")) {
            FirebaseLoginConfirmFragment.Oooo00o(firebaseLoginConfirmFragment, firebaseLoginConfirmFragment.getString(R.string.login_successfully));
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0OO(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o, "FirebaseLoginConfirmFragment", "restorePurchases: ", c27174OooO0O0), new Object[0]);
            Context contextRequireContext = firebaseLoginConfirmFragment.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            FirebaseLoginConfirmFragment.Oooo00o(firebaseLoginConfirmFragment, C21335Oooo0oO.OooO0O0(contextRequireContext, c27174OooO0O0.getErrorCode(), c27174OooO0O0.getErrorMsg()));
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
