package o0Oo0ooo;

import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: o0Oo0ooo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.BaseGetPhoneVerificationFragment$observeButtonState$2", m80623f = "BaseGetPhoneVerificationFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C28467OooO0OO extends AbstractC32476OooO implements InterfaceC32510OooOOo0<C28478OooOOOO, C28480OooOOo, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ C28480OooOOo f100861OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ C28478OooOOOO f100862OooOo0o;

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final Object invoke(C28478OooOOOO c28478OooOOOO, C28480OooOOo c28480OooOOo, Continuation<? super Boolean> continuation) {
        C28467OooO0OO c28467OooO0OO = new C28467OooO0OO(3, continuation);
        c28467OooO0OO.f100862OooOo0o = c28478OooOOOO;
        c28467OooO0OO.f100861OooOo = c28480OooOOo;
        return c28467OooO0OO.invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        return Boolean.valueOf((C33599OooOo0O.Oooo0o0(this.f100862OooOo0o.f100907OooO00o) || this.f100861OooOo.f100912OooO0OO) ? false : true);
    }
}
