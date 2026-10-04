package o0Oo0ooo;

import com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0Oo0ooo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$observeCountryCodeChanges$2", m80623f = "BaseGetPhoneVerificationFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28470OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BaseGetPhoneVerificationFragment f100867OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f100868OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28470OooO0o0(BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment, Continuation<? super C28470OooO0o0> continuation) {
        super(2, continuation);
        this.f100867OooOo = baseGetPhoneVerificationFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28470OooO0o0 c28470OooO0o0 = new C28470OooO0o0(this.f100867OooOo, continuation);
        c28470OooO0o0.f100868OooOo0o = obj;
        return c28470OooO0o0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
        return ((C28470OooO0o0) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        String str = (String) this.f100868OooOo0o;
        BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment = this.f100867OooOo;
        baseGetPhoneVerificationFragment.OooOoO().setCountryCode("+" + str);
        ((C28479OooOOOo) baseGetPhoneVerificationFragment.f72104OooOoO0.getValue()).OooO0o0(BaseGetPhoneVerificationFragment.OooOooo(baseGetPhoneVerificationFragment.OooOoO().getText()));
        return C32460OooOooO.f116667OooO00o;
    }
}
