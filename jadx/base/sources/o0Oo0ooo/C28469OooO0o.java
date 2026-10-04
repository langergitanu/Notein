package o0Oo0ooo;

import android.content.Context;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import o0Oo0ooo.AbstractC28485OooOo00;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0Oo0ooo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$observeVerificationEvents$2", m80623f = "BaseGetPhoneVerificationFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28469OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<AbstractC28485OooOo00, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseGetPhoneVerificationFragment f100865OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f100866OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28469OooO0o(BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment, Continuation<? super C28469OooO0o> continuation) {
        super(2, continuation);
        this.f100865OooOo = baseGetPhoneVerificationFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28469OooO0o c28469OooO0o = new C28469OooO0o(this.f100865OooOo, continuation);
        c28469OooO0o.f100866OooOo0o = obj;
        return c28469OooO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC28485OooOo00 abstractC28485OooOo00, Continuation<? super C32460OooOooO> continuation) {
        return ((C28469OooO0o) create(abstractC28485OooOo00, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        AbstractC28485OooOo00 abstractC28485OooOo00 = (AbstractC28485OooOo00) this.f100866OooOo0o;
        boolean z = abstractC28485OooOo00 instanceof AbstractC28485OooOo00.OooO0O0;
        BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment = this.f100865OooOo;
        if (z) {
            Context contextRequireContext = baseGetPhoneVerificationFragment.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            String string = baseGetPhoneVerificationFragment.getString(R.string.verification_code_sent);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(contextRequireContext, string);
            AbstractC28485OooOo00.OooO0O0 oooO0O0 = (AbstractC28485OooOo00.OooO0O0) abstractC28485OooOo00;
            baseGetPhoneVerificationFragment.OooOooO(oooO0O0.f100931OooO00o, oooO0O0.f100932OooO0O0);
        } else {
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(abstractC28485OooOo00, AbstractC28485OooOo00.OooO00o.f100930OooO00o)) {
                throw new C32442OooOO0o();
            }
            Context contextRequireContext2 = baseGetPhoneVerificationFragment.requireContext();
            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
            String string2 = baseGetPhoneVerificationFragment.getString(R.string.network_error);
            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
            C25206OooO0Oo.OooO0oO(contextRequireContext2, string2);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
