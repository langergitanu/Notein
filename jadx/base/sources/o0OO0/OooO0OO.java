package o0OO0;

import kotlin.coroutines.Continuation;
import o0000oOO.C24334OooO0O0;
import o0000oOO.C24340OooO0oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.analytics.AnalyticsRepoImpl$statsEventCount$2", m80623f = "AnalyticsRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C26436OooO0Oo f90812OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f90813OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(C26436OooO0Oo c26436OooO0Oo, Continuation continuation) {
        super(2, continuation);
        this.f90812OooOo = c26436OooO0Oo;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        OooO0OO oooO0OO = new OooO0OO(this.f90812OooOo, continuation);
        oooO0OO.f90813OooOo0o = obj;
        return oooO0OO;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0OO) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f90813OooOo0o;
        this.f90812OooOo.getClass();
        Long l = (Long) c24334OooO0O0.OooO0OO(C24340OooO0oo.OooO0Oo("palm_detection_of_double_tap"));
        c24334OooO0O0.OooO0oo(C24340OooO0oo.OooO0Oo("palm_detection_of_double_tap"), new Long((l != null ? l.longValue() : 0L) + 1));
        return C32460OooOooO.f116667OooO00o;
    }
}
