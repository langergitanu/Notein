package o0oOo0OO;

import android.content.Context;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.user.firebase.FirebaseUserInfoFragment;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00.C25206OooO0Oo;
import o0oOoOoO.C31094OooO00o;
import o0oOoOoO.C31101OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0oOo0OO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.firebase.FirebaseUserInfoFragment$handleGetDiscountButtonClicked$1", m80623f = "FirebaseUserInfoFragment.kt", m80624l = {270}, m80625m = "invokeSuspend")
public final class C30960OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f110634OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Context f110635OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ FirebaseUserInfoFragment f110636OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30960OooO0O0(FirebaseUserInfoFragment firebaseUserInfoFragment, Continuation<? super C30960OooO0O0> continuation) {
        super(2, continuation);
        this.f110636OooOoO0 = firebaseUserInfoFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30960OooO0O0(this.f110636OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30960OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        Context context;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f110634OooOo;
        FirebaseUserInfoFragment firebaseUserInfoFragment = this.f110636OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            Context contextRequireContext = firebaseUserInfoFragment.requireContext();
            OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            this.f110635OooOo0o = contextRequireContext;
            this.f110634OooOo = 1;
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C31094OooO00o(contextRequireContext, "discount", null), this);
            if (objOooO0o == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            context = contextRequireContext;
            obj = objOooO0o;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = this.f110635OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        String str = (String) obj;
        if (str != null && str.length() != 0) {
            C31101OooO0oo.OooO00o(context, str);
            return C32460OooOooO.f116667OooO00o;
        }
        Context contextRequireContext2 = firebaseUserInfoFragment.requireContext();
        OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
        String string = firebaseUserInfoFragment.getString(R.string.error_no_get_discount_url);
        OooOOO0.OooO0o(string, "getString(...)");
        C25206OooO0Oo.OooO0oO(contextRequireContext2, string);
        return C32460OooOooO.f116667OooO00o;
    }
}
