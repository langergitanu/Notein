package o0OO00o0;

import com.google.gson.Gson;
import com.orion.notein.domain.models.foundation.RatioPointF;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0000oOO.C24334OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0OO00o0.o000o00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.GlobalSettingRepoImpl$savePositionBias$2", m80623f = "GlobalSettingRepoImpl.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C26563o000o00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractC24338OooO0o0.OooO00o<String> f91553OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f91554OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ RatioPointF f91555OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C26577o000oo0O f91556OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26563o000o00o(AbstractC24338OooO0o0.OooO00o<String> oooO00o, C26577o000oo0O c26577o000oo0O, RatioPointF ratioPointF, Continuation<? super C26563o000o00o> continuation) {
        super(2, continuation);
        this.f91553OooOo = oooO00o;
        this.f91556OooOoO0 = c26577o000oo0O;
        this.f91555OooOoO = ratioPointF;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C26563o000o00o c26563o000o00o = new C26563o000o00o(this.f91553OooOo, this.f91556OooOoO0, this.f91555OooOoO, continuation);
        c26563o000o00o.f91554OooOo0o = obj;
        return c26563o000o00o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((C26563o000o00o) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        ((C24334OooO0O0) this.f91554OooOo0o).OooO0oO(this.f91553OooOo, ((Gson) this.f91556OooOoO0.f91600OooO0OO.getValue()).toJson(this.f91555OooOoO));
        return C32460OooOooO.f116667OooO00o;
    }
}
