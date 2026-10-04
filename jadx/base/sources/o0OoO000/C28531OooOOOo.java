package o0OoO000;

import OooooOO.C21335Oooo0oO;
import android.content.Context;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserSetNameFragment;
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

/* JADX INFO: renamed from: o0OoO000.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.firebase.FirebaseCreateUserSetNameFragment$restorePurchases$1", m80623f = "FirebaseCreateUserSetNameFragment.kt", m80624l = {231}, m80625m = "invokeSuspend")
public final class C28531OooOOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ FirebaseCreateUserSetNameFragment f101150OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101151OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28531OooOOOo(FirebaseCreateUserSetNameFragment firebaseCreateUserSetNameFragment, Continuation<? super C28531OooOOOo> continuation) {
        super(2, continuation);
        this.f101150OooOo = firebaseCreateUserSetNameFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28531OooOOOo(this.f101150OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28531OooOOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101151OooOo0o;
        FirebaseCreateUserSetNameFragment firebaseCreateUserSetNameFragment = this.f101150OooOo;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) firebaseCreateUserSetNameFragment.f72267Oooo000.getValue();
            this.f101151OooOo0o = 1;
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
            FirebaseCreateUserSetNameFragment.Oooo00o(firebaseCreateUserSetNameFragment, firebaseCreateUserSetNameFragment.getString(R.string.login_successfully));
        } else {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0OO(o0OOO0O0.OooOOO0.OooO0O0(c20358OooO00o, "FirebaseSetNameFragment", "restorePurchases: ", c27174OooO0O0), new Object[0]);
            Context contextRequireContext = firebaseCreateUserSetNameFragment.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            FirebaseCreateUserSetNameFragment.Oooo00o(firebaseCreateUserSetNameFragment, C21335Oooo0oO.OooO0O0(contextRequireContext, c27174OooO0O0.getErrorCode(), c27174OooO0O0.getErrorMsg()));
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
