package o0OO0Ooo;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OO0Ooo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.google.GoogleDriveSessionManager$getSessionIdFlow$1", m80623f = "GoogleDriveSessionManager.kt", m80624l = {120}, m80625m = "invokeSuspend")
public final class C26768OooOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super AbstractC24338OooO0o0>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26773Oooo0 f92561OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f92562OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26768OooOoo(C26773Oooo0 c26773Oooo0, Continuation<? super C26768OooOoo> continuation) {
        super(2, continuation);
        this.f92561OooOo = c26773Oooo0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C26768OooOoo(this.f92561OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super AbstractC24338OooO0o0> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((C26768OooOoo) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f92562OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f92562OooOo0o = 1;
            if (C26773Oooo0.OooO00o(this.f92561OooOo, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
