package o0OOo0oo;

import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24334OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.cloudsync.RecordSyncTimeUseCase$invoke$2", m80623f = "RecordSyncTimeUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class o00000O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ long f97397OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f97398OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(long j, Continuation<? super o00000O0> continuation) {
        super(2, continuation);
        this.f97397OooOo = j;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        o00000O0 o00000o02 = new o00000O0(this.f97397OooOo, continuation);
        o00000o02.f97398OooOo0o = obj;
        return o00000o02;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((o00000O0) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f97398OooOo0o;
        AbstractC24338OooO0o0.OooO00o<Long> oooO00o = o00000O.f97395OooO0O0;
        c24334OooO0O0.OooO0oO(o00000O.f97395OooO0O0, new Long(this.f97397OooOo));
        return C32460OooOooO.f116667OooO00o;
    }
}
